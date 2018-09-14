
package exercise.pick.two.cards;



public class ExercisePickTwoCards {


    public static void main(String[] args) {
        System.out.println("S stands for spades, H stands for hearts, D stands for diamonds, and C stands for clubs");
        Card firstCard=new Card();
        Card secondCard=new Card();

        System.out.println("The first card is: "+firstCard.getCardValue()+" of "+firstCard.getCardSuit());
        System.out.println("The second card is: "+secondCard.getCardValue()+" of "+secondCard.getCardSuit());
    }
    
}
