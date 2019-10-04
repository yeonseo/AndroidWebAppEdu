package controller;

import java.net.URL;
import java.util.ResourceBundle;

import model.Student;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RootController implements Initializable {
	@FXML
	private TableView<Student> tableView = new TableView<>();
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtLevel;
	@FXML
	private TextField txtBan;
	@FXML
	private Button btnTotal;
	@FXML
	private Button btnAvg;
	@FXML
	private Button btnInit;
	@FXML
	private Button btnOk;
	@FXML
	private Button btnExit;
	@FXML
	private TextField txtKo;
	@FXML
	private TextField txtEng;
	@FXML
	private TextField txtMath;
	@FXML
	private TextField txtSic;
	@FXML
	private TextField txtSoc;
	@FXML
	private TextField txtMusic;
	@FXML
	private TextField txtTotal;
	@FXML
	private TextField txtAvg;

	Student student = new Student();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 버튼 초기화
		txtTotal.setEditable(false);
		txtAvg.setEditable(false);
		btnAvg.setDisable(true);
		btnOk.setDisable(true);

		ObservableList<Student> data = FXCollections.observableArrayList();
		// 테이블 설정
		tableView.setEditable(true);
		
		TableColumn colName = new TableColumn("성명");
		colName.setMaxWidth(70);
		colName.setStyle("-fx-allignment: CENTER");
		colName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn colLevel = new TableColumn("학년");
		colLevel.setMaxWidth(40);
		colLevel.setCellValueFactory(new PropertyValueFactory<>("level"));
		
		TableColumn colBan = new TableColumn("반");
		colBan.setMaxWidth(40);
		colBan.setCellValueFactory(new PropertyValueFactory<>("ban"));

		TableColumn colKorean = new TableColumn("국어");
		colKorean.setMaxWidth(40);
		colKorean.setCellValueFactory(new PropertyValueFactory<>("korean"));
		
		TableColumn colEnglish = new TableColumn("영어");
		colEnglish.setMaxWidth(40);
		colEnglish.setCellValueFactory(new PropertyValueFactory<>("english"));
		
		TableColumn colMath = new TableColumn("수학");
		colMath.setMaxWidth(40);
		colMath.setCellValueFactory(new PropertyValueFactory<>("math"));
		
		TableColumn colSic = new TableColumn("과학");
		colSic.setMaxWidth(40);
		colSic.setCellValueFactory(new PropertyValueFactory<>("sic"));
		
		TableColumn colSoc = new TableColumn("사회");
		colSoc.setMaxWidth(40);
		colSoc.setCellValueFactory(new PropertyValueFactory<>("soc"));
		
		TableColumn colMusic = new TableColumn("음악");
		colMusic.setMaxWidth(40);
		colMusic.setCellValueFactory(new PropertyValueFactory<>("music"));
		
		TableColumn colTotal = new TableColumn("총점");
		colTotal.setMaxWidth(50);
		colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
		
		TableColumn colAvg = new TableColumn("평균");
		colAvg.setMaxWidth(70);
		colAvg.setCellValueFactory(new PropertyValueFactory<>("avg"));

		// 테이블에 데이터 추가
		tableView.setItems(data);
		tableView.getColumns().addAll(colName, colLevel, colBan, colKorean, colEnglish, colMath, colSic, colSoc, colMusic, colTotal, colAvg);

                // 총점 버튼 이벤트 설정
		btnTotal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				try {
					handlerBtnTotalAction(event);
				} catch (NumberFormatException e) {
					System.out.println("점수를 입력하시오");
				}
			}
		});
                
                // 확인 버튼 이벤트 설정(람다식)
		btnOk.setOnAction(event -> {
			data.add(new Student(txtName.getText(), txtLevel.getText(), txtBan.getText(), txtKo.getText(), txtEng.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(), txtTotal.getText(), txtAvg.getText()));
			txtName.setEditable(true);
			txtLevel.setEditable(true);
			txtBan.setEditable(true);
			txtKo.setEditable(true);
			txtEng.setEditable(true);
			txtMath.setEditable(true);
			txtSic.setEditable(true);
			txtSoc.setEditable(true);
			txtMusic.setEditable(true);
			handlerBtnInitActoion(event);
		});

                // 이벤트 리스너 등록
		btnAvg.setOnAction(event -> handlerBtnAvgActoion(event));
		btnInit.setOnAction(event -> handlerBtnInitActoion(event));
		// btnOk.setOnAction(event -> handlerBtnOkActoion(event));
		btnExit.setOnAction(event -> handlerBtnExitActoion(event));
	}

        // 종료 버튼 메소드
	public void handlerBtnExitActoion(ActionEvent event) {
		// TODO Auto-generated method stub
		Platform.exit();
	}

        // 초기화 버튼 메소드
	public void handlerBtnInitActoion(ActionEvent event) {
		// TODO Auto-generated method stub
		txtName.clear();
		txtLevel.clear();
		txtBan.clear();
		txtKo.clear();
		txtEng.clear();
		txtMath.clear();
		txtSic.clear();
		txtSoc.clear();
		txtMusic.clear();
		txtTotal.clear();
		txtAvg.clear();
		btnTotal.setDisable(false);
		btnOk.setDisable(true);
	}

        // 총합 버튼 메소드
	public void handlerBtnTotalAction(ActionEvent event) {
		// TODO Auto-generated method stub
		int korean = Integer.parseInt(txtKo.getText());
		int english = Integer.parseInt(txtEng.getText());
		int math = Integer.parseInt(txtMath.getText());
		int sic = Integer.parseInt(txtSic.getText());
		int soc = Integer.parseInt(txtSoc.getText());
		int music = Integer.parseInt(txtMusic.getText());
		int total;

		total = korean + english + math + sic + soc + music;

		student.setName(txtName.getText());
		student.setLevel(txtLevel.getText());
		student.setBan(txtBan.getText());
		student.setKorean(txtKo.getText());
		student.setEnglish(txtEng.getText());
		student.setMath(txtMath.getText());
		student.setSic(txtSic.getText());
		student.setSoc(txtSoc.getText());
		student.setMusic(txtMusic.getText());

		student.setTotal(total + "");
		txtTotal.setText(student.getTotal());
		btnAvg.setDisable(false);
		btnTotal.setDisable(true);
	}

        // 평균 버튼 메소드
	public void handlerBtnAvgActoion(ActionEvent event) {
		// TODO Auto-generated method stub
		student.setAvg((Integer.parseInt(student.getTotal()) / 6.0) + "");
		txtAvg.setText(student.getAvg() + "");
		
		txtName.setEditable(false);
		txtLevel.setEditable(false);
		txtBan.setEditable(false);
		txtKo.setEditable(false);
		txtEng.setEditable(false);
		txtMath.setEditable(false);
		txtSic.setEditable(false);
		txtSoc.setEditable(false);
		txtMusic.setEditable(false);
		
		btnAvg.setDisable(true);
		btnOk.setDisable(false);
	}
}
