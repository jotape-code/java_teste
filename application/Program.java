package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program{
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Notas: ");
        student.nota1 = sc.nextFloat();
        student.nota2 = sc.nextFloat();
        student.nota3 = sc.nextFloat();
        System.out.println(student);





        sc.close();
    }
}
