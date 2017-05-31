package com.arun.composemethod;

/**
 * 
 * @author arun
 *You can't rapidly understand a method's logic
 *
 	What to do?
 	Transform the logic into a small number of intention-revealing steps at the same level of detail
 	
 	
 	Usually Composed Methods have the code at the same level of detail
 	
 */
public class ComposeMethod {
	
	
	private Object[] elements= new Object[]{};
	private int size = elements.length;

	public void add(Object element, boolean readOnly){
		if(!readOnly){
			int newSize = size +1;
			if(newSize > elements.length){
				Object[] newElements = new Object[elements.length+10];
				for(int i=0;i<size;i++)
					newElements[i]=elements[i];
				elements =newElements;
			}
			elements[size++]=element;
		}
	}
	
	public int getSize() {
		return size;
	}
	
}
