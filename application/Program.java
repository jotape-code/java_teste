package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program{
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        Person[] people = new Person[n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            sum += height;
            Person aux = new Person(name, age, height);
            people[i] = aux;
        }
        System.out.printf("Altura Média: %.2f%n", sum / people.length);

        int qtd = 0;
        for(int i = 0; i < n; i++){
            if(people[i].ageCheck()){
                qtd += 1;
            }
        }
        System.out.println("Pessoas com menos de 16 anos: " + (double)qtd / n * 100 + "%");
        for (int i = 0; i < people.length; i++){
            if(people[i].ageCheck()){
                System.out.println(people[i].getName());
            }
        }

        sc.close();
    }
}
