package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 * Main of our JavaFx application
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("AOC Project");
			primaryStage.setResizable(false);
			primaryStage.setOnCloseRequest( event -> Platform.exit());
			primaryStage.show();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main( String[] args ) {
		launch(args);
	}
}
