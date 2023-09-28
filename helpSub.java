package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class helpSub {
	public static SubScene helpSub() {
		
		Label helpLbl = new Label("Help");
		helpLbl.setStyle("-fx-background-color: transparent; -fx-text-fill: red; -fx-font-size: 65pt");
		
		
		Label helpText = new Label("\nAnswers to common problems can be found at frequently\n"
                + "\n"
                + "asked questions. Or check out where to ask questions or make comments.\n"
                + "\n"
                + "New users should seek help at the Teahouse if they're having problems\n"
                + "\n"
                + "editing Wikipedia. More complex questions can be posed at the Help desk.\n"
                + "\n"
                + "Volunteers will respond as soon as they're able. Or ask for help on your talk\n"
                + "\n"
                + "page and a volunteer will visit you there! You can get live help with editing in\n"
                + "\n"
                + "the help chatroom. For help with technical issues, ask at the Village pump.");

	   helpText.setStyle("-fx-text-fill: white; -fx-font-size: 20pt; -fx-font-style: italic; -fx-font-weight: bold; -fx-font-style: Verdana");
	   //Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
       //helpText.setFont(font);
       helpText.setTextAlignment(TextAlignment.CENTER);
        
       Image helpImg = new Image("file:/Users/anthonyshen/Desktop/helpPhoto.png "); 
       ImageView imgView = new ImageView(helpImg);

       imgView.setFitHeight(200);
       imgView.setFitWidth(200);
       
        VBox helpVBox = new VBox(helpLbl, helpText, imgView);
        helpLbl.setTranslateY(-55);
        helpVBox.setAlignment(Pos.CENTER);
        helpVBox.setPadding(new Insets(15));
        helpVBox.setStyle("-fx-background-color: transparent;");
        
        SubScene helpsub = new SubScene(helpVBox, 1200, 840, true, SceneAntialiasing.DISABLED);
        return helpsub;
	}
}
