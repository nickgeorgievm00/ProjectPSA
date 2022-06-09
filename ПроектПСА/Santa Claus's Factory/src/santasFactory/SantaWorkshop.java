package santasFactory;

public abstract class SantaWorkshop {
	public abstract Present createPresent(String presentType);
	
	public Present producePresent(String presentName) {
		Present present = createPresent(presentName);
		present.prepare();
		return present;
	}

}
