package blackjacks;

import java.util.ArrayList;

public class Card {
    String suit;
    int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString(){
        return suit +" "+ rank  ;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}



