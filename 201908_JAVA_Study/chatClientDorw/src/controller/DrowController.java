package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import model.DrowInfoVO;

public class DrowController implements Initializable {

	@FXML
	private Canvas canDrow;
	@FXML
	private Button btnStrColorRed;
	@FXML
	private Button btnStrColorBlue;
	@FXML
	private Button btnStrColorBlack;
	@FXML
	private TextField txtUserStrName;
	@FXML
	private TextField txtSocketIP;
	@FXML
	private TextField txtSocketPort;
	@FXML
	private Button btnServerEnter;
	@FXML
	private TextArea txtAreaChat;
	@FXML
	private TextField txtFieldUserInput;
	@FXML
	private Button btnUserInput;

	ObservableList<DrowInfoVO> data;

	static ArrayList<DrowInfoVO> arPt = new ArrayList<DrowInfoVO>();
	
	private DrowInfoDAO drowInfoDAO;
	static boolean down = false;
	static int color = 0;

	/* 통신관련 */

	Socket socket;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		txtUserStrName.setPromptText("Enter your name!");

		txtSocketIP.setText("localhost");
		txtSocketPort.setText("9876");

		txtAreaChat.setEditable(false);
		txtFieldUserInput.setDisable(true);

		txtFieldUserInput.setOnAction(event -> {
			send(txtUserStrName.getText() + " : " + txtFieldUserInput.getText() + "\n");
			txtFieldUserInput.setText("");
			txtFieldUserInput.requestFocus();
		});

		btnUserInput.setText("Send");
		btnUserInput.setDisable(true);

		btnUserInput.setOnAction(event -> {
			send(txtUserStrName.getText() + " : " + txtFieldUserInput.getText() + "\n");
			txtFieldUserInput.setText("");
			txtFieldUserInput.requestFocus();
		});

		btnServerEnter.setText("Enter");
		btnServerEnter.setOnAction(event -> {
			if (btnServerEnter.getText().equals("Enter")) {
				int port = 9876;
				try {
					port = Integer.parseInt(txtSocketPort.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
				startClient(txtSocketIP.getText(), port);
				Platform.runLater(() -> {
					txtAreaChat.appendText("[Chat Start] \n");
				});

				btnServerEnter.setText("Exit");
				txtFieldUserInput.setDisable(false);
				btnUserInput.setDisable(false);
				txtFieldUserInput.requestFocus();
			} else {
				stopClient();
				Platform.runLater(() -> {
					txtAreaChat.appendText("[Chat Out] \n");
				});
				btnServerEnter.setText("Enter");
				txtFieldUserInput.setDisable(true);
				btnUserInput.setDisable(true);

			}
		});
	}

	public void startClient(String IP, int port) {
		Thread thread = new Thread() {
			public void run() {
				try {
					socket = new Socket(IP, port);
					recive();
				} catch (Exception e) {
					e.printStackTrace();
					if (!socket.isClosed()) {
						System.out.println("server accesse fail.");
						stopClient();
						Platform.exit();
					}

				}

			}

		};
		thread.start();

	}

	
	/* 메세지를 받아서 처리하는 함
	 * 
	 * */
	public void recive() {
		while (true) {
			try {
				InputStream in = socket.getInputStream();
				byte[] buffer = new byte[512];
				int length = in.read(buffer);
				if (length == -1)
					throw new IOException();
				String message = new String(buffer, 0, length, "UTF-8");
				Platform.runLater(() -> {
					if(message.startsWith(txtUserStrName.getText() + " : "+"XY")) {
						txtAreaChat.appendText("좌표얏!!\n");
					} else if(message.startsWith("NoDrow")) {
						txtAreaChat.appendText("안 그릴꺼얏!!\n");
						String drowMessage = message;
						String[] array = drowMessage.split(",");
						double x = Double.parseDouble(array[1]);
						double y = Double.parseDouble(array[2]);
						boolean draw = Boolean.parseBoolean(array[3]);
						int color = Integer.parseInt(array[4]);
						
						txtAreaChat.appendText("그린거얏얏!! \n"+x+", "+y+", "+draw+", "+color);
						DrawCanvas drow = new DrawCanvas(arPt);
						GraphicsContext g = canDrow.getGraphicsContext2D();
						arPt.add(new DrowInfoVO(x, y, draw, color));
						drow.paint(g);
					} else if(message.startsWith("Drow")){
						txtAreaChat.appendText("그릴꺼얏!!\n");
						String drowMessage = message;
						String[] array = drowMessage.split(",");
						double x = Double.parseDouble(array[1]);
						double y = Double.parseDouble(array[2]);
//						boolean draw = Boolean.parseBoolean(array[3]);
						boolean draw = true;
						int color = Integer.parseInt(array[4]);
						
						txtAreaChat.appendText("그린거얏얏!! \n"+x+", "+y+", "+draw+", "+color);
						DrawCanvas drow = new DrawCanvas(arPt);
						GraphicsContext g = canDrow.getGraphicsContext2D();
						arPt.add(new DrowInfoVO(x, y, draw, color));
						drow.paint(g);
					} else {
						txtAreaChat.appendText(message);
					}
					
				});
			} catch (Exception e) {
				stopClient();
				break;
			}
		}

	}

	public void send(String message) {
		Thread thread = new Thread() {
			public void run() {
				try {
					OutputStream os = socket.getOutputStream();
					byte[] buffer = message.getBytes("UTF-8");
					os.write(buffer);
					os.flush();

				} catch (Exception e) {
					stopClient();
				}
			}
		};
		thread.start();
	}

	public void stopClient() {
		try {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/* 데이터베이스 관련 */

	public void totalList() {
		Object[][] totalData;
		ArrayList<String> title;

		ArrayList<DrowInfoVO> list = null;

		DrowInfoVO drowInfoVO = null;
		DrowInfoDAO drowInfoDAO = new DrowInfoDAO();

		list = drowInfoDAO.getDrowTotal();

		if (list == null) {
			AlertDisplay.alertDisplay(1, "Error : DB ", "DB null", "Check");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			drowInfoVO = list.get(i);
			data.add(drowInfoVO);
		}
	}

	/* 그리기 관련 */
	public void handlerCuoserAction(MouseEvent event) {

		if (event.getEventType() == MouseEvent.MOUSE_CLICKED) {
			System.out.println("X : " + event.getX() + ", Y : " + event.getY() + " No Dorw " + color);
			send("NoDrow,"+event.getX() + "," + event.getY() + ","+0+","+color);
		}
		if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
			txtAreaChat.appendText("X : " + event.getX() + ", Y : " + event.getY() + " Dorw " + color +"\n");
			send("Drow,"+event.getX() + "," + event.getY() + ","+1+","+color);
		}
		if (event.getEventType() == MouseEvent.MOUSE_RELEASED) {
			System.out.println("X : " + event.getX() + ", Y : " + event.getY() + " No Dorw " + color);
		}
	}

	public void totalListSaveDB(double x, double y, boolean draw, int color) {
		try {
			DrowInfoVO dvo = new DrowInfoVO(x, y, draw, color);
			
			drowInfoDAO = new DrowInfoDAO(); // 데이타베이스 테이블에 입력값을 입력하는 함수.
			int count = drowInfoDAO.getDrowRegiste(dvo);
			if (count != 0) {
				data.add(dvo);
				totalList();
			} else {
				throw new Exception("데이타 베이스 등록실패");
			}
			AlertDisplay.alertDisplay(5, "등록성공", "테이블등록성공", "축하축하~!");
			txtUserStrName.setText("등록성공");
		} catch (Exception e2) {
			// AlertDisplay.alertDisplay(1, "등록실패", "합계, 평균을 확인해주세요!", e2.toString());
			txtUserStrName.setText("등록실패");
			return;
		}

	}

	public void handlerBtnColorRedAction(MouseEvent event) {
		color = 1;
	}

	public void handlerBtnColorBlueAction(MouseEvent event) {
		color = 2;
	}

	public void handlerBtnColorBlackAction(MouseEvent event) {
		color = 3;
	}

}

class DrawCanvas extends Canvas {
	ArrayList<DrowInfoVO> arPt;

	DrawCanvas(ArrayList<DrowInfoVO> arPt) {
		this.arPt = arPt;
	}

	public void paint(GraphicsContext g) {
		g.setLineWidth(2.0);

		for (int i = 0; i < arPt.size() - 1; i++) {
			if (arPt.get(i).isDraw()) {
				int color = arPt.get(i).getDBColor();
				Color penColor = arPt.get(i).getColor(color);
				g.setStroke(penColor);
				g.strokeLine(arPt.get(i).getX(), arPt.get(i).getY(), arPt.get(i + 1).getX(), arPt.get(i + 1).getY());
			}
		}
	}
}

//public class DrowController extends Application implements Initializable {
//
//	@FXML
//	private Canvas canDrow;
//	@FXML
//	private Button btnStrColorRed;
//	@FXML
//	private Button btnStrColorBlue;
//	@FXML
//	private Button btnStrColorBlack;
//	@FXML
//	private TextField txtUserStrName;
//	@FXML
//	private TextField txtSocketIP;
//	@FXML
//	private TextField txtSocketPort;
//	@FXML
//	private Button btnServerEnter;
//	@FXML
//	private TextArea txtAreaChat;
//	@FXML
//	private TextField txtFieldUserInput;
//	@FXML
//	private Button btnUserInput;
//
//	static ArrayList<VertexClass> arPt = new ArrayList<VertexClass>();
//	static boolean down = false;
//	static Color color = Color.BLACK;
//
//	Socket socket;
//
//	@Override
//	public void initialize(URL location, ResourceBundle resources) {
//
//		txtUserStrName.setPromptText("Enter your name!");
//
//		txtSocketIP.setText("localhost");
//		txtSocketPort.setText("9876");
//
//		txtAreaChat.setEditable(false);
//		txtFieldUserInput.setDisable(true);
//
//		txtFieldUserInput.setOnAction(event -> {
//			send(txtUserStrName.getText() + " : " + txtFieldUserInput.getText() + "\n");
//			txtFieldUserInput.setText("");
//			txtFieldUserInput.requestFocus();
//		});
//
//		btnUserInput.setText("Send");
//		btnUserInput.setDisable(true);
//
//		btnUserInput.setOnAction(event -> {
//			send(txtUserStrName.getText() + " : " + txtFieldUserInput.getText() + "\n");
//			txtFieldUserInput.setText("");
//			txtFieldUserInput.requestFocus();
//		});
//
//		btnServerEnter.setText("Enter");
//		btnServerEnter.setOnAction(event -> {
//			if (btnServerEnter.getText().equals("Enter")) {
//				int port = 9876;
//				try {
//					port = Integer.parseInt(txtSocketPort.getText());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				startClient(txtSocketIP.getText(), port);
//				Platform.runLater(() -> {
//					txtAreaChat.appendText("[Chat Start] \n");
//				});
//
//				btnServerEnter.setText("Exit");
//				txtFieldUserInput.setDisable(false);
//				btnUserInput.setDisable(false);
//				txtFieldUserInput.requestFocus();
//			} else {
//				stopClient();
//				Platform.runLater(() -> {
//					txtAreaChat.appendText("[Chat Out] \n");
//				});
//				btnServerEnter.setText("Enter");
//				txtFieldUserInput.setDisable(true);
//				btnUserInput.setDisable(true);
//
//			}
//		});
//	}
//
//	public void startClient(String IP, int port) {
//		Thread thread = new Thread() {
//			public void run() {
//				try {
//					socket = new Socket(IP, port);
//					recive();
//				} catch (Exception e) {
//					e.printStackTrace();
//					if (!socket.isClosed()) {
//						System.out.println("server accesse fail.");
//						stopClient();
//						Platform.exit();
//					}
//
//				}
//
//			}
//
//		};
//		thread.start();
//
//	}
//
//	public void recive() {
//		while (true) {
//			try {
//				InputStream in = socket.getInputStream();
//				byte[] buffer = new byte[512];
//				int length = in.read(buffer);
//				if (length == -1)
//					throw new IOException();
//				String message = new String(buffer, 0, length, "UTF-8");
//				Platform.runLater(() -> {
//					txtAreaChat.appendText(message);
//				});
//			} catch (Exception e) {
//				stopClient();
//				break;
//			}
//		}
//
//	}
//
//	public void send(String message) {
//		Thread thread = new Thread() {
//			public void run() {
//				try {
//					OutputStream os = socket.getOutputStream();
//					byte[] buffer = message.getBytes("UTF-8");
//					os.write(buffer);
//					os.flush();
//
//				} catch (Exception e) {
//					stopClient();
//				}
//			}
//		};
//		thread.start();
//	}
//
//	public void stopClient() {
//		try {
//			if (socket != null && !socket.isClosed()) {
//				socket.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void handlerCuoserAction(MouseEvent event) {
//		DrawCanvas drow = new DrawCanvas(arPt);
//		GraphicsContext g = canDrow.getGraphicsContext2D();
//
//		if (event.getEventType() == MouseEvent.MOUSE_CLICKED) {
//			System.out.println("Hey!");
//			System.out.println("X : " + event.getX() + ", Y : " + event.getY() + " No Dorw");
//			arPt.add(new VertexClass(event.getX(), event.getY(), false, color));
//		}
//		if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
//			System.out.println("Hey!");
//			System.out.println("X : " + event.getX() + ", Y : " + event.getY() + " Dorw");
//			arPt.add(new VertexClass(event.getX(), event.getY(), true, color));
//
//		}
//		drow.paint(g);
//		if (event.getEventType() == MouseEvent.MOUSE_RELEASED) {
//			System.out.println("Hey!");
//			System.out.println("X : " + event.getX() + ", Y : " + event.getY() + " No Dorw");
//			arPt.add(new VertexClass(event.getX(), event.getY(), false, color));
//
//		}
//		drow.paint(g);
//	}
//
//	public void handlerBtnColorRedAction(MouseEvent event) {
//		color = Color.RED;
//	}
//
//	public void handlerBtnColorBlueAction(MouseEvent event) {
//		color = Color.BLUE;
//	}
//
//	public void handlerBtnColorBlackAction(MouseEvent event) {
//		color = Color.BLACK;
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//
//	}
//
//}
//
//class DrawCanvas extends Canvas {
//	ArrayList<VertexClass> arPt;
//
//	DrawCanvas(ArrayList<VertexClass> arPt) {
//		this.arPt = arPt;
//	}
//
//	public void paint(GraphicsContext g) {
//		g.setLineWidth(2.0);
//
//		for (int i = 0; i < arPt.size() - 1; i++) {
//			if (arPt.get(i).draw) {
//				g.setStroke(arPt.get(i).color);
//				g.strokeLine(arPt.get(i).x, arPt.get(i).y, arPt.get(i + 1).x, arPt.get(i + 1).y);
////					 System.out.println(arPt.get(i).x+" "+arPt.get(i).y+" "+arPt.get(i+1).x+" "+arPt.get(i+1).y);
//			}
//		}
//	}
//}