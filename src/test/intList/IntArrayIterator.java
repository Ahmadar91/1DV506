package test.intList;

import java.util.Iterator;

public class IntArrayIterator implements Iterator<Integer> {
	
	private int nextElement = 0;
	private final int [] elements;
	private final int max;
	
	
	public IntArrayIterator(int [] values, int size) {
		elements = values;
		max = size;
		
		
	}

	
	public boolean hasNext() {
		return nextElement < max;
	}

	
	public Integer next() {
		return elements[nextElement++];
	}

}
