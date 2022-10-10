package com.solitaire.model;

public class Card {
    private int value;
    private String suit;
    private boolean faceUp;
    private String valueSuit;

    //todo 传参检查
    public Card(int value, String suit, boolean faceUp) {//构造函数
        this.value = value;
        this.suit = suit;
        this.faceUp = faceUp;
        this.valueSuit = value + suit;
    }

    public String getValueSuit() {
        return valueSuit;
    }

    public int getValue() {//获取牌的值
        return value;
    }

    public void setValue(int value) {//设置牌的值
        this.value = value;
    }

    public String getSuit() {//获取牌的花色
        return suit;
    }

    public void setSuit(String suit) {//设置牌的花色
        this.suit = suit;
    }

    public boolean isFaceUp() {//判断牌是否正面朝上
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {//设置牌的正反面
        this.faceUp = faceUp;
    }
}
