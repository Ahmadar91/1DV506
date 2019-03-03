package aa224fn_assign3;

public class Card {
	

	public suite st;
	public rank rk;
	
	
	
	
	public Card (rank rk, suite st){
		this.rk = rk;
		this.st= st;
	}
	

	
	public String toString() {
		 return   this.rk.toString() + " of " + this.st.toString();
	}
	
	public rank getValue() {
		return rk;
	}

}
