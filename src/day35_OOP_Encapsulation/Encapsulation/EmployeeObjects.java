package day35_OOP_Encapsulation.Encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Thahir", 'M', 30, 12000);
        employee1.setAge(32);
        employee1.setName("Oumer");


        Employee employee2 = new Employee("Aygum", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary() + 1500);


        System.out.println(employee1);
        System.out.println(employee2);


    }

}


