package day32_Cononstructor;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Aaron");

       Employee employee2 = new Employee("yulia",'F');

       Employee employee3 = new Employee("ali",'M',"QA");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
