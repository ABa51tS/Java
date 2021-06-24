/*
 *
 */
package assignment3;

public class TestBonCandy {

    public static void main(String[] args) {
        Candy candy = new BonBon("chocolote", 250, "black", 5);
        System.out.println("Price of Candy: " + candy.getPrice());
        candy.display();
    }
}
