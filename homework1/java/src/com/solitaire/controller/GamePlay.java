package com.solitaire.controller;

// import com.solitaire.model.Deck;
import com.solitaire.model.*;
import com.solitaire.view.BoardView;


public class GamePlay {
    public static void start(){
        System.out.println("\033[34;1mStart Game, Good Luck\033[0m");
        // create a player
        Player player=Player.getInstance();
        // create a deck
        Deck deck=Deck.getInstance();
        // create a board
        Board board=Board.getInstance();
        // create a game
        // start the game
        System.out.println("Player's score is "+player.getScore());
        System.out.println("Player's number of moves is "+player.getNumOfMoves());
        GamePlay.loop();

    }
    public static void loop(){
        // System.out.println("Game Loop");
        while(true){
            // show the board
            BoardView.show();
            GameController.control();
        }



    }
}
