package observerFolder;

import subject.Subject;

public class MessageNotification implements Observer {
	public Subject subject;

	public MessageNotification(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("new stock is available- notification for Message !");
	}

}
