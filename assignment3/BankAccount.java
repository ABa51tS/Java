/*
 *This program requires us to create a class with the customers' name, account number
 * address and their balance
 * Created by: Abdul Basit Shaikh
 */
package assignment3;

// Creating a class named BankAccount

public class BankAccount {

    private int accountNumber;
    private String firstName, lastName;
    private String address;
    private double balance;


    // constructor that sets the int values to '2', and string values to "empty"
    public BankAccount() {
        this.accountNumber = 2;
        this.firstName = "empty";
        this.lastName = "empty";
        this.address = "empty";
        this.balance = 2;
    }

    // constructor that sets all the int values to 2 and allows the user to enter string values

    public BankAccount(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.balance = 2;
        this.accountNumber = 2;
    }

    // constructor that allows us to create the object with all the fields

    public BankAccount(int accountNumber, String firstName, String lastName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.balance = balance;
    }

    // Getter and Setter methods for  account number, first name, last name, address, and balance

    public int getAccountNumber() {
        return accountNumber;
    }
    // Setter method for the account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // method to get first name
    public String getFirstName() {
        return firstName;
    }

    // method to set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method to deposit money into the account
    public void deposit(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid Input!");
        }
        this.balance += balance;
        System.out.println(balance + " Amount Deposit Succesfully!");
        System.out.println("Your New Balance is : "+getBalance());
    }


    // method to withdraw money from the bank
    public void withdraw(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid Input!");
        }
        this.balance -= balance;
        System.out.println(balance + " Amount Withdraw Succesfully!");
         System.out.println("Your New Balance is : "+getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", balance=" + balance + '}';
    }

}
