package change_scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.xml.sax.HandlerBase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {
	@FXML private Button buttonLogin;
	@FXML private AnchorPane ancMain;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonLogin.setOnAction((event) ->{
			hanbleButtonLoginAction(event);
		});
	} //end initialize

	
	/*로그인 화면을 보여주는 이벤트처리*/
	public void hanbleButtonLoginAction(ActionEvent event) {
		StackPane stackPane=null;
		AnchorPane anchorPane=null;
		
		try {
			//root.fxml에 있는 최상위 루르컨테이너의 객체를 가져옴(StackPane)
			stackPane = (StackPane) buttonLogin.getScene().getRoot();
			
			//login.fxml 로더(login.fxml, loginController 객체화, 매치, 이벤트 처리), 최상위루트컨테이너 넘
			anchorPane = FXMLLoader.load(getClass().getResource("login.fxml"));
			
			//현재 스택펜에 다른 화변에 있는 앵커펜을 집어온다.
			stackPane.getChildren().add(anchorPane);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end of hanbleButtonLoginAction
	
	
	

}