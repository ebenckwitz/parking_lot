import java.util.ArrayList;

public class vanSpot extends parkingspot {
	
	public vanSpot(int spot, boolean occupied) {
		super(spot, occupied);
	}
	
	public static int spotsRemaining(ArrayList<parkingspot> spots) {
		int remaining = 0;
		for(int i = 30; i < 50; i=i+4) {
			if(spots.get(i).occupiedStatus == false) {
				remaining++;
			}
		}
		return remaining;
	}

}
