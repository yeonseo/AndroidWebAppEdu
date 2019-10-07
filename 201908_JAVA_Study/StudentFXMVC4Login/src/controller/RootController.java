package controller;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.Observable;
import java.util.ResourceBundle;

import model.Student;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private TableView<Student> tableView = new TableView<>();
	@FXML private TextField txtName;
	@FXML private ComboBox<String> cbYear;
	@FXML private TextField txtBan;
	@FXML private ToggleGroup genderGroup;
	
	@FXML private RadioButton rbMale;
	@FXML private RadioButton rbFemale;
	
	@FXML private Button btnTotal;
	@FXML private Button btnAvg;
	@FXML private Button btnInit;
	@FXML private Button btnOk;
	@FXML private Button btnExit;
	@FXML private Button btnEdit;
	@FXML private Button btnDelete;
	@FXML private Button btnSearch;
	@FXML private Button btnBarChart;
	
	@FXML private TextField txtKo;
	@FXML private TextField txtEng;
	@FXML private TextField txtMath;
	@FXML private TextField txtSic;
	@FXML private TextField txtSoc;
	@FXML private TextField txtMusic;
	
	@FXML private TextField txtTotal;
	@FXML private TextField txtAvg;
	@FXML private TextField txtSearch;
	
	@FXML private DatePicker dpDate;

	Student student = new Student();
	
	ObservableList<Student> data = FXCollections.observableArrayList();
	ObservableList<Student> selectStudent; // 테이블에서 선택한 정보 저장
	boolean editDelete = false; // 수정할 때 확인 버튼 상태 설정
	boolean editButton = false;
	int selectedIndex; // 테이블에서 선택한 학생 정보 인덱스 저장

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		txtTotal.setEditable(false);
		txtAvg.setEditable(false);
		btnAvg.setDisable(true);
		btnOk.setDisable(true);
		btnEdit.setDisable(true);
		btnDelete.setDisable(true);
		dpDate.setValue(LocalDate.now());
		
		
		
		
		//숫자만 입력하도록 한
		DecimalFormat format = new DecimalFormat("###");
		
		
		//점수 입력시 길이제한 이벤트 처리
		txtKo.setTextFormatter(new TextFormatter<>(event -> {
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length() ||
					 event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtEng.setTextFormatter(new TextFormatter<>(event -> {
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length() ||
					 event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtMath.setTextFormatter(new TextFormatter<>(event -> {
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length() ||
					 event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtSic.setTextFormatter(new TextFormatter<>(event -> {
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length() ||
					 event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtSoc.setTextFormatter(new TextFormatter<>(event -> {
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length() ||
					 event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtMusic.setTextFormatter(new TextFormatter<>(event ->{
			if(event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			
			if(object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			}else {
				return event;
			}
		}));
		
		
		
		
		
		//학년
		cbYear.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6"));

		
		
		
		tableView.setEditable(false);

		TableColumn colName = new TableColumn("성명");
		colName.setMaxWidth(70);
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

		tableView.setItems(data);
		tableView.getColumns().addAll(colName, colLevel, colBan, colGender
				, colKorean, colEnglish, colMath, colSic
				, colSoc, colMusic, colTotal, colAvg);

		btnTotal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				try {
					handlerBtnTotalAction(event);
				} catch (NumberFormatException e) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("점수 입력");
					alert.setHeaderText("점수를 입력하시오.");
					alert.setContentText("다음에는 주의하세요!");

					alert.showAndWait();
				}
			}
		});

		btnOk.setOnAction(event -> {
			
			/*4단계*/
//			if (editButton) {
//				try {
//				data.remove(selectedIndex);
//				data.add(selectedIndex, new Student(txtName.getText(), cbYear.getSelectionModel().getSelectedItem()
//						, txtBan.getText(), genderGroup.getSelectedToggle().getUserData().toString(), txtKo.getText()
//						, txtEng.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText()
//						, txtTotal.getText(), txtAvg.getText()));
//	
//				txtName.setEditable(true);
//				cbYear.getSelectionModel().clearSelection();
//				txtBan.setEditable(true);
//				txtKo.setEditable(true);
//				txtEng.setEditable(true);
//				txtMath.setEditable(true);
//				txtSic.setEditable(true);
//				txtSoc.setEditable(true);
//				txtMusic.setEditable(true);
//				handlerBtnInitActoion(event);
//				
//				} catch (Exception e) {
//					Alert alert = new Alert(AlertType.WARNING);
//					alert.setTitle("학생 정보 수정");
//					alert.setHeaderText("수정되는 정보를 정확히 입력하시오.");
//					alert.setContentText("다음에는 주의하세요!");
//					alert.showAndWait();
//				}
//				
//				editButton = false;
//			} else {
				try {
					data.add(new Student(txtName.getText(), cbYear.getSelectionModel().getSelectedItem()
							,txtBan.getText(), genderGroup.getSelectedToggle().getUserData().toString()
							, txtKo.getText(), txtEng.getText(), txtMath.getText(), txtSic.getText()
							, txtSoc.getText(), txtMusic.getText(), txtTotal.getText(), txtAvg.getText()));
					
					txtName.setEditable(true);
					cbYear.getSelectionModel().clearSelection();
					txtBan.setEditable(true);
					txtKo.setEditable(true);
					txtEng.setEditable(true);
					txtMath.setEditable(true);
					txtSic.setEditable(true);
					txtSoc.setEditable(true);
					txtMusic.setEditable(true);
					handlerBtnInitActoion(event);
					
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("학생 정보 입력");
					alert.setHeaderText("학생 정보를 정확히 입력하시오.");
					alert.setContentText("다음에는 주의하세요!");
					alert.showAndWait();
				}
//			}
			
		});

		btnAvg.setOnAction(event -> handlerBtnAvgActoion(event));
		btnInit.setOnAction(event -> handlerBtnInitActoion(event));
		btnExit.setOnAction(event -> handlerBtnExitActoion(event));
		btnSearch.setOnAction(event -> handlerBtnSearchActoion(event));
		btnEdit.setOnAction(event -> handlerBtnEditActoion(event));
		btnDelete.setOnAction(event -> handlerBtnDeleteActoion(event));
		btnBarChart.setOnAction(event -> handlerBtnBarChartActoion(event));
		tableView.setOnMouseClicked(event -> handlerBtnPieChartActoion(event));

		
		
        // 테이블에 이벤트 처리
		tableView.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				selectStudent = tableView.getSelectionModel().getSelectedItems();
			    selectedIndex = tableView.getSelectionModel().getSelectedIndex();

				try {
					txtName.setText(selectStudent.get(0).getName());

					cbYear.setValue(selectStudent.get(0).getLevel());
					if (selectStudent.get(0).getGender().equals("남성")) {
						rbMale.setSelected(true);
						rbFemale.setDisable(true);
					} else {
						rbFemale.setSelected(true);
						rbMale.setDisable(true);
					}

					txtBan.setText(selectStudent.get(0).getBan());
					txtKo.setText(selectStudent.get(0).getKorean());
					txtEng.setText(selectStudent.get(0).getEnglish());
					txtMath.setText(selectStudent.get(0).getMath());
					txtSic.setText(selectStudent.get(0).getSic());
					txtSoc.setText(selectStudent.get(0).getSoc());
					txtMusic.setText(selectStudent.get(0).getMusic());
					txtTotal.setText(selectStudent.get(0).getTotal());
					txtAvg.setText(selectStudent.get(0).getAvg());

					txtName.setEditable(false);
					txtBan.setEditable(false);
					txtKo.setEditable(false);
					txtEng.setEditable(false);
					txtMath.setEditable(false);
					txtSic.setEditable(false);
					txtSoc.setEditable(false);
					txtMusic.setEditable(false);
					txtTotal.setEditable(false);
					txtAvg.setEditable(false);
					
					cbYear.setDisable(true);
					btnDelete.setDisable(false);

					editDelete = true;
				} catch (Exception e) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("학생 정보 수정 삭제");
					alert.setHeaderText("학생 정보를 입력하시오.");
					alert.setContentText("다음에는 주의하세요!");
					alert.showAndWait();
				}
			}
		});
	}


	public void handlerBtnPieChartActoion(MouseEvent event) {
		if (event.getClickCount() != 2) {
			btnEdit.setDisable(false);
			btnDelete.setDisable(false);
			return;
		}
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnOk.getScene().getWindow());
			
			Parent parent = FXMLLoader.load(getClass().getResource("/view/pieChart.fxml"));
			
			PieChart pieChart = (PieChart) parent.lookup("#pieChart");
			Student studentPieChart = tableView.getSelectionModel().getSelectedItem();
			dialog.setTitle(studentPieChart.getName()+"파이 그래프");
			pieChart.setData(FXCollections.observableArrayList(
					new PieChart.Data("총점", Double.parseDouble(studentPieChart.getTotal())),
					new PieChart.Data("평균", Double.parseDouble(studentPieChart.getAvg()))));
			
			Button btnClose = (Button) parent.lookup("#btnClose");
			btnClose.setOnAction(e-> dialog.close());
			
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.show();
		}catch(IOException ioE){
			
		}
	}

	public void handlerBtnBarChartActoion(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnOk.getScene().getWindow());
			dialog.setTitle("막대 그래프");
			
			Parent parent = FXMLLoader.load(getClass().getResource("/view/barChart.fxml"));
			BarChart barChart = (BarChart) parent.lookup("#barChart");
			
			XYChart.Series seriesKorean = new XYChart.Series();
			seriesKorean.setName("국어");
			ObservableList koreanList = FXCollections.observableArrayList();
			for(int i = 0 ; i <data.size() ; i++) {
				koreanList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getKorean())));
			}
			seriesKorean.setData(koreanList);
			barChart.getData().add(seriesKorean);
			
			XYChart.Series seriesEnglish = new XYChart.Series();
			seriesEnglish.setName("영어");
			ObservableList englishList = FXCollections.observableArrayList();
			for(int i = 0 ; i < data.size() ; i++) {
				englishList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getMath())));
			}
			seriesEnglish.setData(englishList);
			barChart.getData().add(seriesEnglish);
			
			XYChart.Series seriesMath = new XYChart.Series();
			seriesMath.setName("수학");
			ObservableList mathList = FXCollections.observableArrayList();
			for(int i = 0 ; i < data.size() ; i++) {
				mathList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getMath())));
			}
			seriesMath.setData(mathList);
			barChart.getData().add(seriesMath);
			
			XYChart.Series seriesSic = new XYChart.Series();
			seriesSic.setName("과학");
			ObservableList sicList = FXCollections.observableArrayList();
			for(int i = 0 ; i < data.size() ; i++) {
				sicList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getSic())));
			}
			seriesSic.getData().add(sicList);
			barChart.getData().add(seriesSic);
			
			XYChart.Series seriesSoc = new XYChart.Series();
			seriesSoc.setName("사회");
			ObservableList socList = FXCollections.observableArrayList();
			for(int i = 0 ; i < data.size() ; i++) {
				socList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getSoc())));
			}
			seriesSoc.setData(socList);
			barChart.getData().add(seriesSoc);
			
			XYChart.Series seriesMusic = new XYChart.Series();
			seriesMusic.setName("음악");
			ObservableList musicList = FXCollections.observableArrayList();
			for (int i = 0; i < data.size(); i++) {
				musicList.add(new XYChart.Data(data.get(i).getName(), Integer.parseInt(data.get(i).getMusic())));
			}
			seriesMusic.setData(musicList);
			barChart.getData().add(seriesMusic);

			Button btnClose = (Button) parent.lookup("#btnClose");
			btnClose.setOnAction(e -> dialog.close());

			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.show();
			
		}catch (IOException ioE) {
			
		}
	}

	// 삭제 이벤트 처리 메소드
	public void handlerBtnDeleteActoion(ActionEvent event) {
		data.remove(selectedIndex);
		txtName.setEditable(true);
		cbYear.getSelectionModel().clearSelection();
		txtBan.setEditable(true);
		txtKo.setEditable(true);
		txtEng.setEditable(true);
		txtMath.setEditable(true);
		txtSic.setEditable(true);
		txtSoc.setEditable(true);
		txtMusic.setEditable(true);
		handlerBtnInitActoion(event);
	}
        
    // 수정 이벤트 처리 메소드
	public void handlerBtnEditActoion(ActionEvent event) {
		try {
			btnTotal.setDisable(false);
			btnOk.setDisable(true);
			btnEdit.setDisable(true);
			btnDelete.setDisable(true);
	        editDelete = false;
			
	        cbYear.setDisable(true);
			
			txtName.setEditable(false);
			txtBan.setEditable(false);
			txtKo.setEditable(true);
			txtEng.setEditable(true);
			txtMath.setEditable(true);
			txtSic.setEditable(true);
			txtSoc.setEditable(true);
			txtMusic.setEditable(true);
			
			editButton = true;
			
			Parent eidtRoot = FXMLLoader.load(getClass().getResource("/view/formedit.fxml"));
			Stage stageDialog = new Stage(StageStyle.UTILITY);
			
			stageDialog.initModality(Modality.WINDOW_MODAL);
			stageDialog.initOwner(btnOk.getScene().getWindow());
			stageDialog.setTitle("수정");
	
			Student studentEdit = tableView.getSelectionModel().getSelectedItem();
			selectedIndex = tableView.getSelectionModel().getSelectedIndex();
	
			TextField editName = (TextField) eidtRoot.lookup("#txtName");
			TextField editYear = (TextField) eidtRoot.lookup("#txtYear");
			TextField editBan = (TextField) eidtRoot.lookup("#txtBan");
			TextField editGender = (TextField) eidtRoot.lookup("#txtGender");
			TextField editKorean = (TextField) eidtRoot.lookup("#txtKorean");
			TextField editEnglish = (TextField) eidtRoot.lookup("#txtEnglish");
			TextField editMath = (TextField) eidtRoot.lookup("#txtMath");
			TextField editSic = (TextField) eidtRoot.lookup("#txtSic");
			TextField editSoc = (TextField) eidtRoot.lookup("#txtSoc");
			TextField editMusic = (TextField) eidtRoot.lookup("#txtMusic");
			TextField editTotal = (TextField) eidtRoot.lookup("#txtTotal");
			TextField editAvg = (TextField) eidtRoot.lookup("#txtAvg");
	
			editName.setDisable(true);
			editYear.setDisable(true);
			editBan.setDisable(true);
			editGender.setDisable(true);
			editTotal.setDisable(true);
			editAvg.setDisable(true);
	
			editName.setText(studentEdit.getName());
			editYear.setText(studentEdit.getLevel());
			editBan.setText(studentEdit.getBan());
			editGender.setText(studentEdit.getGender());
			editKorean.setText(studentEdit.getKorean());
			editEnglish.setText(studentEdit.getEnglish());
			editMath.setText(studentEdit.getMath());
			editSic.setText(studentEdit.getSic());
			editSoc.setText(studentEdit.getSoc());
			editMusic.setText(studentEdit.getMusic());
			editTotal.setText(studentEdit.getTotal());
			editAvg.setText(studentEdit.getAvg());
	
			Button btnCal = (Button) eidtRoot.lookup("#btnCal");
			Button btnFormAdd = (Button) eidtRoot.lookup("#btnFormAdd");
			Button btnFormCancel = (Button) eidtRoot.lookup("#btnFormCancel");
	
			btnFormAdd.setDisable(true);
	        
			// 계산 버튼 이벤트 처리
			btnCal.setOnAction(e -> {
				int sum = Integer.parseInt(editKorean.getText()) + Integer.parseInt(editEnglish.getText())
				+ Integer.parseInt(editMath.getText()) + Integer.parseInt(editSic.getText())
				+ Integer.parseInt(editSoc.getText()) + Integer.parseInt(editMusic.getText());
			
				double avg = sum / 6.0;
	
				editTotal.setText(sum + "");
				editAvg.setText(avg + "");
				btnCal.setDisable(true);
				btnFormAdd.setDisable(false);
			});
			
			// 다이얼 로그 저장 버튼 이벤트 처리
			btnFormAdd.setOnAction(e -> {
				TextField txtName = (TextField) eidtRoot.lookup("#txtName");
				TextField txtYear = (TextField) eidtRoot.lookup("#txtYear");
				TextField txtBan = (TextField) eidtRoot.lookup("#txtBan");
				TextField txtGender = (TextField) eidtRoot.lookup("#txtGender");
				TextField txtKorean = (TextField) eidtRoot.lookup("#txtKorean");
				TextField txtEnglish = (TextField) eidtRoot.lookup("#txtEnglish");
				TextField txtMath = (TextField) eidtRoot.lookup("#txtMath");
				TextField txtSic = (TextField) eidtRoot.lookup("#txtSic");
				TextField txtSoc = (TextField) eidtRoot.lookup("#txtSoc");
				TextField txtMusic = (TextField) eidtRoot.lookup("#txtMusic");
				TextField txtTotal = (TextField) eidtRoot.lookup("#txtTotal");
				TextField txtAvg = (TextField) eidtRoot.lookup("#txtAvg");
			
				data.remove(selectedIndex);
			
				data.add(selectedIndex, new Student(txtName.getText(), txtYear.getText(), txtBan.getText(), txtGender.getText(), txtKorean.getText(), txtEnglish.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(), txtTotal.getText(), txtAvg.getText()));
				stageDialog.close();
				btnDelete.setDisable(true);
				btnEdit.setDisable(true);
			});
			
			// 다이얼 로그 취소 버튼 이벤트 처리
			btnFormCancel.setOnAction(e -> {
				btnDelete.setDisable(true);
				btnEdit.setDisable(true);
				stageDialog.close();
			});
		
			Scene scene = new Scene(eidtRoot);
			stageDialog.setScene(scene);
			stageDialog.setResizable(false);
			stageDialog.show();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

    // 검색 이벤트 처리 메소드
	public void handlerBtnSearchActoion(ActionEvent event) {
		for (Student list : data) {
			if ((list.getName()).equals(txtSearch.getText())) {
				tableView.getSelectionModel().select(list);
			}
		}
	}
	
	//종료버튼
	public void handlerBtnExitActoion(ActionEvent event) {
		Platform.exit();
	}
	
	//버튼 초기화
	public void handlerBtnInitActoion(ActionEvent event) {
		txtName.clear();
		txtName.setEditable(true);
		cbYear.setDisable(false);
		cbYear.getSelectionModel().clearSelection();
		rbFemale.setDisable(false);
		rbMale.setDisable(false);
		genderGroup.selectToggle(null);
		txtBan.clear();
		txtBan.setEditable(true);
		txtKo.clear();
		txtKo.setEditable(true);
		txtEng.clear();
		txtEng.setEditable(true);
		txtMath.clear();
		txtMath.setEditable(true);
		txtSic.clear();
		txtSic.setEditable(true);
		txtSoc.clear();
		txtSoc.setEditable(true);
		txtMusic.clear();
		txtMusic.setEditable(true);
		txtTotal.clear();
		txtAvg.clear();
		btnTotal.setDisable(false);
		btnOk.setDisable(true);
		btnEdit.setDisable(true);
		btnDelete.setDisable(true);
        editDelete = false;
		
	}
	
	//총합구하기
	public void handlerBtnTotalAction(ActionEvent event) {
		try {
			int korean = Integer.parseInt(txtKo.getText());
			int english = Integer.parseInt(txtEng.getText());
			int math = Integer.parseInt(txtMath.getText());
			int sic = Integer.parseInt(txtSic.getText());
			int soc = Integer.parseInt(txtSoc.getText());
			int music = Integer.parseInt(txtMusic.getText());
			int total;
			if ((korean >= 0 && korean <= 100) && (english >= 0 && english <= 100) 
					&& (math >= 0 && math <= 100) && (sic >= 0 && sic <= 100) 
					&& (soc >= 0 && soc <= 100) && (music >= 0 && music <= 100)) {
				total = korean + english + math + sic + soc + music;

				student.setName(txtName.getText());
				student.setLevel(cbYear.getItems() + "");
				student.setBan(txtBan.getText());
				student.setGender(genderGroup.getUserData() + "");
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
			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("학생 점수 입력");
				alert.setHeaderText("점수는 0점에서 100점 사이로 입력하시오.");
				alert.setContentText("다음에는 주의하세요!");
				alert.showAndWait();
			}
			
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("학생 정보 입력");
			alert.setHeaderText("학생의 정보와 점수을 정확히 입력하시오.");
			alert.setContentText("다음에는 주의하세요!");
			alert.showAndWait();
		}
	}
	
	//평균구하기
	public void handlerBtnAvgActoion(ActionEvent event) {
		student.setAvg((Integer.parseInt(student.getTotal()) / 6.0) + "");
		txtAvg.setText(student.getAvg() + "");
		txtName.setEditable(false);
		cbYear.setEditable(false);
		txtBan.setEditable(false);
		txtKo.setEditable(false);
		txtEng.setEditable(false);
		txtMath.setEditable(false);
		txtSic.setEditable(false);
		txtSoc.setEditable(false);
		txtMusic.setEditable(false);
		btnAvg.setDisable(true);

		// 등록 버튼 상태 설정(순서 중요)
		if (editDelete == false) {
			btnOk.setDisable(false);
		}

		// 수정, 삭제 버튼 상태 설정
		if (editDelete == true) {
			btnEdit.setDisable(false);
			btnDelete.setDisable(false);
			editDelete = false;
		}
	}
}