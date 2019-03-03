package aa224fn_assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards;
	int deck = 52;
	int table = 0;

	public Deck() {
		this.cards = new ArrayList<Card>();
	}

	public void createFullDeck() {
		for (suite cardst : suite.values()) {
			for (rank cardrk : rank.values()) { 
				this.cards.add(new Card(cardrk,cardst));
			}
		}
	}
	
	public void shuffle() {
		if( deck == 52)
	
		Collections.shuffle(cards);
		deck = 52;
		table = 0;
	}
	
	
	public int remain(){
		return table; 
		}
	
	
    public void deal(){
   	 if (deck<=0)
            throw new IllegalStateException(" out of cards!.");
        table++;
        deck--;
   }

	
	  public void cardsontalbe(){
	    	for(int i=0; i<table; i++){
	    		System.out.println(cards.get(i).toString());
	    	}
	    }
	

}
