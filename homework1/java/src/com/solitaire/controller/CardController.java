package com.solitaire.controller;

import com.solitaire.model.Board;

public class CardController {
    public static void uncover(){
        Board board=Board.getInstance();
        board.getWasteArray().add(0,board.getStockArray().get(0));
        board.getStockArray().remove(0);
    }
    public static void move(String para1,String para2){
    	
    	
    	
    	
    	
        
    }
}
