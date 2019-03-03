package aa224fn_assign2;



public class Reverse {

	public static void main(String[] args) {
		
		
		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };
		
		char temp ;
		
		int k = 13;
		for(int i=0;i<text.length/2;i++) {
			temp = text[i];
			text[i]= text[k];
			text[k] = temp;
			k--;
		}
		
		for(int i=0;i<text.length;i++) {
			System.out.print(text[i]);
	
		}
		
		
	}

}

