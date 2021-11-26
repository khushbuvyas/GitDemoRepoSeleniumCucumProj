package com.m2at.enums;

public enum Waits {
	
	EXPLICIT_WAIT(10L);
	
	private long waitTime;
	
	private Waits(long waitTime) {
		
		this.waitTime = waitTime;
	}
	
	public long getWaitTime() {
		
		return waitTime;
	}

}
