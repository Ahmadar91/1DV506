package aa224fn_assign4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {

		Stack stack = new StackMethods();

		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");

		System.out.println("Elements in the stack are: ");

		Iterator<Object> it = stack.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());

		System.out.println("Elements after pop and peek:");
		Iterator<Object> it1 = stack.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}

	}

}
