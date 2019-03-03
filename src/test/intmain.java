package test;

public class intmain {

	public static void main(String[] args) {
		
		Int i1 = new Int(7);
		Int i2 = new Int(5);
	
		int sum = i1.plus(i2);
		int div = i1.Div(i2);
		
		System.out.println(sum);
		System.out.println(div);
		
		if(i1.isEqual(div)) {
			System.out.println("Numbers are equal");
		}
		
		if(i1.isLarger(sum)) {
			System.out.println("i1 is larger");
		}
		
		System.out.println("toString: "+i1.toString());
			
		
	}

}
