package com.arun.composemethod;

public class RefactoredComposeMethod {
	
	private Object[] elements= new Object[]{};
	private int size = elements.length;
	
	public void addOnlyWhenItIsNotReadOnly(Object element, boolean readOnly){
		if(readOnly)
			return;
		
		if (atCapacity(size + 1)) {
			grow();
		}
		addElement(element);
	}
	
	public int getSize() {
		return size;
	}

	private void grow() {
		Object[] newElements = new Object[elements.length+10];
		for(int i=0;i<size;i++)
			newElements[i]=elements[i];
		elements =newElements;
	}

	private boolean atCapacity(int newSize) {
		return newSize > elements.length;
	}

	private void addElement(Object element) {
		elements[size++]=element;
	}
	
	
	
}
