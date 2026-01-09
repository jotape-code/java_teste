package entities;


public class Account{
    private String name;
    private int number;
    private double balance;

    public Account(String name, int number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }
    
    public void withdraw(double qtd){
        balance -= qtd + 5;
    }

    public void deposit(double qtd){
        balance += qtd;
    }

    public String toString(){
        return String.format("Account: %d, Holder: %s, Balance: $ %.2f", number, name, balance);
    }
}