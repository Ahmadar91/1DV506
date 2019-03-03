package aa224fn_assign4.stack;

import java.util.Iterator;

public class StackMethods implements Stack {

	// fields
	private int length = 5;
	private int size = 0;
	private Object[] values;

	// constructor
	public StackMethods() {
		values = new Object[length];
	}

	/* Methods */
	public int size() {
		return size;
	}

	public void reSize() {
		length = 2 * size;
		Object[] tmp = new Object[length];
		for (int i = 0; i < size; i++)
			tmp[i] = values[i];
		values = tmp;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public void push(Object element) {
		if (size == length)
			reSize();
		if (size != 0) {
			for (int i = size + 1; i > 0; i--) {
				values[i] = values[i - 1];
			}
		}
		size++;
		values[0] = element;
	}

	public Object pop() throws IllegalStateException {
		Object x = values[0];
		for (int i = 0; i < size - 1; i++) {
			values[i] = values[i + 1];
		}
		size--;
		return x;

	}

	public Object peek() throws IllegalStateException {
		return values[0];
	}

	public Iterator<Object> iterator() {
		return new StackIterator(values, size);

	}

	private class StackIterator implements Iterator<Object> {

		// Fields
		private int nextElement = 0; // first element at start
		private final Object[] elements;
		private final int max; // final element in array

		// Constructor
		public StackIterator(Object[] values, int size) {
			elements = values;
			max = size;
		}

		// Methods
		public boolean hasNext() {
			return nextElement < max;
		}

		public Object next() {
			return elements[nextElement++];
		}

	}
}