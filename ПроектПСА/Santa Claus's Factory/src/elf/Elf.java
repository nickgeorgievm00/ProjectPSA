package elf;

public class Elf implements Observer {
	
	private String name;
	private Observable message;

	public Elf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.message == null) {
			System.out.println("No message sent");
			return;
		}
		String lastMessage = this.message.getUpdate();
		System.out.println(this.name + " received: " + lastMessage);
	}

	@Override
	public void setMessage(Observable message) {
		this.message = message;
	}

}
