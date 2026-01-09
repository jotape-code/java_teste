package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program{
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there any initial deposit(y/n)? ");
        char opc = sc.next().charAt(0);
        opc = Character.toUpperCase(opc);

        double deposit = 0;
        if(opc == 'Y'){
            System.out.println("Enter initial deposit value: ");
            deposit = sc.nextDouble();
        }
        Account account = new Account(name, number, deposit);
        System.out.println("Account data:\n" + account);

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Update account data: \n" + account);

        System.out.println("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        account.withdraw(deposit);
        System.out.println("Update account data: \n" + account);




        sc.close();
    }
}
