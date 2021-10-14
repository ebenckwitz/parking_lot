import java.util.ArrayList;

public class parkingspot {
	int spotNum;
	boolean occupiedStatus;
	
	public parkingspot(int spot, boolean status) {
		this.spotNum = spot;
		this.occupiedStatus = status;
	}

	public static boolean isEmpty(ArrayList<parkingspot> spots) {
		boolean empty = true;
		for(int i = 0; i < spots.size(); i++) {
			if(spots.get(i).occupiedStatus == true) {
				empty = false;
				break;
			}
		}
		return empty;
	}
	
	public static int spotsRemaining(ArrayList<parkingspot> spots) {
		int remaining = 50;
		for(int i = 0; i < 30; i++) {
			if(spots.get(i).occupiedStatus == true) {
				remaining--;
			}
		}
		
		//vans taking up 4 spots, therefore if there is a van, take away 4 spots
		for(int i = 30; i < 50; i=i+4) {
			if(spots.get(i).occupiedStatus == true) {
				remaining = remaining - 4;
			}
		}
		return remaining;
	}
	
	public static void setVehicle(ArrayList<parkingspot> spots, vehicle v1, int spot) {
		if(spot < 10) {
			spots.set(spot, new motorcycleSpot(spot, true));		
		} else if(spot > 10 && spot < 30) {
			spots.set(spot, new carSpot(spot, true));
		} else if(spot > 30 && spot < 50) {
			spots.set(spot, new vanSpot(spot, true));
		}

	}
	
	
}
