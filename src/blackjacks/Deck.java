package blackjacks;

import java.util.*;

public class Deck {

        ArrayList<Card> deck = new ArrayList<>();
public Deck() {
        deck.add(new Card("Two Hearts", 2));
        deck.add(new Card("Three Hearts", 3));
        deck.add(new Card("Four Hearts", 4));
        deck.add(new Card("Five Hearts", 5));
        deck.add(new Card("Six Hearts", 6));
        deck.add(new Card("Seven Hearts", 7));
        deck.add(new Card("Eight Hearts", 8));
        deck.add(new Card("Nine Hearts", 9));
        deck.add(new Card("Ten Hearts", 10));
        deck.add(new Card("Jack Hearts", 10));
        deck.add(new Card("Queen Hearts", 10));
        deck.add(new Card("King Hearts", 10));
        deck.add(new Card("Ace Hearts", 11));
        deck.add(new Card("Two Diamond", 2));
        deck.add(new Card("Three Diamond", 3));
        deck.add(new Card("Four Diamond", 4));
        deck.add(new Card("Five Diamond", 5));
        deck.add(new Card("Six Diamond", 6));
        deck.add(new Card("Seven Diamond", 7));
        deck.add(new Card("Eight Diamond", 8));
        deck.add(new Card("Nine Diamond", 9));
        deck.add(new Card("Ten Diamond", 10));
        deck.add(new Card("Jack Diamond", 10));
        deck.add(new Card("Queen Diamond", 10));
        deck.add(new Card("King Diamond", 10));
        deck.add(new Card("Ace Diamond", 11));
        deck.add(new Card("Two Spades", 2));
        deck.add(new Card("Three Spades", 3));
        deck.add(new Card("Four Spades", 4));
        deck.add(new Card("Five Spades", 5));
        deck.add(new Card("Six Spades", 6));
        deck.add(new Card("Seven Spades", 7));
        deck.add(new Card("Eight Spades", 8));
        deck.add(new Card("Nine Spades", 9));
        deck.add(new Card("Ten Spades", 10));
        deck.add(new Card("Jack Spades", 10));
        deck.add(new Card("Queen Spades", 10));
        deck.add(new Card("King Spades", 10));
        deck.add(new Card("Ace Spades", 11));
        deck.add(new Card("Two Clubs", 2));
        deck.add(new Card("Three Clubs", 3));
        deck.add(new Card("Four Clubs", 4));
        deck.add(new Card("Five Clubs", 5));
        deck.add(new Card("Six Clubs", 6));
        deck.add(new Card("Seven Clubs", 7));
        deck.add(new Card("Eight Clubs", 8));
        deck.add(new Card("Nine Clubs", 9));
        deck.add(new Card("Ten Clubs", 10));
        deck.add(new Card("Jack Clubs", 10));
        deck.add(new Card("Queen Clubs", 10));
        deck.add(new Card("King Clubs", 10));
        deck.add(new Card("Ace Clubs", 11));


}
        public  void draw(){
            System.out.println("************************************************" );
        }

        Card getCard(){
        Random random = new Random();
        int randomCard = random.nextInt(deck.size());
        Card card = deck.get(randomCard);
        deck.remove(randomCard);
        return card ;
        }


        }






