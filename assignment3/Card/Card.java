/*
 * this program displays the number, suit, and the proper image
 *
 * Created by: Abdul Basit Shhaikh
 */
package assignment3;

// Creating a class called Card
public class Card {

    // instance variables
    private int cardNumber;
    private String cardName;
    private String image;

    // getter and setter methods for each instances
    public int getCardNumber() {
        return cardNumber;
    }

    // method to set card number if the value is between 1 & 10
    public void setCardNumber(int cardNumber) {
        if (cardNumber > 0 && cardNumber <= 10) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Number!");
        }
    }

    // setting the card value and the appropriate image
    public void setCard(int n) {
        String cards[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        String cardName = "";
        int num = n % 13;
        if (num > 0 && num <= 13) {
            cardName = cards[num - 1];
        }
        System.out.println("");
        if (n % 13 == 0) {
            this.setCardNumber(n % 13);
        } else if (n == 10) {
            this.setCard(((n % 13) % 10) + 1);
        } else {
            this.setCardNumber((n % 13) % 10 + 1);
        }
        System.out.println(getNum(n));
        switch (getNum(n)) {
            case 0:
                this.setCardName(cardName + " of Spades");
                this.setImage("spades_" + cardName.toLowerCase() + ".png");
                break;
            case 1:
                this.setCardName(cardName + " of Clubs");
                this.setImage("clubs_" + cardName.toLowerCase() + ".png");
                break;
            case 2:
                this.setCardName(cardName + " of Diamonds");
                this.setImage("diamonds_" + cardName.toLowerCase() + ".png");
                break;
            case 3:
                this.setCardName(cardName + " of Hearts");
                this.setImage("hearts_" + cardName.toLowerCase() + ".png");
                break;
            default:
                System.out.println("Invalid Input!");
                return;

        }
    }
    // overloading
    void setCard(int n, String c
    ) {
        if (c.toLowerCase().equals("h")) {
            String cards[] = {"King", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Ace", "Jack", "Queen"};

            String cardName = "";
            int num = n % 13;
            if (num > 0 && num <= 13) {
                cardName = cards[num - 1];
            } else {
                throw new IllegalArgumentException("Invalid Input!");
            }
            if (n % 13 == 0) {
                this.setCard(n % 10);
            } else if (n == 10) {
                this.setCard(((n % 13) % 10) + 1);
            } else {
                this.setCard(n % 13 % 10);
            }
            switch (getNum(n)) {
                case 0:
                    this.setCardName(cardName + " of Spades");
                    this.setImage("spades_" + cardName.toLowerCase() + ".png");
                    break;
                case 1:
                    this.setCardName(cardName + " of Clubs");
                    this.setImage("clubs_" + cardName.toLowerCase() + ".png");
                    break;
                case 2:
                    this.setCardName(cardName + " of Diamonds");
                    this.setImage("diamonds_" + cardName.toLowerCase() + ".png");
                    break;
                case 3:
                    this.setCardName(cardName + " of Hearts");
                    this.setImage("hearts_" + cardName.toLowerCase() + ".png");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    return;
            }
        } else {
            this.setCard(n);
        }
    }

    public int getNum(int n) {
        if (n >= 1 && n <= 13) {
            return 0;
        } else if (n >= 14 && n <= 26) {
            return 1;
        } else if (n >= 27 && n <= 39) {
            return 2;
        } else if (n >= 40 && n <= 52) {
            return 3;
        } else {
            return 4;

        }
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void display() {
        System.out.println(this.getCardNumber() + " " + this.getCardName() + " " + this.getImage());
    }

}
