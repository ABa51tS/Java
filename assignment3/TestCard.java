/*

 */
package assignment3;

public class TestCard {

    public static void main(String[] args) {
        Card card = new Card();
        card.setCard(11);
        card.display();
        card.setCard(11, "H");
        card.display();
        card.setCard(36);
        card.display();
        card.setCard(36, "h");
        card.display();
    }
}
