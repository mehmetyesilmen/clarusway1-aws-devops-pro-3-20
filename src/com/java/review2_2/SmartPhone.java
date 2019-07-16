package com.java.review2_2;

public abstract class SmartPhone implements Camera {
	protected String version;

	public abstract void sendMsg(String name, String msg);

	public abstract void receiveMsg(String name, String msg);

	public void makePhoneCalls(String name) {
		System.out.println("Calling " + name);
	}

	public void receivePhoneCalls(String personName) {
		System.out.println("Receiving call from " + personName);
	}

	public String getVersion() {
		return version;
	}
}
