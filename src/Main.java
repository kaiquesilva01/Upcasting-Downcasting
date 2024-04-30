import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(0001,"Maria",0.0);
        BusinessAccount bacc = new BusinessAccount(0003,"Pedro",0.0,200.00);
        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(0002,"Joao",0.0,200.00);
        Account acc3 = new SavingsAccount(0004,"Pedro",0.0,0.1);
        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        acc4.loan(100.0);
        System.out.println("Depositado o valor de " + acc4.getBalance());
        SavingsAccount acc5 = (SavingsAccount) acc3;
        acc5.updateBalance();
        System.out.println("Update");
    }
}