package com.java.review2_2;

public class AndroidPhone extends SmartPhone implements Slack {

	public AndroidPhone(String version) {
		this.version = version;
	}

	@Override
	public void takePics() {
		System.out.println("Taking pics.");
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording...");
	}

	@Override
	public void sendMsg(String name, String msg) {
		System.out.println("Texting " + name);
	}

	@Override
	public void receiveMsg(String name, String msg) {
		System.out.println("Receiving text from " + name);
	}

	public void hangout(String person) {
		System.out.println("Hangout with " + person);
	}

	@Override
	public void slacking(String group, String msg) {
		System.out.println("Slacking " + msg + " to group " + group);
	}
}
