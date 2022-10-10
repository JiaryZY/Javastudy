package com.solitaire.view;

import com.solitaire.model.Board;
import com.solitaire.model.Player;

public class BoardView {
    public static void show() {
        System.out.println("BoardView");

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Stock pile:" + Board.getInstance().getStockArray()[i].getValueSuit());
        // }

        // System.out.println("Waste pile:");
        for (int i = 0; i < 3; i++) {
            if( Board.getInstance().getWasteArray().size()<=i){
                break;
            }
            System.out.println("Waste pile:" + Board.getInstance().getWasteArray().get(i).getValueSuit());
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= Board.getInstance().getBoardArray().get(i).size(); j++) {
                if (Board.getInstance().getBoardArray().get(i).size()<=j) {
                    break;
                }
                if(Board.getInstance().getBoardArray().get(i).get(j).isFaceUp()) {
                    System.out.print(Board.getInstance().getBoardArray().get(i).get(j).getValueSuit()+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("Foundation pile:");
        for (int i = 0; i < 4; i++) {
            for( int j=0;j<13;j++){
                if(Board.getInstance().getFoundationArray().size()==0){
                    break;
                }
                if(Board.getInstance().getFoundationArray().get(i).size()==0){
                    break;
                }
                System.out.print(Board.getInstance().getFoundationArray().get(i).get(j).getValueSuit()+" ");
            }
        }
        Player player=Player.getInstance();
        System.out.println("Player's score is "+player.getScore());
        System.out.println("Player's number of moves is "+player.getNumOfMoves());

    }
}
