package application;


import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static Stage stage;	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			
			
			AnchorPane fxmlMenu = (AnchorPane)FXMLLoader.load(getClass().getResource("../view/MenuInicio.fxml"));
			Scene scene = new Scene(fxmlMenu,500,400);
			
			
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setTitle("EDF GARAGEM");
			stage.setScene(scene);
			stage.show();
			setStage(stage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Stage getStage() {
		return stage;
	}



	public static void setStage(Stage stage) {
		Main.stage = stage;
	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
