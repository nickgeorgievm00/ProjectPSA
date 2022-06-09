package santasFactory;

public class BikeWorksop extends SantaWorkshop {

	@Override
	public Present createPresent(String presentType) {
		if(presentType == "BIKE") {
			return new Bike();
		}
		System.out.println("New bike produced");
		return null;
	}

}
