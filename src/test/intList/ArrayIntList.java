package test.intList;

import java.util.Iterator;

public class ArrayIntList implements IntList {

	int length = 8;
	int size = 0;
	private int[] values;

	public ArrayIntList() {
		values = new int[length];
	}

	public void add(int n) {
		if (size == length)
			resize();
		values[size++] = n;
	}

	public int get(int pos) {
		if (pos > -1 && pos < size)
			return values[pos];
		else {
			throw new IndexOutOfBoundsException("Index out of range: " + pos);
		}

	}

	public boolean contains(int n) {
		for (int i = 0; i < size; i++) {
			if (n == values[i])
				return true;
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void resize() {
		length = 2 * length;
		int[] tmp = new int[length];
		for (int i = 0; i < size; i++)
			tmp[i] = values[i];
		values = tmp;
	}

	public Iterator<Integer> iterator() {
		return new IntArrayIterator(values, size);
	}

	private class IntArrayIterator implements Iterator<Integer> {
		private int nextElement = 0;
		private final int[] elements;
		private final int max;

		public IntArrayIterator(int[] values, int size) {
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

}
