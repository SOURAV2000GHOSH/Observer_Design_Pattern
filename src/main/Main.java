package main;

import observerFolder.EmailNotification;
import observerFolder.MessageNotification;
import subject.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone iphoneSubject = new Iphone();
		EmailNotification emailNotification = new EmailNotification(iphoneSubject);
		MessageNotification messageNotification = new MessageNotification(iphoneSubject);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		iphoneSubject.updateStock(10);
	}
}
