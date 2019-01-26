package view;

import application.ActiveObject.Implementations.Canal;
import application.ActiveObject.Implementations.DiffusionAtomique;
import application.ActiveObject.Implementations.DiffusionCausale;
import application.ActiveObject.Implementations.Generator;
import application.ActiveObject.Implementations.Monitor;
import application.ActiveObject.Interfaces.IAlgoDIffusion;
import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IMonitor;
import application.ActiveObject.Interfaces.IMonitorObserver;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainViewController implements IMonitorObserver {
	
	@FXML
	Label canal1Label;
	@FXML
	Label canal2Label;
	@FXML
	Label canal3Label;
	@FXML
	Label canal4Label;
	
	@FXML
	Button startButton;
	@FXML
	Button stopButton;
	@FXML
	Button generate;
	
	@FXML
	RadioButton strategy1;
	
	@FXML
	RadioButton strategy2;
	
	@FXML
	RadioButton strategy3;
	
	
	public static final String CANAL_1 = "canal1";
	public static final String CANAL_2 = "canal2";
	public static final String CANAL_3 = "canal3";
	public static final String CANAL_4 = "canal4";
	
	private IAlgoDIffusion algoDiffusion;
	private IGenerator generator;
	//Canals
	private Canal canal1;
	private Canal canal2;
	private Canal canal3;
	private Canal canal4;
	//Monitors
	private IMonitor monitor1;
	private IMonitor monitor2;
	private IMonitor monitor3;
	private IMonitor monitor4;

	@FXML
	private void initialize(	){
		
		algoDiffusion = new DiffusionAtomique( );
		generator = new Generator( algoDiffusion );
		monitor1 = new Monitor(1);
		monitor2 = new Monitor(2);
		monitor3 = new Monitor(3);
		monitor4 = new Monitor(4);
		monitor1.attach(this);
		monitor2.attach(this);
		monitor3.attach(this);
		monitor4.attach(this);
		
		canal1 = new Canal( monitor1, generator);
		canal2 = new Canal( monitor2, generator);
		canal3 = new Canal( monitor3, generator);
		canal4 = new Canal( monitor4, generator);
		
		generator.attach(canal1);
		generator.attach(canal2);
		generator.attach(canal3);
		generator.attach(canal4);
		
		

		strategy1.setSelected(true);
		strategy1.setText("Atomic");
		strategy2.setText("Sequentielle");
		strategy3.setText("Causale");
		strategy2.setDisable(true);
		
		/**
		 * Generate a new value on the click
		 */
		generate.setOnAction( (event -> {
			generator.generate( );
		}));
		
		strategy1.setOnAction( (event)->{
			generator.setDiffusion( new DiffusionAtomique() );
		});
		
		strategy3.setOnAction( (event) -> {
			generator.setDiffusion( new DiffusionCausale() );
		});
		
	}


	@Override
	public void update(int nMonitor, Integer value) {
		System.out.println("Monitor: "+nMonitor+" Value: "+value);
		switch( nMonitor )
		{
		case 1:
			canal1Label.setText( value.toString( ) );
			break;
		case 2:
			canal2Label.setText( value.toString( ) );
			break;
		case 3:
			canal3Label.setText( value.toString( ) );
			break;
		case 4:
			canal4Label.setText( value.toString( ) );
			break;
		}
		
	}

}
