package aa224fn_assign3;

public class MultiDisplay {
	private String text;
	private	int count;
	
	public MultiDisplay () { text = ""; count=0;}                 // variables
	public MultiDisplay (String tx , int cn) {text= tx; count= cn;}  // input for variables if there is if there is none we let () empy and text = "afdad"
	
	
	// methods
	public void setDisplayMessage(String tx) {
		text = tx;
	}
	
	public void setDisplayCount(int cn){
		
		count = cn;
	}
	
	public void display() {	
		
		for(int i = 0;i < count;i++) 
		System.out.println((text));
		
		}
	
	public void display(String nw, int k) {
		text = nw;
		count = k;
		for(int i = 0; i < count ; i++) {
			System.out.println(""+text);
		}
	}
	
	public String getDisplayMessage() {
		return text;
	}

}
