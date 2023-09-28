package application;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class rotate {
	private static final double ROTATE_SECS   = 30;
	public static RotateTransition rotateAroundYAxis(Node node) {
	    RotateTransition rotate = new RotateTransition(
	      Duration.seconds(ROTATE_SECS), 
	      node
	    );
	    rotate.setAxis(Rotate.Y_AXIS);
	    rotate.setFromAngle(360);
	    rotate.setToAngle(0);
	    rotate.setInterpolator(Interpolator.LINEAR);
	    rotate.setCycleCount(RotateTransition.INDEFINITE);

	    return rotate;
	  }
}
