package aa224fn_assign3;

public class FractionMain {

	public static void main(String[] args) {
		Fraction x = new Fraction();

		System.out.println("First Fraction =  "+x.getNumerator(12)+"/" + x.getDenominator(5)); // First Fraction	
		Fraction y = new Fraction ();
		System.out.println("Second Fraction =  "+ y.getNumerator(12)+"/" + y.getDenominator(5)); // Second fraction
		
		
		if(x.isNegative()) {
			System.out.println("true! Fraction is negative");
		}

		if(x.isEqualTo(y)) {
			System.out.println("true! Fraction are equal");
		}
		
		Fraction p = x.add(y);
		System.out.println( x +" + "+ y+ " = "+p);
		
		Fraction s= x.subtract(y);
		System.out.println( x +" - "+ y+ " = "+s);
		
		Fraction m = x.multiply(y);
		System.out.println( x +" * "+ y+ " = "+m);
		
		Fraction d = x.divide(y);
		System.out.println( x +" / "+ y+ " = "+d);
		

		
	}
}
