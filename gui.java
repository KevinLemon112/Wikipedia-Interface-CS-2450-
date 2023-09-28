package application;

import javafx.geometry.Insets;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class gui {
	public static SubScene subGUI() {
		Label gui = new Label("Graphical User Interface");
		gui.setFont(new Font("Trajan", 30)); 
		
		Line l1 = new Line(400, 50, 1100, 50); 
		
		Text GUIText = new Text("The GUI (/ˌdʒiːjuːˈaɪ/ JEE-yoo-EYE[1][Note 1] or /ˈɡuːi/[2] GOO-ee), or graphical user interface, is a form of user interface that allows users to interact with electronic devices through graphical icons and audio indicator such as primary notation, instead of text-based UIs, typed command labels or text navigation. GUIs were introduced in reaction to the perceived steep learning curve of CLIs (command-line interfaces),[3][4][5] which require commands to be typed on a computer keyboard.\r\n"
				+ "\r\n"
				+ "The actions in a GUI are usually performed through direct manipulation of the graphical elements.[6][7][8] Beyond computers, GUIs are used in many handheld mobile devices such as MP3 players, portable media players, gaming devices, smartphones and smaller household, office and industrial controls. The term GUI tends not to be applied to other lower-display resolution types of interfaces, such as video games (where HUD (head-up display)[9] is preferred), or not including flat screens like volumetric displays[10] because the term is restricted to the scope of 2D display screens able to describe generic information, in the tradition of the computer science research at the Xerox Palo Alto Research Center."
				+ "Designing the visual composition and temporal behavior of a GUI is an important part of software application programming in the area of human–computer interaction. Its goal is to enhance the efficiency and ease of use for the underlying logical design of a stored program, a design discipline named usability. Methods of user-centered design are used to ensure that the visual language introduced in the design is well-tailored to the tasks.\r\n"
				+ "\r\n"
				+ "The visible graphical interface features of an application are sometimes referred to as chrome or GUI (pronounced gooey).[11][12][13] Typically, users interact with information by manipulating visual widgets that allow for interactions appropriate to the kind of data they hold. The widgets of a well-designed interface are selected to support the actions necessary to achieve the goals of users. A model–view–controller allows flexible structures in which the interface is independent of and indirectly linked to application functions, so the GUI can be customized easily. This allows users to select or design a different skin at will, and eases the designer's work to change the interface as user needs evolve. Good GUI design relates to users more, and to system architecture less. Large widgets, such as windows, usually provide a frame or container for the main presentation content such as a web page, email message, or drawing. Smaller ones usually act as a user-input tool.\r\n"
				+ "\r\n"
				+ "A GUI may be designed for the requirements of a vertical market as application-specific GUIs. Examples include automated teller machines (ATM), point of sale (POS) touchscreens at restaurants,[14] self-service checkouts used in a retail store, airline self-ticket and check-in, information kiosks in a public space, like a train station or a museum, and monitors or control screens in an embedded industrial application which employ a real-time operating system (RTOS).\r\n"
				+ "\r\n"
				+ "Cell phones and handheld game systems also employ application specific touchscreen GUIs. Newer automobiles use GUIs in their navigation systems and multimedia centers, or navigation multimedia center combinations."
				); 
		

		GUIText.setFont(new Font("Trajan", 18)); 
		GUIText.setWrappingWidth(700); 
		VBox textV = new VBox(10, gui, l1, GUIText); 
		
		//images
		Image GUIImg = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Shot-2014-12-22_20-47-54.png/330px-Shot-2014-12-22_20-47-54.png");
	    ImageView imgView = new ImageView(GUIImg);
	    
	    VBox imgV = new VBox(100, imgView); 
	
		HBox h1 = new HBox(30, textV, imgV); 
		h1.setPadding(new Insets(60)); 
		
		ScrollPane sp = new ScrollPane(h1); 
		
		SubScene subGUI = new SubScene(sp, 1200, 820, true, SceneAntialiasing.DISABLED);
		return subGUI;
	}
}
