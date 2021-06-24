/*
 * This class stores a color, length and price of a cancdy. and outputs the price
 * based on the length provided
 *
 * Created by: Abdul Basit
 */
package assignment3;

public class Candy {

    private String color;
    private int length;
    double price;

    // default constructor to set the color to black, lenght to 2, and price to 1.50
    public Candy() {
        this.color = "black";
        this.length = 2;
        this.price = 1.5;
    }


    /* constructor with takes the color and lenght args and based on that
    calculates the price */
    public Candy(String color, int length) {
        this.color = color;
        this.length = length;
        this.price = length * 0.75;
    }

    // Getter and setter for color

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPrice() {
        return this.price = this.length * 0.75;
    }

    @Override
    public String toString() {
        return "Candy{" + "color=" + color + ", length=" + length + ", price=" + price + '}';
    }

    // display method
    public void display() {
        System.out.println(toString());
    }
}
