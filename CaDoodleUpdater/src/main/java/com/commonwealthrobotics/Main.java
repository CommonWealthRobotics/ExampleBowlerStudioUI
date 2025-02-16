/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.commonwealthrobotics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		LatestFromGithubLaunchUI.stage=stage;
		Parent root = FXMLLoader.load(Main.class.getResource("ui.fxml"));

		Scene scene = new Scene(root, 600, 523);

		
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String [] args) {
		//LatestFromGithubLaunchUI.argsFromSystem=args;
		LatestFromGithubLaunchUI.argsFromSystem=new String[] {
				"-g",
				"https://github.com/CommonWealthRobotics/CaDoodle-script.git",
				"Main.groovy"
		};
		LatestFromGithubLaunchUI.project="CommonWealthRobotics";
		LatestFromGithubLaunchUI.repoName=		"BowlerStudio";
		LatestFromGithubLaunchUI.jarName=		"BowlerStudio.jar";
		
		launch(args);
	}

}

   
	
