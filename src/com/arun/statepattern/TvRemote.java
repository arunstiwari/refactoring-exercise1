package com.arun.statepattern;

public class TvRemote implements State{

	private State tvState;

	@Override
	public boolean doAction() {
		return this.tvState.doAction();
	}
	
	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

}
