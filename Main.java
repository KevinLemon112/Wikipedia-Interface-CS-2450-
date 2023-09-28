package application;
	
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Line;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;


public class Main extends Application {
	
	private static final String DIFFUSE_MAP = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Wikipedia-logo-v2.svg/240px-Wikipedia-logo-v2.svg.png"; 
	//private static final String DIFFUSE_MAP = "file:/Users/anthonyshen/Desktop/wikiGlobe"; 

	private static final String NORMAL_MAP = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Wikipedia-logo-v2.svg/240px-Wikipedia-logo-v2.svg.png";
    private static final String SPECULAR_MAP = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Wikipedia-logo-v2.svg/240px-Wikipedia-logo-v2.svg.png";
	
    Image spImg = new Image("file:/Users/anthonyshen/Desktop/wikiGlobe");
   
    Image Wikilogo= new Image("https://upload.wikimedia.org/wikipedia/en/thumb/8/80/Wikipedia-logo-v2.svg/1920px-Wikipedia-logo-v2.svg.png");
	ImageView logo = new ImageView(Wikilogo);
	
	
    @Override
	public void start(Stage primaryStage) {
    	
    	BorderPane pane = new BorderPane();
		
		MenuBar menuBar = new MenuBar();
		// Create the File menu
		Menu menu = new Menu("Menu", logo); 
		logo.setFitHeight(40);
		logo.setFitWidth(40);
		Menu help = new Menu("Help");
		Menu view = new Menu("View");
		
		
		RadioMenuItem option1 = new RadioMenuItem("Main Page");
		RadioMenuItem option2 = new RadioMenuItem("Categories");
		RadioMenuItem option3 = new RadioMenuItem("Help Page");
		
		
		ToggleGroup tg = new ToggleGroup();
		
		option1.setToggleGroup(tg);
		option2.setToggleGroup(tg);
		
		view.getItems().addAll(option1, option2);
		help.getItems().addAll(option3);
		
		MenuItem exitItem = new MenuItem("Exit"); 
		menu.getItems().addAll(view, help, exitItem);

		exitItem.setOnAction(event ->
		{
			primaryStage.close();
		});
		
		SeparatorMenuItem sep = new SeparatorMenuItem();
		// Add the File menu to the menu bar. 
		menuBar.getMenus().addAll(menu);
		
		
		Label WikiLabel = new Label("Wikipedia");
		
		Label desLabel = new Label("The Free Encyclopedia");
		WikiLabel.setId("wikiLabel");
		
		desLabel.setFont(new Font("Trajan", 30));
		desLabel.setId("desLabel");
		
		TextField searchBar = new TextField();
		
		Button enter = new Button("Enter");
		
		Sphere sphere = new Sphere(250); 
		
		PhongMaterial sphereImg = new PhongMaterial();
		sphereImg.setDiffuseMap(new Image(DIFFUSE_MAP, 0, 0, true,true));
		
		//sphereImg.setBumpMap(new Image(NORMAL_MAP,0, 0, true,true));
		//sphereImg.setSpecularMap(new Image(SPECULAR_MAP, 100,100,true,true));
		
		sphere.setMaterial(sphereImg);

		//creating list for categories
		Label cat = new Label("Categories");
		cat.setId("catLabel");
		ListView list = new ListView();
    	Line sepLine = new Line();
    	Label a = new Label("A: ");
    	Label b = new Label("B: ");
    	Label c = new Label("C: ");
        Label d = new Label("D: ");
        Label e = new Label("E: ");
        Label f = new Label("F: ");
        Label g = new Label("G: ");
        Label h = new Label("H: ");
        Label i = new Label("I: ");
        Label j = new Label("J: ");
        Label k = new Label("K: ");
        Label l = new Label("L: ");
        Label m = new Label("M: ");
        Label n = new Label("N: ");
        Label o = new Label("O: ");
        Label p = new Label("P: ");
        Label q = new Label("Q: ");
        Label r = new Label("R: ");
        Label s = new Label("S: ");
        Label t = new Label("T: ");
        Label u = new Label("U: ");
        Label v = new Label("V: ");
        Label w = new Label("W: ");
        Label x = new Label("X: ");
        Label y = new Label("Y: ");
        Label z = new Label("Z: ");
        
        Button CS = new Button("Computer Science");
        Button Java = new Button("Java");
    	Button GUI = new Button("GUI");
    	
    	Button anteater = new Button("Anteater");
    	anteater.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	Button australia = new Button("Australia");
    	australia.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	Button bear = new Button("Bear");
    	bear.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	Button ball = new Button("Ball");
    	ball.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button cali = new Button("California");
    	cali.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button Canada = new Button("Canada");
    	Canada.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button Denmark = new Button("Denmark");
    	Denmark.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button Elon = new Button("Elon Musk");
    	Elon.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button france = new Button("France");
    	france.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button hand = new Button("Hand");
    	hand.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button ion = new Button("Ion");
    	ion.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button karaoke = new Button("Karaoke");
    	karaoke.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button lake = new Button("Lake");
    	lake.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button machine = new Button("Machine");
    	machine.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button narrow = new Button("Narrow");
    	narrow.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button object = new Button("Object");
    	object.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button person = new Button("Person");
    	person.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button quack = new Button("Quack");
    	quack.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button restaurant = new Button("Restaurant");
    	restaurant.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button star = new Button("Star");
    	star.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button tetris = new Button("Tetris");
    	tetris.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button universe = new Button("Universe");
    	universe.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button vault = new Button("Vault");
    	vault.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button wedding = new Button("Wedding");
    	wedding.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button yellow = new Button("Yellow");
    	yellow.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button xray = new Button("Xray");
    	xray.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
    	Button zoo = new Button("Zoo");
    	zoo.setOnAction(event -> {
    		pane.setCenter(errorScene.errorScene());
			primaryStage.show();
    	});
    	
        list.getItems().addAll(a, anteater, australia, sepLine, b, ball, bear, sepLine, c, Canada, cali, CS, sepLine, d, Denmark, sepLine, e, Elon, sepLine, f, france, sepLine, g, GUI, sepLine, h, hand, sepLine, i, ion, sepLine, j, Java, sepLine, k, karaoke, sepLine, l, lake, sepLine, m, machine, sepLine, n, narrow, sepLine, o, object, sepLine, p, person, sepLine, q, quack, sepLine, r, restaurant, sepLine, s, star, sepLine, t, tetris, sepLine, u, universe, sepLine, v, vault, sepLine, w, wedding, sepLine, x, xray, sepLine, y, yellow, sepLine, z, zoo);
		
		PerspectiveCamera cam = new PerspectiveCamera(true);
		cam.getTransforms().addAll(new Translate(0, 0, -100));
		
		
		HBox hbox = new HBox(searchBar, enter);
		hbox.setAlignment(Pos.CENTER);
		
		
		//new scene for Computer Science
		CS.setOnAction(event -> {
			pane.setCenter(csScene.subCS());
			primaryStage.show();
    	});
    	
		//new scene for java
    	Java.setOnAction(event -> {
    		pane.setCenter(java.subJava());		
			primaryStage.show();
    	});
    	
    	//new scene for GUI
    	GUI.setOnAction(event -> {
			pane.setCenter(gui.subGUI());		
			primaryStage.show();
    	});
		
		enter.setOnAction(event ->
		{
			String input = searchBar.getText();
			input = input.toLowerCase();
			
			if(input.equals("java"))
			{
				pane.setCenter(java.subJava());
				primaryStage.show();
			}
			
			else if(input.equals("gui"))
			{
				pane.setCenter(gui.subGUI());		
				primaryStage.show();
			}
			
			else if(input.equals("computer science"))
			{
				pane.setCenter(csScene.subCS());
				primaryStage.show();
			}
			
			else
			{
				pane.setCenter(errorScene.errorScene());
				primaryStage.show();
			}
		});
		
		
		hbox.setScaleX(1.75);
		hbox.setScaleY(1.75);
		
		hbox.setTranslateY(30);
		sphere.setTranslateY(10);
		
		VBox box = new VBox(WikiLabel, desLabel, sphere); 
		box.setPadding(new Insets(35));
		box.setAlignment(Pos.CENTER);
		box.setStyle("-fx-background-color: transparent");
		
		SubScene homesub = new SubScene(box, 750, 750, true, SceneAntialiasing.DISABLED);
		
		FadeTransition ft = new FadeTransition(Duration.millis(6500), homesub);
	    ft.setFromValue(0.0);
	    ft.setToValue(1.0);
	    ft.play();
		
	    //setting root scene and home page
			
		pane.setCenter(homesub);
		pane.setBottom(hbox);
		pane.setTop(menuBar);	
		hbox.setTranslateY(-40);
		
	
		Scene root = new Scene(pane, 1000, 1000);
		root.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); 
		rotate.rotateAroundYAxis(sphere).play();
		primaryStage.setScene(root);
		primaryStage.show();
		primaryStage.setFullScreen(true);
		
	
		option1.setOnAction(event ->
		{
			pane.setCenter(homesub);
			primaryStage.show();
		});
		
		option2.setOnAction(event ->
		{
	    	VBox vbox = new VBox(cat, list);
	    	vbox.setPadding(new Insets(35));
	    	vbox.setStyle("-fx-background-color: transparent");
	    	
	    	SubScene categoryScene = new SubScene(vbox,1200, 820, true, SceneAntialiasing.DISABLED);
	    	pane.setCenter(categoryScene);
	    	primaryStage.show();
		});
		option3.setOnAction(event ->{
	        pane.setCenter(helpSub.helpSub());
	        primaryStage.show();
	        
		});
		
	}
    
	public static void main(String[] args) {
		launch(args);
	}

	
}
