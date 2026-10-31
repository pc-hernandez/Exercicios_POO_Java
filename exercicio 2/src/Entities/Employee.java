package Entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percet){
        grossSalary += grossSalary * percet / 100.0;
    }

    public String toString(){
        return "\nNome: " + name + "\nSalario: " + NetSalary();
    }
}
