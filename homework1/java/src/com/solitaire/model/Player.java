package com.solitaire.model;

public class Player {
    private static Player player;

    private int score;
    private int numOfMoves;

    public static Player getInstance(){
        if (player==null){
            player=new Player();
        }
        return player;
    }

    private Player() {
        this.score = 0;
        this.numOfMoves = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumOfMoves() {
        return numOfMoves;
    }

    public void setNumOfMoves(int numOfMoves) {
        this.numOfMoves = numOfMoves;
    }
}
