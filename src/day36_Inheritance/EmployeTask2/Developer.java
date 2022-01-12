package day36_Inheritance.EmployeTask2;

public class Developer extends Employee {


    public void work() {

        System.out.println(name + " is working");
    }


    public void code() {
        System.out.println(name + "is coding");

    }

    public void fixingBugs() {

        System.out.println(name + " fixingBugs");
    }


}
