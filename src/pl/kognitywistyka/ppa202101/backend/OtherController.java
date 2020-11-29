package pl.kognitywistyka.ppa202101.backend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OtherController {
	
	protected Scene otherScene;
	protected Stage mainStage;
	
	protected BorderPane otherSceneRoot;

	public BorderPane getOtherSceneRoot() {
		return otherSceneRoot;
	}
	
	public void setOtherSceneRoot(BorderPane otherSceneRoot) {
		this.otherSceneRoot = otherSceneRoot;
	}
	
	public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}

	public Scene getOtherScene() {
		return otherScene;
	}

	public void setOtherScene(Scene otherScene) {
		this.otherScene = otherScene;
	}

	@FXML public void podmianka(ActionEvent event) {
		//mainStage.setScene(otherScene);
		mainStage.getScene().setRoot(otherSceneRoot);
	}
	
}
