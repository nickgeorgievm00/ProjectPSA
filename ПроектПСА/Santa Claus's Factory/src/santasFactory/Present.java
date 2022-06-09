package santasFactory;

public abstract class Present {
	private String colour;
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract void prepare();
}
