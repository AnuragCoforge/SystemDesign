package com.ytObserverPattern.one;

public class ObserverPatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channel channel = new Channel("Anurag Tiwari");
		Subscriber sub1 = new Subscriber("Varun", channel);
		Subscriber sub2 = new Subscriber("Tarun", channel);
		
		//Varun and Tarun subscribe to Anurag Tiwari 
		channel.subscribe(sub1);
		channel.subscribe(sub2);
		
		//Upload a vedio: bot Varun and Tarun are notified
		channel.uploadVedio("Movie 1");
		
		// Varun unsubscribes: Tarun remains subscribed
		channel.unsubscribe(sub1);
		
		//Upload a vedio: only Tarun will be notified this time.
		channel.uploadVedio("Movie 2");
		
	}

}
