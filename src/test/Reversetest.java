package test;

import java.util.Arrays;

public class Reversetest {

	public static void main(String[] args) {

		
		  char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 
       			's', 'i', 'h', 'T' };
		  
		  
		  char temp ;
		  
		  for (int i= 0 , k= text.length-1; i <text.length/2 ; i++, k--) {
		  
		  	temp =  text[i];
		  	text[i]= text [k];
		  	text[k]= temp;
		  
		  }
		  
		  
		  
		 System.out.println(Arrays.toString(text));
		  
		 for (int j = 0; j<text.length;j++) {
			  char str = text[j];
			  
			  System.out.print(""+ str);
		  }
		  
		  
	}

}
