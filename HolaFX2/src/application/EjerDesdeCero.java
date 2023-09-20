package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EjerDesdeCero extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	

	public void start(Stage escenario) throws Exception{
		Text mensaje = new Text("");
		Button aceptarBtn = new Button("Hola");
		TextField textField = new TextField();
		aceptarBtn.setOnAction(event -> {
			if (textField.getText().equals("Obi wan")) {
				mensaje.setText("¡General Kenobi!");
			}else {
				mensaje.setText("Hola "+textField.getText());
			}
		});
		
		VBox raiz = new VBox();
		raiz.getChildren().add(textField);
		raiz.getChildren().add(aceptarBtn);
		raiz.getChildren().add(mensaje);
		Scene escena = new Scene(raiz, 300, 100);
		escenario.setTitle("HolaFX Aplicacion");
		escenario.setScene(escena);
		escenario.show();
	}
	
}
