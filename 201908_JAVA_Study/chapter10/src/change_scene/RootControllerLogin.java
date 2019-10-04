package change_scene;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class RootControllerLogin implements Initializable {
	@FXML private Button buttonMain;
	@FXML private AnchorPane ancLogin;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonMain.setOnAction((event) ->{
			hanbleButtonMainAction(event);
		});
	} //end initialize
	
	/*메인 화면을 보여주는 이벤트처리*/
	public void hanbleButtonMainAction(ActionEvent event) {
		StackPane stackPane = (StackPane) buttonMain.getScene().getRoot();
		stackPane.getChildren().remove(ancLogin);
	}//end of hanbleButtonMainAction

}