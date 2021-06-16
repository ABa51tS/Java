package BankAccount;

// Creating a Storage class

public class BankAccount {

    public BankAccount() {                                                      // Creating a default constructor which sets all the string values to "empty
        this(2, "empty", "empty", "empty", 2.0);            // and all the int values to 2
    }

    public  BankAccount(String fn, String ln, String ad) {                      // Creating a default constructor which sets all the int values to 2, but allows
        this(2,"","","", 2.0);                              // the user to provide the string values
        firstName = fn;
        lastName = ln;
        address = ad;

    }

    public BankAccount(int ac, String fn, String ln, String ad, double b){      // Creating a constructor which allow the user to set all the attributes while defining/ creating the object
        accNumber = ac;
        firstName = fn;
        lastName = ln;
        address = ad;
        balance = b;
    }


    private int accNumber;

    private String firstName;
    private String lastName;
    private String address;

    private double balance;

    // keeping the user's information (variables) private so it is not accessible from anywhere.
    // to access the variables, we need to create the methods below

    int getAccNumber() {                                                        // accessor method to get the account number
        return accNumber;
    }
    String getFirstName() {                                                     // method to get the first name
        return firstName;
    }
    String getLastName() {                                                      // method to get the last name
        return lastName;
    }
    String getAddress() {                                                       // method to get the address
        return address;
    }
    double getBalance() {                                                       // method to get the balance
        return balance;
    }



    double deposit (double amount){                                            // mutator method to deposit the money
        double newBalance = balance + amount;                                  // while update the balance
        balance = newBalance;
        return balance;
    }

    double withdraw (double amount) {                                          // method to withdraw the amount and
        double newBalance = balance - amount;                                  // updating the balance
        balance = newBalance;
        return balance;
    }



}
