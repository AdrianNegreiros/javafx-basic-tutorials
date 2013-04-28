package main;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesSimples extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(10); // 1
		raiz.setAlignment(Pos.CENTER); // 2

		Label rotuloDemo = new Label("Sou um r�tulo de texto!"); // 3
		rotuloDemo.setTooltip(new Tooltip(
				"Esse � um r�tulo para mostrar textos de forma simples")); // 4

		TextField campoTexto = new TextField("Digite algo"); // 5
		campoTexto.setTooltip(new Tooltip(
				"Campo de texto para entrada de uma s� linha "));

		TextArea areaTexto = new TextArea("Digite algo com v�rias linhas"); // 6
		areaTexto.setTooltip(new Tooltip(
				"Campo de texto para entrada de m�ltiplas linhas"));

		Separator separadorHorizontal = new Separator(); // 7
		Separator separadorVertical = new Separator(Orientation.VERTICAL); // 8
		Slider deslizante = new Slider(); // 9
		deslizante.setShowTickLabels(true); // 10
		deslizante.setShowTickMarks(true); // 11
		deslizante
				.setTooltip(new Tooltip(
						"O controle deslizante tem um valor num�rico de acordo com sua posi��o"));

		raiz.getChildren().addAll(rotuloDemo, campoTexto, areaTexto,
				separadorVertical, separadorHorizontal, deslizante);

		Scene cena = new Scene(raiz, 300, 400);
		palco.setTitle("Controles B�sicos I");
		palco.setScene(cena);
		palco.show();
	}
}