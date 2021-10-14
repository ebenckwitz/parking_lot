
public class motorcycle extends vehicle {

	public motorcycle(String m, String c, int y) {
		super(m, c, y);
	}
	
	public motorcycle() {
		super();
	}	
	
	@Override
	public String printVehicle() {
		return "Model: " + this.model + ", Color: " + this.color + ", Year: " + this.year;
	}
}
