
public class car extends vehicle {

	public car(String m, String c, int y) {
		super(m, c, y);
	}
	
	public car() {
		super();
	}	
	
	@Override
	public String printVehicle() {
		return "Model: " + this.model + ", Color: " + this.color + ", Year: " + this.year;
	}
	
}
