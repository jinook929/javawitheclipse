//import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

// import org.opentutorials.iot.*;

public class OkJavaGoingHomeInput {

	// parameter
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Please enter your address: ");
//		String bright = JOptionPane.showInputDialog("Please enter brightness level: ");
		String id = args[0];
		String bright = args[1];

		// Call elevator
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Turn off security
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Turn on light
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
