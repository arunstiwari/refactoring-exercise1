package com.arun.composemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComposeMethodTest {
	
	@Test
	public void addElement() throws Exception {
		ComposeMethod composeMethod = new ComposeMethod();
		composeMethod.add(new String("Name"), false);
		assertEquals(1, composeMethod.getSize());
		
		composeMethod.add(new String("Description"), false);
		composeMethod.add(new String("Object"), false);
		assertEquals(3, composeMethod.getSize());
	}

	@Test
	public void addElementToRefactoredCode() throws Exception {
		RefactoredComposeMethod composeMethod = new RefactoredComposeMethod();
		
		composeMethod.addOnlyWhenItIsNotReadOnly(new String("Name"), false);
		assertEquals(1, composeMethod.getSize());
		
		composeMethod.addOnlyWhenItIsNotReadOnly(new String("Description"), false);
		composeMethod.addOnlyWhenItIsNotReadOnly(new String("Object"), false);
		assertEquals(3, composeMethod.getSize());
	}

}
