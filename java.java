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

public class java {
	public static SubScene subJava() {
		//text 
		
		Label java = new Label("Java");
		java.setFont(new Font("Trajan", 30)); 
		
		Line l1 = new Line(400, 50, 1100, 50); 
		
		Text javaText = new Text("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[citation not found][19][20] particularly for client–server web applications, with a reported 9 million developers.[21]\r\n"
				+ "\r\n"
				+ "Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux distributions.\r\n"
				+ "\r\n"
				+ "As of March 2023, Java 20 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions."
				+ "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991.[22] Java was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time.[23] The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.[24] Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar.[25]\r\n"
				+ "\r\n"
				+ "Sun Microsystems released the first public implementation as Java 1.0 in 1996.[26] It promised write once, run anywhere (WORA) functionality, providing no-cost run-times on popular platforms. Fairly secure and featuring configurable security, it allowed network- and file-access restrictions. Major web browsers soon incorporated the ability to run Java applets within web pages, and Java quickly became popular. The Java 1.0 compiler was re-written in Java by Arthur van Hoff to comply strictly with the Java 1.0 language specification.[27] With the advent of Java 2 (released initially as J2SE 1.2 in December 1998 – 1999), new versions had multiple configurations built for different types of platforms. J2EE included technologies and APIs for enterprise applications typically run in server environments, while J2ME featured APIs optimized for mobile applications. The desktop version was renamed J2SE. In 2006, for marketing purposes, Sun renamed new J2 versions as Java EE, Java ME, and Java SE, respectively.\r\n"
				+ "\r\n"
				+ "In 1997, Sun Microsystems approached the ISO/IEC JTC 1 standards body and later the Ecma International to formalize Java, but it soon withdrew from the process.[28][29][30] Java remains a de facto standard, controlled through the Java Community Process.[31] At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status. Sun generated revenue from Java through the selling of licenses for specialized products such as the Java Enterprise System.\r\n"
				+ "\r\n"
				+ "On November 13, 2006, Sun released much of its Java virtual machine (JVM) as free and open-source software (FOSS), under the terms of the GPL-2.0-only license. On May 8, 2007, Sun finished the process, making all of its JVM's core code available under free software/open-source distribution terms, aside from a small portion of code to which Sun did not hold the copyright.[32]"
				); 

		javaText.setFont(new Font("Trajan", 18)); 
		javaText.setWrappingWidth(700); 
		VBox textV = new VBox(10, java, l1, javaText); 
		
		//images
		Image javaImg = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/182px-Java_programming_language_logo.svg.png");
	        ImageView imgView = new ImageView(javaImg);

	        
	        VBox imgV = new VBox(100, imgView); 
	
		HBox h1 = new HBox(30, textV, imgV); 
		h1.setPadding(new Insets(60)); 
		
		ScrollPane sp = new ScrollPane(h1); 
		
		SubScene subJava = new SubScene(sp, 1200, 820, true, SceneAntialiasing.DISABLED);
		return subJava;
	}
}
