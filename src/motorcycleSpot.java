import java.util.ArrayList;

public class motorcycleSpot extends parkingspot {
	
	public motorcycleSpot(int spot, boolean occupied) {
		super(spot, occupied);
	}
	
	public static int spotsRemaining(ArrayList<parkingspot> spots) {
		int remaining = 0;
		for(int i = 0; i < 10; i++) {
			if(spots.get(i).occupiedStatus == false) {
				remaining++;
			}
		}
		return remaining;
	}
}