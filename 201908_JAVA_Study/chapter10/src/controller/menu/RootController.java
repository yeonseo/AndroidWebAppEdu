package controller.menu;

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
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class RootController implements Initializable {
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	   
	} //end initialize
	
	public void handlerMenuItemNew(ActionEvent event) {
		textArea.appendText("New \n");
	}
	public void handlerMenuItemOpen(ActionEvent event) {
		textArea.appendText("Open \n");
	}
	public void handlerMenuItemSave(ActionEvent event) {
		textArea.appendText("Save \n");
	}
	public void handlerMenuItemExit(ActionEvent event) {
		textArea.appendText("Exit \n");
	}

}