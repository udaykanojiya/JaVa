package harry;

public class class8 {
public static void main(String[] args){

    // Employee uday = new Employee("Uday", 50000);
    // uday.getName();
    // uday.getSalary();   
    // uday.setName("Udayan");
    // uday.getName();

    // CellPhone oneplus = new CellPhone();
    // oneplus.ringing();
    // oneplus.vibrating();
    // oneplus.callFriend();
    
  

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
    void setName(String name){
        this.name = name;
    }

}

class CellPhone{
    void ringing(){
        System.out.println("The phone is ringing...");
    }

    void vibrating(){
        System.out.println("The phone is vibrating...");}

        void callFriend(){
            System.out.println("Calling Udayan...");
        }
    }
