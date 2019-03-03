package test.intList;

import java.util.Iterator;

public interface IntList {
	void add(int n);
	int get(int pos);
	boolean contains(int n);
	int size();
	Iterator<Integer> iterator();

}
