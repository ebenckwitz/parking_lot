
public class van extends vehicle {
	
	public van(String m, String c, int y) {
		super(m, c, y);
	}
	
	public van() {
		super();
	}
	
	@Override
	public String printVehicle() {
		return "Model: " + this.model + ", Color: " + this.color + ", Year: " + this.year;
	}

}
