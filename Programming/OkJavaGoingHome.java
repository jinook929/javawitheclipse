import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

// import org.opentutorials.iot.*;

public class OkJavaGoingHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";

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
		
	}

}
