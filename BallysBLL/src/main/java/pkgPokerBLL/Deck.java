package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	

	public ArrayList<Card> getDeckCards() {
		return DeckCards;
	}

	public Deck() {

		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) { // need
																		// joker
					DeckCards.add(new Card(rank, suit, ++iCardNbr, false));
				}
			}
		}
		Collections.shuffle(DeckCards);
	}

	public Card DrawCard() {

		return DeckCards.remove(0);
	}

	public Deck(int numOfJokers) {
		for (int i = 0; i < numOfJokers; i++) {
			DeckCards.add(new Card());
		}
		Collections.shuffle(DeckCards);
	}
}
