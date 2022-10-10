package com.solitaire.model;
import java.util.ArrayList;

public class Deck {
    //create a deck of cards
    private static Deck deck;
    private static String suitMap[] = {"C", "D", "H", "S"};
    private static int valueMap[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private static ArrayList<Card> cards;

    private Deck() {
        // create a deck
        cards = new ArrayList<Card>();
        createDeck();
        // shuffle the cards
        java.util.Collections.shuffle(cards);
    }
    public static Deck getInstance() {
        if (deck == null) {
            deck = new Deck();
        }
        return deck;
    }
    
    public static ArrayList<Card> getCards() {
        return cards;
    }

    private static void createDeck(){
        System.out.println("Create a deck of cards");
        
        for (int i=0;i<4;i++){
            for (int j=0;j<13;j++){
             //   System.out.println("Card "+(i*13+j+1)+" is "+valueMap[j]+" of "+suitMap[i]);
                cards.add(new Card(valueMap[j],suitMap[i],false));
            }
        }
    }
}
