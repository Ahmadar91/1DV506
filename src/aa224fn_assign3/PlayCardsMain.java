package aa224fn_assign3;

import java.util.Scanner;

public class PlayCardsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Deck playingdeck = new Deck();
		playingdeck.createFullDeck();
		playingdeck.shuffle();

		System.out.print("Enter number of card to be drawed out:");
		int k = sc.nextInt();
		for ( int i =0 ; i < k ; i ++) {
			playingdeck.deal();
		}
		System.out.println(	playingdeck.remain());
		playingdeck.cardsontalbe();
		
		
	}

}
