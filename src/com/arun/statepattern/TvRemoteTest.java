package com.arun.statepattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TvRemoteTest {
	
	private TvRemote tvRemote = new TvRemote();
	
	@Test
	public void tvShouldSwitchOffWhenOffButtonIsPressed() throws Exception {
		tvRemote.setTvState(new TvOffState());
		boolean action = tvRemote.doAction();
		assertEquals(false, action);
	}
	
	@Test
	public void tvShouldSwitchOnWhenONButtonIsPressed() throws Exception {
		tvRemote.setTvState(new TvONState());
		boolean action = tvRemote.doAction();
		assertEquals(true, action);
	}

}
