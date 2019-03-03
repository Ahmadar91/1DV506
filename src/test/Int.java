package test;

public class Int  {

	int n;

	public Int (int n) {
		this.n= n;
	}
	
	//public Int (int x) {
	//	n= x;
	//}




	//public void setInt(int x) {
	//	n = x;
	//}
	
	public int getInt() {
		return n;
	}
	
	
	public int plus(Int i2) {
		
		return this.n+i2.getInt();
		
	}
	
	public int Div (Int i2) throws ArithmeticException {
		
		
		//if(i2.n == 0) {	
		//throw new ArithmeticException("zero denominator");
		//}else
		return n/i2.n;

	}
	
	public boolean isEqual(int a) {
		if(n==a)
		return true;
		
		return false;
	}
	
	
	public boolean isLarger(int a) {
		if(n>a)
		return true;
		
		return false;
	}
	
	public String toString () {
		String str="";
		return str+= n;
	}
	
	

}
