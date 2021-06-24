/*
 * this class extends our previous Candy class and adds more attributes
 *
 *  Created by: Abdul Basit Shaikh
 */
package assignment3;

public class BonBon extends Candy {

    private String type;
    private int calories;

    // constructor with set values
    public BonBon() {
        this.calories = 0;
        this.type = "chocolate";
        super.setColor("black");
        super.setLength(2);
        super.price = 2 * 2.50;
    }
    // constructor that allows the user to input the info
    public BonBon(String type, int calories, String color, int length) {
        super(color, length);
        this.type = type;
        this.calories = calories;
        super.price = length * 2.50;
    }

    //getter and setter for type (accessor and mutator)

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // getter and setter for calories
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double getPrice() {
        return super.price = getLength() * 2.50;
    }

    @Override
    public String toString() {
        return "BonBon{" + "Color=" + getColor() + ", type=" + type + ", calories=" + calories + ", length=" + getLength() + ", price=" + getPrice() + '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
