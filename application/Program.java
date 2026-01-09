package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program{
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price;
        double qtd;
        
        System.out.print("What is the dollar price: ");
        price = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        qtd = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.conversor(price, qtd));





        sc.close();
    }
}
