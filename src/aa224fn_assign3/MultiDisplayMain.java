package aa224fn_assign3;

import aa224fn_assign3.MultiDisplay;

public class MultiDisplayMain {

	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("hello World!");
		md.setDisplayCount(3);
		md.display();
		md.display("Goodbye cruel world!", 2);
		System.out.println("Current Message: "+ md.getDisplayMessage());
	}
}
