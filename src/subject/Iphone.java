package subject;

import java.util.ArrayList;
import java.util.List;

import observerFolder.Observer;

public class Iphone implements Subject {
	List<Observer> observers = new ArrayList<>();
	private int stockCount;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void updateStock(int stockCount) {
		if (this.stockCount == 0) {
			notifyObserver();
		}
		this.stockCount += stockCount;
	}

}
