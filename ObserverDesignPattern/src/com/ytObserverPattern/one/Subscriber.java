package com.ytObserverPattern.one;

public class Subscriber implements ISubscriber{
	String name;
	Channel channel;
	
	public Subscriber(String name, Channel channel) {
		super();
		this.name = name;
		this.channel = channel;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Hey" + name + "," + channel.getVedioData());
	}
}
