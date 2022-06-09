package elf;

public interface Observable {
	void iwantbikes(Observer observer);
	void iwantdolls(Observer observer);
	
	void notifyObservers();
	String getUpdate();
}
