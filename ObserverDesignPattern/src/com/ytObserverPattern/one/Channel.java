package com.ytObserverPattern.one;

import java.util.ArrayList;

// concrete subject: a youtube chanel that observers can subscribe to
public class Channel implements IChannel{
	ArrayList<ISubscriber> subscribers = new ArrayList<>(); //list of subscribers
	String name;
	String latestVedio;
	
	public Channel(String name) {
		this.name = name;
	}
	
	//Add a subscriber (avoid duplicates)

	@Override
	public void subscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		 if (!subscribers.contains(subscriber)) {
		            subscribers.add(subscriber);
		        }
	}

	//remove a subscriber if present
	
	@Override
	public void unsubscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		if (subscribers.contains(subscriber)) {
			subscribers.remove(subscriber);
		}
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for (ISubscriber sub : subscribers) {
        sub.update();
		}
	}
	
	public void uploadVedio(String title) {
		latestVedio = title;
		System.out.println("["+ name + "uploaded :" + title + "]");
		notifySubscriber();
	}
	
	public String getVedioData() {
		return "\nCheckout our latest vedio : " + latestVedio + "\n";
	}
	
}
