/*
 *
 */
package assignment3;


public class TestBankAccount {
    public static void main(String[] args) {
        //check default Construcotr
        System.out.println("Default Constructor");
        BankAccount bankAccount=new BankAccount();
        System.out.println("Print details\n"+bankAccount);
        bankAccount.setAccountNumber(123456);
        bankAccount.setAddress("Adress Check 1");
        bankAccount.setFirstName("First Name 1");
        bankAccount.setLastName("Last Name 1");
        bankAccount.setBalance(100);
        bankAccount.deposit(200);
        bankAccount.withdraw(50);
        System.out.println("Print details\n"+bankAccount);
        
        //String parameter Constructor
        System.out.println("String Parameter Constructor");
        BankAccount bankAccount1=new BankAccount("firstName2", "lastName2", "address check 2");
        System.out.println("Print details\n"+bankAccount1);
        bankAccount1.setAccountNumber(123457);
        bankAccount1.setBalance(150);
        bankAccount1.deposit(250);
        bankAccount1.withdraw(100);
        System.out.println("Print details\n"+bankAccount1);
        
        
        //All Parameter Constructor
        System.out.println("All Parameter Constructor");
        BankAccount bankAccount2=new BankAccount(123458,"firstName3", "lastName3", "address check 3",100);
        System.out.println("Print details\n"+bankAccount2);
        bankAccount2.deposit(250);
        bankAccount2.withdraw(100);
        System.out.println("Print details\n"+bankAccount2);
        
    }
}
