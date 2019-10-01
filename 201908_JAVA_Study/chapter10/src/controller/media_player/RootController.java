package controller.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	@FXML private ImageView imageView;
	@FXML private MediaView mediaView;
	@FXML private Button buttonPlay;
	@FXML private Button buttonPause;
	@FXML private Button buttonStop;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider slider;
	@FXML private Label timeLabel;
	private boolean endOfMedia = false;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1. 미디어뷰를 진행하기 위해서는 미디어객체를 가져와야한다.(스트림)
		Media media = new Media(getClass().getResource("media/video.mp4").toString());
		//2. 미디어 플레이어를 만들고 미디어객체를 받는다.
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		//3. 미디어뷰에 미디어플레이어를 삽입한다.
		mediaView.setMediaPlayer(mediaPlayer);
		
		
		slider.setValue(50.0);
		mediaPlayer.setVolume(slider.getValue()/100.0);
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(newValue.longValue()/100.0);			
			}
		});
		
		//4. 준비상태, 진행상태, 멈춤상태, 정지상태, 끝났다고 알려주는 상태
		mediaPlayer.setOnReady(new Runnable() {
			
			@Override
			public void run() {
				buttonPlay.setDisable(false);
				buttonPause.setDisable(true);
				buttonStop.setDisable(true);
				
				//프로그램바 이벤트 설정
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						
						double currentTime = mediaPlayer.getCurrentTime().toSeconds();
						double totalTime = mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(currentTime/totalTime);
						progressIndicator.setProgress(currentTime/totalTime);
						
						timeLabel.setText(currentTime+"s"+" / "+totalTime+"s");
						
					}
				});
				
				
				
				//진행준비 상태에서 자동으로 진행이 된다면 지금은 미디어뷰를 보이지 말라
				if(mediaPlayer.isAutoPlay()) {
					mediaView.setVisible(false);
				}
				
			}
		});
		
		mediaPlayer.setOnPlaying(()-> {
			buttonPlay.setDisable(true);
			buttonPause.setDisable(false);
			buttonStop.setDisable(false);
		});
		mediaPlayer.setOnPaused(()-> {
			buttonPlay.setDisable(false);
			buttonPause.setDisable(true);
			buttonStop.setDisable(false);
		});
		mediaPlayer.setOnStopped(()-> {
			//미디어플레이어가 정지사항이 발생이 되면 동영상을 원위치로 돌려놓는다.
			mediaPlayer.seek(mediaPlayer.getStartTime());
			buttonPlay.setDisable(false);
			buttonPause.setDisable(true);
			buttonStop.setDisable(true);
		});
		mediaPlayer.setOnEndOfMedia(()-> {
			buttonPlay.setDisable(false);
			buttonPause.setDisable(true);
			buttonStop.setDisable(true);
			endOfMedia = true;
			
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
			timeLabel.setText("Done");
		});
		
		buttonPlay.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(endOfMedia) {
					mediaPlayer.stop();
					mediaPlayer.seek(mediaPlayer.getStartTime());
				}
				mediaPlayer.play();
				endOfMedia=false;
				
			}
		});
		
		buttonPause.setOnAction((event) -> {
				mediaPlayer.pause();
		});
		
		buttonStop.setOnAction((event) -> {
			mediaPlayer.stop();
		});
		
		
	} //end initialize
	   
	public void handlerButtonOKAction(ActionEvent e) {
	}
	public void handlerButtonExitAction(ActionEvent e) {
	   //1. 현재창을 닫는다. 
		Platform.exit();
	}
	

}
