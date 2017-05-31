package com.arun.statepattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TVRemoteNRTest {
	
	private TvRemoteNR tvRemote = new TvRemoteNR();

	@Test
	public void tvShouldSwitchOffWhenOffButtonIsPressed() throws Exception {
		tvRemote.setState("OFF");
		boolean action = tvRemote.doAction();
		assertEquals(false, action);
	}
	
	@Test
	public void tvShouldSwitchOnWhenONButtonIsPressed() throws Exception {
		tvRemote.setState("ON");
		boolean action = tvRemote.doAction();
		assertEquals(true, action);
	}

}
