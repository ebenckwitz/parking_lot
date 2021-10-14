import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		ArrayList<parkingspot> spots = new ArrayList<parkingspot>();
		
		/*create parking spaces
		 * 50 in total
		 * 10 for motorcycle
		 * 20 for cars
		 * 20 for vans (one van takes up 4 spots)
		 */
		
		for(int i = 0; i < 10; i++) {
			spots.add(new motorcycleSpot(i, false));
		}
		
		for(int i = 10; i < 30; i++) {
			spots.add(new carSpot(i, false));
		}
		
		for(int i = 30; i < 50; i++) {
			spots.add(new vanSpot(i, false));
		}
		
		//create a vehicle of each kind
		vehicle car1 = new car("Honda", "white", 2019);
		vehicle motorcycle1 = new motorcycle("MotorBike", "Black", 2020);
		vehicle van1 = new van("Scooby-Doo Van", "White", 1995);
		
		//set each vehicle onto a spot position
		parkingspot.setVehicle(spots, car1, 20);
		parkingspot.setVehicle(spots, motorcycle1, 7);
		parkingspot.setVehicle(spots, van1, 42);
		
		System.out.println("Is the parking lot empty? " +parkingspot.isEmpty(spots));
		System.out.println("How many spots remain? " +parkingspot.spotsRemaining(spots));
		System.out.println("How many motorcycle spots remain? " +motorcycleSpot.spotsRemaining(spots));
		System.out.println("How many car spots remain? " +carSpot.spotsRemaining(spots));
		System.out.println("How many van spots remain? " +vanSpot.spotsRemaining(spots));
		System.out.println("What motorcycle do we have? " +motorcycle1.printVehicle());
		System.out.println("What car do we have? " +car1.printVehicle());
		System.out.println("What van do we have? " +van1.printVehicle());
		
	}
}
