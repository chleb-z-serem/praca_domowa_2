package pl.kognitywistyka.ppa202101;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.kognitywistyka.ppa202101.backend.OtherController;
import pl.kognitywistyka.ppa202101.backend.SampleController;

/**
 * @author Piotr Wilkin
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader firstSceneLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane firstSceneRoot = (BorderPane) firstSceneLoader.load();
			SampleController firstSceneController = firstSceneLoader.getController();
			Scene firstScene = new Scene(firstSceneRoot, 400, 400);
			
			FXMLLoader secondSceneLoader = new FXMLLoader(getClass().getResource("Other.fxml"));
			BorderPane secondSceneRoot = (BorderPane) secondSceneLoader.load();
			OtherController secondSceneController = secondSceneLoader.getController();
			//Scene secondScene = new Scene(secondSceneRoot, 400, 400);
			
			firstSceneController.setMainStage(primaryStage);
			firstScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//firstSceneController.setOtherScene(secondScene);
			
			firstSceneController.setOtherSceneRoot(secondSceneRoot);

			secondSceneController.setMainStage(primaryStage);
			//secondScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//secondSceneController.setOtherScene(firstScene);
			
			secondSceneController.setOtherSceneRoot(firstSceneRoot);
			
			primaryStage.setScene(firstScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
