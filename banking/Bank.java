package banking;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.xml.transform.Source;

/**
 * Bank
 */
public class Bank {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.run();
    }
    public void run(){
        System.out.print("Welcome to the bank \nWhat is your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello "+name+"! We are creating a checking and saving account for you.");

        Customer customer= new Customer(name);
        // get address 
        System.out.println("What is your address?");
        String address = scan.nextLine();
        customer.setAddress(address);

        //create checking account for the customer 
        BankAccount checkingAccount = new BankAccount("checking",customer);
        //cteate saving account for the customer 
        BankAccount savingAccount = new BankAccount("savings", customer);
        //printing customer info 
        System.out.println();
        System.out.println("Customer info:");
        System.out.println("==>"+checkingAccount.getCusromerInfo());
    }
}