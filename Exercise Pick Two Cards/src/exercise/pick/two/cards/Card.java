
package exercise.pick.two.cards;

import java.util.Random;

final public class Card {
    
    Random random=new Random();
    private char cardSuit;
    private int CardValue;

    public Card() {
        setCardValue();
        setCardSuit();
        this.CardValue=getCardValue();
        this.cardSuit=getCardSuit();
    }

    public char getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit() {
        int randomHelperVariable=random.nextInt(4)+1;
        
        switch (randomHelperVariable) {
            case 1:
                this.cardSuit='S';
                break;            
            case 2:
                this.cardSuit='H';
                break;
            case 3:
                this.cardSuit='D';
                break;
            case 4:
                this.cardSuit='C';
                break;
            default:
                break;
        }

    }

    public int getCardValue() {
        return CardValue;
    }

    public void setCardValue() {
        this.CardValue=random.nextInt(13)+1;
    }
    
    
    
}
