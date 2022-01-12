package day36_Inheritance.EmployeTask2;

public class EmployeeObjects {
    public static void main(String[] args) {


        Tester tester = new Tester();
        tester.setInfo("Piter",'M',32,90,"QA",121000);

        tester.work();
        tester.test();
        tester.creatingTicket();
        tester.toString();

        System.out.println(tester);



        Developer developer = new Developer();
        developer.setInfo("Maria",'F',27,678,"developer",100000);

        developer.work();
        developer.code();
        developer.fixingBugs();
        developer.toString();


        System.out.println(developer);


       Teacher teacher = new Teacher();
       teacher.setInfo("Jorge",'M',40,5678,"Human Resource",120000);

        teacher.work();
        teacher.teaching();
        teacher.toString();

        System.out.println(teacher);


     Driver driver = new Driver();
     driver.setInfo("Jemal",'M',34,3456,"SuperVisor",95000);

     driver.work();
     driver.driving();
     driver.toString();


        System.out.println(driver);

    }
}
