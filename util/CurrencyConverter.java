package util;

public class CurrencyConverter{

    public static double conversor(double cotacao, double qtd){
        return cotacao * qtd * 1.06;
    }
}