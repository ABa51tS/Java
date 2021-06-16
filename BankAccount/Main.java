package BankAccount;

public class Main {

    public static void main(String[] args) {

        //BankAccount test = new BankAccount(1, "a","b", "1", 1.1);
       // BankAccount test2 = new BankAccount(1,"","sh","",100);
       // System.out.println(test.accNumber);
        
        BankAccount test = new BankAccount();
        BankAccount test2 = new BankAccount("abdul", "basit", "249");
        BankAccount test3 = new BankAccount(24977, "Abdul", "Samad", "9410 Bal", 1000);


        System.out.println(test2.getAccNumber());
        System.out.println(test2.getAddress());
        System.out.println(test2.getBalance());
        System.out.println(test2.getFirstName());
        System.out.println(test2.getLastName());
        System.out.println(test3.getFirstName());
        test.deposit(100.0);
        test.withdraw(50.0);

        //System.out.println(test2.getBalance());

    }
}
