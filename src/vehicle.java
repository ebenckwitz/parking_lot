
public class vehicle {
	String model;
	String color;
	int year;

	public vehicle(String m, String c, int y) {
		this.model = m;
		this.color = c;
		this.year = y;
	}
	
	public vehicle() {
		this.model = "BLANK";
		this.color = "BLANK";
		this.year = 0000;
	}
	
	public String printVehicle() {
		return " " + this.model + " " + this.color + " " + this.year;
	}
}
