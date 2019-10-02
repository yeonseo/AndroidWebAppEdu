package chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	   ObservableList<PieChart.Data> pieChartList = FXCollections.observableArrayList();
	   pieChartList.add(new PieChart.Data("AWT",10));
	   pieChartList.add(new PieChart.Data("Swing",20));
	   pieChartList.add(new PieChart.Data("SWT",30));
	   pieChartList.add(new PieChart.Data("JavaFX",40));
	   
	   pieChart.setData(pieChartList);
	   
	   
	   ObservableList<XYChart.Data> barChartList = FXCollections.observableArrayList();
	   barChartList.add(new XYChart.Data("2015",10));
	   barChartList.add(new XYChart.Data("2016",20));
	   barChartList.add(new XYChart.Data("2017",30));
	   barChartList.add(new XYChart.Data("2018",40));
	   XYChart.Series series1 = new XYChart.Series();
	   series1.setName("남");
	   series1.setData(barChartList);
	   
	   barChart.getData().add(series1);
	   
	   ObservableList<XYChart.Data> barChartList2 = FXCollections.observableArrayList();
	   barChartList2.add(new XYChart.Data("2015",20));
	   barChartList2.add(new XYChart.Data("2016",25));
	   barChartList2.add(new XYChart.Data("2017",40));
	   barChartList2.add(new XYChart.Data("2018",45));
	   XYChart.Series series2 = new XYChart.Series();
	   series2.setName("여");
	   series2.setData(barChartList2);
	   
	   barChart.getData().add(series2);
	   
	   ObservableList<XYChart.Data> barChartList3 = FXCollections.observableArrayList();
	   barChartList3.add(new XYChart.Data("2015",20));
	   barChartList3.add(new XYChart.Data("2016",25));
	   barChartList3.add(new XYChart.Data("2017",40));
	   barChartList3.add(new XYChart.Data("2018",45));
	   XYChart.Series series3 = new XYChart.Series();
	   series3.setName("평균온");
	   series3.setData(barChartList3);
	   
	  areaChart.getData().add(series3);
	   
	} //end initialize
	

}