package com.example.oop_lab1;

public enum Deck{

    ACE("ACE",11),
    KING("KING",4),
    QUEEN("QUEEN",3),
    JACK("JACK",2),
    TEN("TEN",10),
    NINE("NINE",9),
    EIGHT("EIGHT",8),
    SEVEN("SEVEN", 7),
    SIX("SIX", 6),
    FIVE("FIVE",5);


    private String name;
    private int value;
    Deck(String name, int value) {
        this.value = value;
    }
    public Deck getCard(int value){
        switch(value) {
            case 11:
                return ACE;
            case 4:
                return KING;
            case 3:
                return QUEEN;
            case 2:
                return JACK;
            case 10:
                return TEN;
            case 9:
                return NINE;
            case 8:
                return EIGHT;
            case 7:
                return SEVEN;
            case 6:
                return SIX;
            case 5:
                return FIVE;
            default:
                return null;

        }
    }
}
