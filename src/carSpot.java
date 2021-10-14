import java.util.ArrayList;

public class carSpot extends parkingspot {
	
	public carSpot(int spot, boolean occupied) {
		super(spot, occupied);
	}
	
	public static int spotsRemaining(ArrayList<parkingspot> spots) {
		int remaining = 0;
		for(int i = 10; i < 30; i++) {
			if(spots.get(i).occupiedStatus == false) {
				remaining++;
			}
		}
		return remaining;
	}

}
