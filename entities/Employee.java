package entities;

public class Employee{
    public String name;
    public double grossSalary;
    public double tax; 

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary += percentage * grossSalary;
    }
    public String toString(){
        return String.format("%s, $ %d", name, NetSalary());
    }


}