package com.solitaire.model;

import java.util.ArrayList;
import java.util.Queue;

public class Board {
    private static Board board;
    private ArrayList<ArrayList<Card>>  boardArray;
    private ArrayList<ArrayList<Card>> foundationArray;
    private ArrayList<Card> stockArray;
    private ArrayList<Card> wasteArray;

    public static Board getInstance() {
        if (board == null) {
            board = new Board();
        }
        return board;
    }

    public ArrayList<Card> getStockArray() {
        return stockArray;
    }

    public ArrayList<Card> getWasteArray() {
        return wasteArray;
    }

    public ArrayList<ArrayList<Card>> getFoundationArray() {
        return foundationArray;
    }

    private Board() {
//        this.boardArray = new Card[7][52];
        this.foundationArray=new ArrayList<ArrayList<Card>>();
        this.boardArray=new ArrayList<ArrayList<Card>>();
        int t = 0;
        for (int i = 0; i < 7; i++) {
//            boardArray.add(new ArrayList<Card>());
            ArrayList<Card> tempBoardArray=new ArrayList<Card>();
            for (int j = 0; j < i; j++) {
                tempBoardArray.add(Deck.getCards().get(t));
                t = t + 1;
            }
            tempBoardArray.add(Deck.getCards().get(t));
            tempBoardArray.get(i).setFaceUp(true);

            t = t + 1;
            this.boardArray.add(tempBoardArray);
        }

        this.stockArray=new ArrayList<Card>();
        this.wasteArray=new ArrayList<Card>();
        for (int i = 0; i < 24; i++) {

            this.stockArray.add(Deck.getCards().get(t));
            t = t + 1;
        }
    }

    public ArrayList<ArrayList<Card>> getBoardArray() {
        return boardArray;
    }

}
