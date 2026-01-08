package entities;

public class Student{
    public float nota1, nota2, nota3;
    public String name;

    public float media(){
        return nota1 + nota2 + nota3;
    }

    public String aprovation(){
        if(media() >= 60){
            return "Pass";
        }
        else{
            return String.format("Failed\nMissing %.2f Points", 60 - media());
        }
    }
    public String toString(){
        return String.format("FINAL GRADE = %.2f%n%s", media(), aprovation());
    }

}