package magicBoard;

public class MagicBoard {
	private String presentType;
	
	public void iNeedBikes() {
		System.out.println("Bikes");
		this.setPresentType("Bikes");
	}
	
	public void iNeedDolls() {
		System.out.println("Dolls");
		this.setPresentType("Dolls");
	}

	public String getPresentType() {
		return presentType;
	}

	public void setPresentType(String presentType) {
		this.presentType = presentType;
	}


}
