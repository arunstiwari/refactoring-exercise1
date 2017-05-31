package com.arun;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void reverseWordsWhichIsNotMightyMouse() {
		Application app = new Application();
		app.process(new String[]{"Wonderful","Session"});
	}

}
