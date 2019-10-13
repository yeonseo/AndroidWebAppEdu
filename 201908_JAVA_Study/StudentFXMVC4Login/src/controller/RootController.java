package Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Student;
import model.StudentVO;

public class RootController implements Initializable {

	@FXML
	private TextField txtName;
	@FXML
	private ComboBox<String> cbYear;
	@FXML
	private ToggleGroup genderGroup;
	@FXML
	private RadioButton rbMale;
	@FXML
	private RadioButton rbFemale;
//	@FXML private TextField txtLevel;
	@FXML
	private TextField txtBan;
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
	private Button btnTotalList;

	// �˻���� �߰�
	@FXML
	private TextField txtSearch;
	@FXML
	private Button btnSearch;
	// ����,������ư �߰�
	@FXML
	private Button btnDelete;
	@FXML
	private Button btnEdit;
	// �����Ҷ��� ��ư ����
	private boolean editDelete = false;
	// ��íƮ ��ư ����
	@FXML
	private Button btnBarChart;
	@FXML
	private HBox imageBox;
	@FXML
	private Button btnImageFile;
	@FXML
	private DatePicker dpDate;
	@FXML
	private TextField txtDay;
	@FXML
	private ImageView imageView;

	// ���̺� �並 ���������� ��ġ ���� ��ü���� ������ �� �ִ� ������ ����.
	private int selectedIndex; // ��ġ��
	private ObservableList<StudentVO> selectStudent; // ��ü��
	@FXML
	private TableView<StudentVO> tableView;
	ObservableList<StudentVO> data; // ���̺�信 �����ֱ����ؼ� ����� ����Ÿ.
	private StudentDAO studentDAO;

	private String selectFileName = ""; // 이미지 파일명
	private String localUrl = ""; // 이미지 파일 경로
	private Image localImage;
	private File selectedFile = null;

	// 이미지 처리
	// 이미지 저장할 폴더를 매개변수로 파일 객체 생성
	private File dirSave = new File("/Users/nambbo/Documents/images");
	// 이미지 불러올 파일을 저장할 파일 객체 선언
	private File file = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// 1.��ư �ʱ�ȭ(����, �ʱ�ȭ,���� <->���x,���x) ��������ؽ�Ʈx, ��հ�� �ؽ�Ʈx
		buttonInitSetting(false, true, false, true, false, true, true);
		// 1.2 �޺��ڽ� �ʱ�ȭ
		cbYear.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6"));
		// 2.���̺������(���������˼��� ����)
		tableViewSetting();
		// 3.������ư�� �������� ��չ�ư Ȱ��ȭ �� 6���� ������ ���ϰ� �����ʵ忡 ������´�.
		btnTotal.setOnAction(e -> {
			handlerBtnTotalAction(e);
		});
		// 4.��չ�ư�� �������� ������ư��Ȱ��,��չ�ư��Ȱ��,���Ȱ��ȭ,����ؽ�Ʈ �ʵ� ��Ȱ��ȭ
		btnAvg.setOnAction(e -> {
			handlerBtnAvgActoion(e);
		});
		// 5.����� ������ �ʱ�ȭ ��ư �������� 1�� ��ư�ʱ�ȭ��,�ؽ�Ʈ�ʵ带 ��� Ȱ��ȭ,
		btnInit.setOnAction(e -> {
			handlerBtnInitActoion(e);
		});
		// 6.��Ϲ�ư�� �������� ���̺� ����ϰ�, ��簪�� �ʱ�ȭ�Ѵ�.
		btnOk.setOnAction(e -> {
			handlerBtnOkActoion(e);
		});
		// 7.�˻���ư�� �������� ���̺�信�� ã����
		btnSearch.setOnAction(e -> {
			handlerBtnSearchActoion(e);
		});
		// 8.������ư �������� ���̺� �信�� �������
		btnDelete.setOnAction(e -> {
			handlerBtnDeleteActoion(e);
		});
		// 9.���̺�並 �������� �߻��Ǵ� �̺�Ʈ ó�����
		tableView.setOnMousePressed(e -> {
			handlerTableViewPressedActoion(e);
		});
		// 10. ������ư�� �������� �̺�Ʈ ó�����
		btnEdit.setOnAction(e -> {
			handlerBtnEditActoion(e);
		});
		// 11.�����ư
		btnExit.setOnAction(e -> {
			Platform.exit();
		});
		// 12.테이블뷰 마우스를 더블클릭시 선택된 내용을 중심으로 파이차트
		tableView.setOnMouseClicked(e -> {
			handlerPieChartActoion(e);
		});
		// 13.바차트 처리
		btnBarChart.setOnAction(e -> {
			handlerBtnBarChartAction(e);
		});
		// 14. 학생 전체 정보
		// 14.테이블 뷰에 데이타베이스값을 읽어서 테이블뷰에 가져온다.
		totalList();
		// 15.전체 리스트를 누르면 데이터베이스값가져오기
		btnTotalList.setOnAction(e -> {
			handlerBtnTotalListAction(e);
		});
		// 17.날짜 선택
		dpDate.setOnAction(e -> {
			handlerDatePickerAction(e);
		});
		// 18. 이미지 버튼선택창.
		btnImageFile.setOnAction(event -> handlerBtnImageFileActoion(event)); // 이미지선택창

		imageViewInit();

		// 디버깅을 위한 테스트
		txtName.setText("남연");
		cbYear.setValue("3");
//		txtLevel.setText("3");
		txtBan.setText("5");
		rbFemale.setSelected(true);
		txtKo.setText("50");
		txtEng.setText("60");
		txtMath.setText("70");
		txtSic.setText("80");
		txtSoc.setText("90");
		txtMusic.setText("80");
	}

	public void tableViewSetting() {
		// 2.���̺� ���� ���̸���Ʈ ����
		data = FXCollections.observableArrayList();

		// 2-1���̺� ���� ���̺�並 �������ϰ� ����
		tableView.setEditable(false);

		// 2-2 ���̺�信 ���ڸ� �Է��ϵ��� ����
		DecimalFormat format = new DecimalFormat("###");
		// ���� �Է½� ���� ���� �̺�Ʈ ó��
		txtKo.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		// ***********************************
		txtEng.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}

			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		txtMath.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}

			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		txtSic.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}

			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		txtSoc.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}

			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		txtMusic.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}

			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));

		// *******************

		// 2.-3 ���̺��� �÷�����
		// 테이블 뷰 컬럼이름 설정
		TableColumn colNo = new TableColumn("NO.");
		colNo.setMaxWidth(40);
		colNo.setStyle("-fx-allignment: CENTER");
		colNo.setCellValueFactory(new PropertyValueFactory<>("no"));

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

		TableColumn colGender = new TableColumn("성별");
		colGender.setMaxWidth(40);
		colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));

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

		TableColumn colRegister = new TableColumn("등록일");
		colRegister.setMinWidth(90);
		colRegister.setCellValueFactory(new PropertyValueFactory<>("register"));

		TableColumn colImageFileName = new TableColumn("이미지");
		colImageFileName.setMinWidth(260);
		colImageFileName.setCellValueFactory(new PropertyValueFactory<>("filename"));

		// 2-3
		tableView.setItems(data);
		tableView.getColumns().addAll(colNo, colName, colLevel, colBan, colGender, colKorean, colEnglish, colMath,
				colSic, colSoc, colMusic, colTotal, colAvg);

		// 전체 리스트
		btnTotalList.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				try {
					data.removeAll(data);
					// 학생 전체 정보
					totalList();
				} catch (Exception e) {
				}
			}
		});
	}

	public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
		// 1.��ư�ʱ�ȭ
		btnTotal.setDisable(b);
		btnAvg.setDisable(c);
		btnInit.setDisable(d);
		btnOk.setDisable(e);
		btnExit.setDisable(f);
		btnEdit.setDisable(g);
		btnDelete.setDisable(h);

		btnImageFile.setDisable(true);

		txtTotal.setDisable(true);
		txtAvg.setDisable(true);

		dpDate.setValue(LocalDate.now());

	}

	public void handlerBtnTotalAction(ActionEvent e) {

		try {

			int korean = Integer.parseInt(txtKo.getText());
			int english = Integer.parseInt(txtEng.getText());
			int math = Integer.parseInt(txtMath.getText());
			int sic = Integer.parseInt(txtSic.getText());
			int soc = Integer.parseInt(txtSoc.getText());
			int music = Integer.parseInt(txtMusic.getText());
			if ((korean <= 100) && (english <= 100) && (math <= 100) && (sic <= 100) && (soc <= 100)
					&& (music <= 100)) {
				int total = korean + english + math + sic + soc + music;
				txtTotal.setText(String.valueOf(total));
				btnAvg.setDisable(false);

			} else {
				throw new Exception("��ȿ�Ѱ� ����");
			}
		} catch (Exception e2) {
			alertDisplay(1, "�հ����!", "������(��ȿ�� ���� ������ �ʾҽ��ϴ�.)", e2.toString());
		}
	}

	public void handlerBtnAvgActoion(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt(txtTotal.getText()) / 6.0));
		// 1.��ư�ʱ�ȭ(����x,���x,�ʱ�ȭ,���,����,����x,����x)
		buttonInitSetting(true, true, false, false, false, true, true);
		// 2.�ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
		textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);

	}

	public void handlerBtnInitActoion(ActionEvent e) {
		// 1.��ư �ʱ�ȭ(����, �ʱ�ȭ,���� <->���x,���x,����x,����x) ��������ؽ�Ʈx, ��հ��
		// �ؽ�Ʈx
		buttonInitSetting(false, true, false, true, false, true, true);
		// 2.�ؽ�Ʈ�ʵ� Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
		textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
		// 3.��� �ʵ� ���� �ʱ�ȭ
		cbYear.getSelectionModel().clearSelection();
		txtName.clear();
		genderGroup.selectToggle(null);
//				txtLevel.clear();
		txtBan.clear();
		txtKo.clear();
		txtEng.clear();
		txtMath.clear();
		txtSic.clear();
		txtSoc.clear();
		txtMusic.clear();
		txtTotal.clear();
		txtAvg.clear();

	}

	public void handlerBtnOkActoion(ActionEvent e) {
		// ������ ����� �ִ��� Ȯ��!
		try {
			String fileName = imageSave(selectedFile);

			if (txtTotal.getText().equals("") || txtAvg.getText().equals(" ")) {
				throw new Exception();
			} else {
				StudentVO svo = new StudentVO(txtName.getText(), cbYear.getSelectionModel().getSelectedItem(),
						txtBan.getText(), genderGroup.getSelectedToggle().getUserData().toString(),
						Integer.parseInt(txtKo.getText().trim()), Integer.parseInt(txtEng.getText().trim()),
						Integer.parseInt(txtMath.getText().trim()), Integer.parseInt(txtSic.getText().trim()),
						Integer.parseInt(txtSoc.getText().trim()), Integer.parseInt(txtMusic.getText().trim()),
						Integer.parseInt(txtTotal.getText().trim()), Double.parseDouble(txtAvg.getText().trim()), null,
						fileName);

				// ���̺�信 ������ ����!
				if (editDelete == true) {
					data.remove(selectedIndex);
					data.add(selectedIndex, svo);
					editDelete = false;
				} else {
					studentDAO = new StudentDAO(); // 데이타베이스 테이블에 입력값을 입력하는 함수.
					int count = studentDAO.getStudentregiste(svo);// <<< ����Ÿ���̽� ���̺� �Է°��� �Է��ϴ� �Լ�.
					if (count != 0) {
						data.add(svo);
						totalList();
						imageViewInit();
					} else {
						throw new Exception("데이타 베이스 등록실패");
					}
				}
				alertDisplay(5, "등록성공", "테이블등록성공", "축하축하~!");
			}
		} catch (Exception e2) {
			alertDisplay(1, "등록실패", "합계, 평균을 확인해주세요!", e2.toString());
			return;
		}
		// �ʱ�ȭ ��ư �������� 1�� ��ư�ʱ�ȭ��,�ؽ�Ʈ�ʵ带 ��� Ȱ��ȭ,
		handlerBtnInitActoion(e);

	}

	public void handlerBtnSearchActoion(ActionEvent e) {
		try {
			ArrayList<StudentVO> list = new ArrayList<StudentVO>();
			StudentDAO studentDAO = new StudentDAO();
			list = studentDAO.getStudentCheck(txtSearch.getText());

			if (list == null) {
				throw new Exception("검색오류");
			}

			data.removeAll(data);

			for (StudentVO svo : list) {
				data.add(svo);
			}
		} catch (Exception e1) {
			alertDisplay(1, "이름오류", "이름검색 오류", "정확한 이름 입력 요망!");
		}

	}

	public void handlerTableViewPressedActoion(MouseEvent e) {
		// �������� ��ġ�� �ش�� ��ü�� ������.
		try {
			editDelete = true;
			buttonInitSetting(true, true, true, true, false, false, false); // �ʱ�ȭ
			selectedIndex = tableView.getSelectionModel().getSelectedIndex();
			selectStudent = tableView.getSelectionModel().getSelectedItems();
			// �������� ���̺� �ִ� ���� �����ͼ� ����Ÿ�ʵ忡 ����ִ´�.
			txtName.setText(selectStudent.get(0).getName());
			cbYear.setValue(selectStudent.get(0).getLevel());
			txtBan.setText(selectStudent.get(0).getBan());
			if (selectStudent.get(0).getGender().equals("����")) {
				rbMale.setSelected(true);
				rbFemale.setSelected(false);
			} else {
				rbMale.setSelected(false);
				rbFemale.setSelected(true);
			}
			txtKo.setText(String.valueOf(selectStudent.get(0).getKorean()));
			txtEng.setText(String.valueOf(selectStudent.get(0).getEnglish()));
			txtMath.setText(String.valueOf(selectStudent.get(0).getMath()));
			txtSoc.setText(String.valueOf(selectStudent.get(0).getSoc()));
			txtSic.setText(String.valueOf(selectStudent.get(0).getSic()));
			txtMusic.setText(String.valueOf(selectStudent.get(0).getMusic()));
			txtTotal.setText(String.valueOf(selectStudent.get(0).getTotal()));
			txtAvg.setText(String.valueOf(selectStudent.get(0).getAvg()));

			// 2.�ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
			textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);
		} catch (Exception e2) {
			System.out.println("�߸�����!");
			buttonInitSetting(false, true, false, true, false, true, true);
			editDelete = false;
		}
	}

	// 학생 전체 리스트
	// 14.테이블 뷰에 데이타베이스값을 읽어서 테이블뷰에 가져온다.
	public void totalList() {
		Object[][] totalData;
		ArrayList<String> title;

		ArrayList<StudentVO> list = null;

		StudentVO studentVO = null;
		StudentDAO studentDAO = new StudentDAO();

		list = studentDAO.getStudentTotal();

		if (list == null) {
			DBUtil.alertDisplay(1, "Error : DB ", "DB null", "Check");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			studentVO = list.get(i);
			data.add(studentVO);
		}

//			title = sDao.getColumnName();
//			int columnCount = title.size();
//
//			list = sDao.getStudentTotal();
//			int rowCount = list.size();
//
//			totalData = new Object[rowCount][columnCount];
//
//			for (int index = 0; index < rowCount; index++) {
//				sVo = list.get(index);
//				data.add(sVo);
//			}
	}

	public void handlerBtnDeleteActoion(ActionEvent e) {
		alertDisplay(2, "�������", "�������", "���� �����Ͻðڽ��ϱ�?");

		try {

			StudentDAO studentDAO = new StudentDAO();
			studentDAO.getStudentDelete(selectStudent.get(0).getNo());

			data.removeAll(data);
			totalList();
		} catch (Exception e1) {
			DBUtil.alertDisplay(1, "ERROR", "Del", "check!");
		}
		// 1. 버튼 초기화
		buttonInitSetting(false, true, false, true, false, true, true);
		// 2.텍스트 필드 비활성화
		textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
		editDelete = false;
	}

	// 수정버튼을 눌렀을
	public void handlerBtnEditActoion(ActionEvent e) {
		try {
			// 1.��ư �ʱ�ȭ
			buttonInitSetting(false, true, false, true, false, true, true);
			// 2.�ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
			textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
			// ����ȭ���� �θ���
			Parent editRoot = FXMLLoader.load(getClass().getResource("/View/formedit.fxml"));
			Stage stageDialog = new Stage(StageStyle.UTILITY);
			stageDialog.initModality(Modality.WINDOW_MODAL);
			stageDialog.initOwner(btnOk.getScene().getWindow());
			stageDialog.setTitle("����");
			TextField editName = (TextField) editRoot.lookup("#txtName");
			TextField editYear = (TextField) editRoot.lookup("#txtYear");
			TextField editBan = (TextField) editRoot.lookup("#txtBan");
			TextField editGender = (TextField) editRoot.lookup("#txtGender");
			TextField editKorean = (TextField) editRoot.lookup("#txtKorean");
			TextField editEnglish = (TextField) editRoot.lookup("#txtEnglish");
			TextField editMath = (TextField) editRoot.lookup("#txtMath");
			TextField editSic = (TextField) editRoot.lookup("#txtSic");
			TextField editSoc = (TextField) editRoot.lookup("#txtSoc");
			TextField editMusic = (TextField) editRoot.lookup("#txtMusic");
			TextField editTotal = (TextField) editRoot.lookup("#txtTotal");
			TextField editAvg = (TextField) editRoot.lookup("#txtAvg");
			Button btnCal = (Button) editRoot.lookup("#btnCal");
			Button btnFormAdd = (Button) editRoot.lookup("#btnFormAdd");
			Button btnFormCancel = (Button) editRoot.lookup("#btnFormCancel");
			// 총점과 평균은 수정하지 못하게한다.
			editTotal.setDisable(true);
			editAvg.setDisable(true);
			// 텍스트 에디터로 값을 가져온다.
			editName.setText(selectStudent.get(0).getName());
			editYear.setText(selectStudent.get(0).getLevel());
			editBan.setText(selectStudent.get(0).getBan());
			editGender.setText(selectStudent.get(0).getGender());
			editKorean.setText(String.valueOf(selectStudent.get(0).getKorean()));
			editEnglish.setText(String.valueOf(selectStudent.get(0).getEnglish()));
			editMath.setText(String.valueOf(selectStudent.get(0).getMath()));
			editSic.setText(String.valueOf(selectStudent.get(0).getSic()));
			editSoc.setText(String.valueOf(selectStudent.get(0).getSoc()));
			editMusic.setText(String.valueOf(selectStudent.get(0).getMusic()));
			editTotal.setText(String.valueOf(selectStudent.get(0).getTotal()));
			editAvg.setText(String.valueOf(selectStudent.get(0).getAvg()));
			// 계산이 이루어짐
			btnCal.setOnAction(e2 -> {
				try {

					int korean = Integer.parseInt(editKorean.getText());
					int english = Integer.parseInt(editEnglish.getText());
					int math = Integer.parseInt(editMath.getText());
					int sic = Integer.parseInt(editSic.getText());
					int soc = Integer.parseInt(editSoc.getText());
					int music = Integer.parseInt(editMusic.getText());
					if ((korean <= 100) && (english <= 100) && (math <= 100) && (sic <= 100) && (soc <= 100)
							&& (music <= 100)) {
						int total = korean + english + math + sic + soc + music;
						editTotal.setText(String.valueOf(total));
						editAvg.setText(String.valueOf(total / 6.0));

					} else {
						throw new Exception("��ȿ�Ѱ� ����");
					}
				} catch (Exception e3) {
					alertDisplay(1, "�հ����!", "������(��ȿ�� ���� ������ �ʾҽ��ϴ�.)", e3.toString());
				}
			});
			// 저장버튼을 눌렀을 때
			btnFormAdd.setOnAction(e4 -> {
				try {

					if (editTotal.getText().equals("") || editAvg.getText().equals(" ")) {
						throw new Exception();
					} else {
						StudentVO svo = new StudentVO(selectStudent.get(0).getNo(), editName.getText(),
								editYear.getText(), editBan.getText(), editGender.getText(),
								Integer.parseInt(editKorean.getText().trim()),
								Integer.parseInt(editEnglish.getText().trim()),
								Integer.parseInt(editMath.getText().trim()), Integer.parseInt(editSic.getText().trim()),
								Integer.parseInt(editSoc.getText().trim()),
								Integer.parseInt(editMusic.getText().trim()),
								Integer.parseInt(editTotal.getText().trim()),
								Double.parseDouble(editAvg.getText().trim()));

						StudentDAO studentDAO = new StudentDAO();
						StudentVO studentVO = studentDAO.getStudentUpdate(svo, selectStudent.get(0).getNo());

						// 테이블 뷰에 들어가버린 순간
						if (editDelete == true && studentVO != null) {
							data.remove(selectedIndex);
							data.add(selectedIndex, svo);
							editDelete = false;
						} else {
							throw new Exception("수정등록 오류");

						}
					}
				} catch (Exception e2) {
					alertDisplay(1, "수정등록 실패", "수정등록 실패", "오류!" + e2.getMessage());
				}
				stageDialog.close();
				// �ʱ�ȭ ��ư �������� 1�� ��ư�ʱ�ȭ��,�ؽ�Ʈ�ʵ带 ��� Ȱ��ȭ,
				handlerBtnInitActoion(e);

			});
			// ��ҹ�ư�� ��������
			btnFormCancel.setOnAction(e3 -> {
				stageDialog.close();
			});

			Scene scene = new Scene(editRoot);
			stageDialog.setScene(scene);
			stageDialog.setResizable(false);
			stageDialog.show();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

	// 12.PI chart
	public void handlerPieChartActoion(MouseEvent e) {
		try {
			// �ι�Ŭ���ߴ��� ����
			if (e.getClickCount() != 2) {
				return;
			}
			buttonInitSetting(false, true, false, true, false, true, true);
			// 2.�ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
			textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
			// �ι�Ŭ���� ������
			Parent pieChartRoot = FXMLLoader.load(getClass().getResource("/View/piechart.fxml"));
			Stage stage = new Stage(StageStyle.UTILITY);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(btnOk.getScene().getWindow());
			stage.setTitle(selectStudent.get(0).getName() + "�հ���� ����íƮ");
			PieChart pieChart = (PieChart) pieChartRoot.lookup("#pieChart");
			Button btnClose = (Button) pieChartRoot.lookup("#btnClose");
			pieChart.setData(FXCollections.observableArrayList(
					new PieChart.Data("����", (double) (selectStudent.get(0).getTotal())),
					new PieChart.Data("���", selectStudent.get(0).getAvg())

			));
			// â�ݱ�
			btnClose.setOnAction(e2 -> {
				stage.close();
				editDelete = false;
			});
			Scene scene = new Scene(pieChartRoot);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	// 13.Bart chart
	public void handlerBtnBarChartAction(ActionEvent e) {
		try {
			Parent barChartRoot = FXMLLoader.load(getClass().getResource("/View/barchart.fxml"));
			Stage stage = new Stage(StageStyle.UTILITY);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(btnOk.getScene().getWindow());
			stage.setTitle("���� ����íƮ");

			BarChart barChart = (BarChart) barChartRoot.lookup("#barChart");
			Button btnClose = (Button) barChartRoot.lookup("#btnClose");

			XYChart.Series seriseKorean = new XYChart.Series();
			seriseKorean.setName("����");
			ObservableList koreanList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {

				koreanList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getKorean()));
			}
			seriseKorean.setData(koreanList);
			barChart.getData().add(seriseKorean);

			XYChart.Series seriesMath = new XYChart.Series();
			seriesMath.setName("����");
			ObservableList mathList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				mathList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getMath()));
			}
			seriesMath.setData(mathList);
			barChart.getData().add(seriesMath);

			XYChart.Series seriesEnglish = new XYChart.Series();
			seriesEnglish.setName("����");
			ObservableList englishList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				englishList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getEnglish()));
			}
			seriesEnglish.setData(englishList);
			barChart.getData().add(seriesEnglish);

			XYChart.Series seriesSic = new XYChart.Series();
			seriesSic.setName("����");
			ObservableList sicList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				sicList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getSic()));
			}
			seriesSic.setData(sicList);
			barChart.getData().add(seriesSic);

			XYChart.Series seriesSoc = new XYChart.Series();
			seriesSoc.setName("��ȸ");
			ObservableList socList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				socList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getSoc()));
			}
			seriesSoc.setData(socList);
			barChart.getData().add(seriesSoc);

			XYChart.Series seriesMusic = new XYChart.Series();
			seriesMusic.setName("����");
			ObservableList musicList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				musicList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getMusic()));
			}
			seriesMusic.setData(musicList);
			barChart.getData().add(seriesMusic);

			// ��íƮ ��ư close�̺�Ʈ
			btnClose.setOnAction(e2 -> {
				buttonInitSetting(false, true, false, true, false, true, true);
				// 2.�ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
				textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
				stage.close();
				editDelete = false;

			});

			Scene scene = new Scene(barChartRoot);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	// 14.

	// 15. total list
	private void handlerBtnTotalListAction(ActionEvent e) {
		try {
			data.removeAll(data);
			totalList();
		} catch (Exception e1) {
			DBUtil.alertDisplay(1, "Error", "TotalList", "Check!");
		}

	}

	// 16. 기본 이미지 셋
	public void imageViewInit() {
		localUrl = "/images/image01.jpg";
		localImage = new Image(localUrl, false);
		imageView.setImage(localImage);
	}

	// 17. 날짜 선택 이벤트

	private void handlerDatePickerAction(ActionEvent e) {
		LocalDate date = dpDate.getValue();
		txtDay.setText("" + date);

	}

	// 18. 이미지 버튼을 누르면 선택하도록
	public Object handlerBtnImageFileActoion(ActionEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

	// 이미지 세이브 //내림차수 오름차수
	private String imageSave(File selectedFile2) {
		// TODO Auto-generated method stub
		return null;
	}

	/***********************************************************
	 * imageDelete() 이미지 삭제 메소드. 19.10.10 by 남연서
	 * 
	 * @param (삭제할 파일명)
	 * @return 삭제여부를 리턴
	 ***********************************************************/
	public boolean imageDelete(String fileName) {
		boolean result = false;
		try {
			File fileDelete = new File(dirSave.getAbsolutePath() + "\\" + fileName); // 삭제이미지 파일
			if (fileDelete.exists() && fileDelete.isFile()) {
				result = fileDelete.delete();
				imageViewInit();
			}
		} catch (Exception ie) {
			System.out.println("ie = [ " + ie.getMessage() + "]");
			result = false;
		}
		return result;
	}

	public void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert = null;
		switch (type) {
		case 1:
			alert = new Alert(AlertType.WARNING);
			break;
		case 2:
			alert = new Alert(AlertType.CONFIRMATION);
			break;
		case 3:
			alert = new Alert(AlertType.ERROR);
			break;
		case 4:
			alert = new Alert(AlertType.NONE);
			break;
		case 5:
			alert = new Alert(AlertType.INFORMATION);
			break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(headerText + "\n" + contentText);
		alert.setResizable(false);
		alert.showAndWait();

	}

	public void textFieldInitSetting(boolean b, boolean c, boolean d, boolean k, boolean e, boolean f, boolean g,
			boolean h, boolean i, boolean j) {
		txtName.setDisable(b);
		cbYear.setDisable(c);
//		txtLevel.setDisable(c);
		txtBan.setDisable(d);
		rbMale.setDisable(k);
		rbFemale.setDisable(k);
		txtKo.setDisable(e);
		txtEng.setDisable(f);
		txtMath.setDisable(g);
		txtSic.setDisable(h);
		txtSoc.setDisable(i);
		txtMusic.setDisable(j);
	}
}
