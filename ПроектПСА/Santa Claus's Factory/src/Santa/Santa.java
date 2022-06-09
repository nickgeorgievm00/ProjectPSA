package Santa;

public class Santa {
	
private static Santa instance;
	
	private Santa() {
		// TODO Auto-generated constructor stub
	}

	public static Santa getInstance() {
		
		if(instance == null) {
			instance = new Santa();
		}
		
		return instance;
	}
	
	public void giveOrder1(String order1) {
		System.out.println("Santa says: " + order1);
	}
	
	public void giveOrder2(String order2) {
		System.out.println("Santa says: " + order2);
	}

}
