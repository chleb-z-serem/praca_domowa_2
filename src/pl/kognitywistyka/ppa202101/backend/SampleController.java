package pl.kognitywistyka.ppa202101.backend;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController {
	
	protected Scene otherScene;
	protected Stage mainStage;
	
	protected BorderPane otherSceneRoot;

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
	
	public BorderPane getOtherSceneRoot() {
		return otherSceneRoot;
	}
	
	public void setOtherSceneRoot(BorderPane otherSceneRoot) {
		this.otherSceneRoot = otherSceneRoot;
	}
	
	@FXML TextArea textArea;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("You clicked on 'About'");
	}

	@FXML public void podmianka(ActionEvent event) {
		//mainStage.setScene(otherScene);
		mainStage.getScene().setRoot(otherSceneRoot);
		/*
		 * Rozumiem, ¿e ró¿nica polega na tym, ¿e nie tworzymy kolejnego obiektu typu Scene.
		 * Podejrzewam, ¿e dziêki temu mo¿na lepiej zarz¹dzaæ pamiêci¹.
		 * Nie wiem z kolei czy zachowane jest buforowanie,
		 * czy nie mielibyœmy tego wspomnianego migania (jak w animacji).
		 * 
		 */
	}
	
}
