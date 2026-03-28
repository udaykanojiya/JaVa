package harry;
import java.util.*;

public class class8 {
public static void main(String[] args){

    Employee uday = new Employee("Uday", 50000);
    uday.getName();
    uday.getSalary();   
    uday.setName("Udayan");
    uday.getName();

    
  

}
}

class Employee{
    Employee(String Name, int Salary){
        name = Name;
        salary = Salary;
    }
    String name;
    int salary;
    void getSalary(){
        System.out.println("The salary is: " + this.salary);
    }
    void getName(){
        System.out.println("Name is " + name);
    }
    void setName(String Name){
        name = Name;
    }

}