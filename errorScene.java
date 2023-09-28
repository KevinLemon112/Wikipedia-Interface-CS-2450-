
 

package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class errorScene {
	public static SubScene errorScene() {
		Label errorLabel = new Label("Error");
		errorLabel.setFont(new Font("Trajan", 90));
		errorLabel.setTranslateY(55);
		
		HBox hbox = new HBox(errorLabel);
		hbox.setAlignment(Pos.CENTER);
		
		Label errorDesc = new Label("			   This page was not found. \nIt is either under construction or does not exist. \nFor more information, please explore our help page!");
		errorDesc.setFont(new Font("Trajan", 55));
		errorDesc.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox(errorDesc);
		hbox2.setAlignment(Pos.CENTER);
		
		errorLabel.setStyle("-fx-text-fill: red; -fx-font-size: 80pt; -fx-font-style: italic; -fx-font-weight: bold;");
		
		errorDesc.setStyle("-fx-text-fill: black; -fx-font-size: 40pt; -fx-font-style: italic; -fx-font-weight: bold; -fx-border-style: solid;");
	
		Image img = new Image("file:/Users/anthonyshen/Desktop/errorImg.png "); 
		ImageView imgView = new ImageView(img);
		
		VBox box = new VBox(hbox2, imgView);
		box.setAlignment(Pos.CENTER);
		box.setPadding(new Insets(95));
		box.setTranslateY(-150);
		
		BorderPane pane = new BorderPane();
		pane.setTop(hbox);
		pane.setCenter(box);
		
		SubScene errorScene = new SubScene(pane, 1500, 1500, true, SceneAntialiasing.DISABLED);
		return errorScene;
	}
	
}

