package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {


        String company = " Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2345, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 34, 'F', 3, 140000, company);


        Tester tester1 = new Tester("Chinara", 32, 'F', "QA", 1415, 125000, company);

        Tester tester2 = new Tester("Yasaman", 31, 'F', "QE", 1416, 130000, company);

        Tester tester3 = new Tester("Irena", 29, 'F', "SDET", 1417, 128000, company);

        Tester tester4 = new Tester("Omar", 35, 'M', "SDET", 90, 100000, company);

        Tester[] testers = {tester1, tester2, tester3, tester4};


        Developer developer1 = new Developer("Max", 34, 'M', "Senior Java Dev", 345, 18000, company);
        Developer developer2 = new Developer("Abdu", 28, 'M', "QA", 567, 100000, company);
        Developer developer3 = new Developer("Jemal", 36, 'M', "QA", 45, 120000, company);
        Developer developer4 = new Developer("Ahmed", 33, 'M', "QA", 3, 123000, company);
        Developer developer5 = new Developer("Adem", 24, 'M', "SDET", 67, 146000, company);

        Developer[] developers = {developer1, developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDeveloper(developers);
        scrumTeam.addTester(testers);

        System.out.print(scrumTeam);


        System.out.println("===========================");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("===========================");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }


    }


}


/*9. Create a class named AmazonInc:

        create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
        Create 4 objects of Testers
        Create 5 Objects of Developers

        Create an object of ScrumTeam

        Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team


 */


