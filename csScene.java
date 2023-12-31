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

public class csScene {
	public static SubScene subCS() {
		//text 
		Label cs = new Label("Computer Science");
		cs.setFont(new Font("Trajan", 30)); 
		
		Line l1 = new Line(400, 50, 1100, 50); 
		
		Text csText = new Text("Computer science is the study of computation, information, and automation.[1][2][3] Computer science spans theoretical disciplines (such as algorithms, theory of computation, and information theory) to applied disciplines (including the design and implementation of hardware and software).[4][5][6] Though more often considered an academic discipline, computer science is closely related to computer programming.[7]\r\n"
				+ "\r\n"
				+ "Algorithms and data structures are central to computer science.[8] The theory of computation concerns abstract models of computation and general classes of problems that can be solved using them. The fields of cryptography and computer security involve studying the means for secure communication and for preventing security vulnerabilities. Computer graphics and computational geometry address the generation of images. Programming language theory considers different ways to describe computational processes, and database theory concerns the management of repositories of data. Human–computer interaction investigates the interfaces through which humans and computers interact, and software engineering focuses on the design and principles behind developing software. Areas such as operating systems, networks and embedded systems investigate the principles and design behind complex systems. Computer architecture describes the construction of computer components and computer-operated equipment. Artificial intelligence and machine learning aim to synthesize goal-orientated processes such as problem-solving, decision-making, environmental adaptation, planning and learning found in humans and animals. Within artificial intelligence, computer vision aims to understand and process image and video data, while natural language processing aims to understand and process textual and linguistic data.\r\n"
				+ "\r\n"
				+ "The fundamental concern of computer science is determining what can and cannot be automated.[2][9][3][10][11] The Turing Award is generally recognized as the highest distinction in computer science.[12][13]"
				+ "The earliest foundations of what would become computer science predate the invention of the modern digital computer. Machines for calculating fixed numerical tasks such as the abacus have existed since antiquity, aiding in computations such as multiplication and division. Algorithms for performing computations have existed since antiquity, even before the development of sophisticated computing equipment.[17]\r\n"
				+ "\r\n"
				+ "Wilhelm Schickard designed and constructed the first working mechanical calculator in 1623.[18] In 1673, Gottfried Leibniz demonstrated a digital mechanical calculator, called the Stepped Reckoner.[19] Leibniz may be considered the first computer scientist and information theorist, because of various reasons, including the fact that he documented the binary number system. In 1820, Thomas de Colmar launched the mechanical calculator industry[note 1] when he invented his simplified arithmometer, the first calculating machine strong enough and reliable enough to be used daily in an office environment. Charles Babbage started the design of the first automatic mechanical calculator, his Difference Engine, in 1822, which eventually gave him the idea of the first programmable mechanical calculator, his Analytical Engine.[20] He started developing this machine in 1834, and \"in less than two years, he had sketched out many of the salient features of the modern computer\".[21] \"A crucial step was the adoption of a punched card system derived from the Jacquard loom\"[21] making it infinitely programmable.[note 2] In 1843, during the translation of a French article on the Analytical Engine, Ada Lovelace wrote, in one of the many notes she included, an algorithm to compute the Bernoulli numbers, which is considered to be the first published algorithm ever specifically tailored for implementation on a computer.[22] Around 1885, Herman Hollerith invented the tabulator, which used punched cards to process statistical information; eventually his company became part of IBM. Following Babbage, although unaware of his earlier work, Percy Ludgate in 1909 published[23] the 2nd of the only two designs for mechanical analytical engines in history. In 1937, one hundred years after Babbage's impossible dream, Howard Aiken convinced IBM, which was making all kinds of punched card equipment and was also in the calculator business[24] to develop his giant programmable calculator, the ASCC/Harvard Mark I, based on Babbage's Analytical Engine, which itself used cards and a central computing unit. When the machine was finished, some hailed it as \"Babbage's dream come true\".[25]\r\n"
				+ "\r\n"
				+ "During the 1940s, with the development of new and more powerful computing machines such as the Atanasoff–Berry computer and ENIAC, the term computer came to refer to the machines rather than their human predecessors.[26] As it became clear that computers could be used for more than just mathematical calculations, the field of computer science broadened to study computation in general. In 1945, IBM founded the Watson Scientific Computing Laboratory at Columbia University in New York City. The renovated fraternity house on Manhattan's West Side was IBM's first laboratory devoted to pure science. The lab is the forerunner of IBM's Research Division, which today operates research facilities around the world.[27] Ultimately, the close relationship between IBM and Columbia University was instrumental in the emergence of a new scientific discipline, with Columbia offering one of the first academic-credit courses in computer science in 1946.[28] Computer science began to be established as a distinct academic discipline in the 1950s and early 1960s.[7][29] The world's first computer science degree program, the Cambridge Diploma in Computer Science, began at the University of Cambridge Computer Laboratory in 1953. The first computer science department in the United States was formed at Purdue University in 1962.[30] Since practical computers became available, many applications of computing have become distinct areas of study in their own rights."
				); 

		csText.setFont(new Font("Trajan", 18)); 
		csText.setWrappingWidth(700); 
		VBox textV = new VBox(10, cs, l1, csText); 
		
		//images
		Image csImg = new Image("https://upload.wikimedia.org/wikipedia/commons/3/36/Lambda_calculus-Church_numerals.png");
	        ImageView imgView = new ImageView(csImg);
	        Image csImg2 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Half_Adder.svg/240px-Half_Adder.svg.png");
	        ImageView imgView2 = new ImageView(csImg2); 
	        Image csImg3 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Activemarker2.PNG/186px-Activemarker2.PNG");
        ImageView imgView3 = new ImageView(csImg3); 
	        
	        VBox imgV = new VBox(100, imgView, imgView2, imgView3); 
	
		HBox h1 = new HBox(30, textV, imgV); 
		h1.setPadding(new Insets(60)); 
		
		ScrollPane sp = new ScrollPane(h1); 
		
		SubScene subCS = new SubScene(sp, 1200, 820, true, SceneAntialiasing.DISABLED);
		return subCS;
	}
}
