package day32_Cononstructor;

public class Employee {
    public String name;
    public char gender;
    public String JobTitle;
    public double salary;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name) {

        this.name = name;


    }

    public Employee(String name, char gender) {

        this(name);
        this.gender = gender;


    }


    public Employee (String name,char gender,String jobTitle){

        this.name= name;
        this.gender= gender;
        this.JobTitle= jobTitle;


    }

    public Employee (String name,char gender,String jobTitle,double salary){

        this(name,gender,jobTitle);
        this.salary= salary;

    }





}
