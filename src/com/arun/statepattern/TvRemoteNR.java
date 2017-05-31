package com.arun.statepattern;

public class TvRemoteNR {

	private String state;

	public boolean doAction() {
		if(state.equalsIgnoreCase("OFF"))
			return false;
		else if(state.equalsIgnoreCase("ON"))
			return true;
		else 
			return false;
	}

	public void setState(String state) {
		this.state = state;
	}

}
