package magicBoard;

public class VoiceController {
	private Command order;

	public Command getCommand() {
		return order;
	}

	public void setCommand(Command order) {
		this.order = order;
	}
	
	public void voiceActivated() {
		if(this.order == null) {
			System.out.println("No order given");
			return;
		}
		this.order.execute();
	}
}
