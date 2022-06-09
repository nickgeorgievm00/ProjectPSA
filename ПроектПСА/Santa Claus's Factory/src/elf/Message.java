package elf;

import java.util.ArrayList;
import java.util.List;

public class Message implements Observable {

	private List<Observer> elves;
	private String message;
	
	public Message() {
		this.elves = new ArrayList<>();
	}

	@Override
	public void iwantbikes(Observer elf) {
		this.elves.add(elf);
		elf.setMessage(this);

	}

	@Override
	public void iwantdolls(Observer elf) {
		this.elves.remove(elf);
		elf.setMessage(null);

	}

	@Override
	public void notifyObservers() {
		for(Observer elf: this.elves) {
			elf.update();
			}

	}

	@Override
	public String getUpdate() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		this.notifyObservers();
	}
}
