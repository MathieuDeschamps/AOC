package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainViewController {
	
	@FXML
	Label canal1;
	@FXML
	Label canal2;
	@FXML
	Label canal3;
	@FXML
	Label canal4;
	
	@FXML
	Button startButton;
	@FXML
	Button stopButton;
	
	@FXML
	RadioButton strategy1;
	
	@FXML
	RadioButton strategy2;
	
	@FXML
	RadioButton strategy3;
	

	@FXML
	private void initialize(){
		
		canal1.setText("PD");
		strategy1.setSelected(true);
		strategy1.setText("Strategy1");
		strategy2.setText("Strategy2");
		strategy3.setText("Strategy3");
		
	}
	

}
