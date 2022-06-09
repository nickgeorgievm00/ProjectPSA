package santasFactory;

public class DollWorksop extends SantaWorkshop {

	@Override
	public Present createPresent(String presentType) {
		if(presentType == "DOLL") {
			return new Doll();
		}
		System.out.println("New doll produced");
		return null;
	}

}
