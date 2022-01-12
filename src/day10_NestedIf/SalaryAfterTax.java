package day10_NestedIf;

public class SalaryAfterTax {
    public static void main(String[] args) {

        double tax = 0;
        double salary = 100_000;
        double salaryAftertax = 0;
        boolean isMarried = true;

        //  if (isMarried){

        // tax = tax - 0.05;
        //  salaryAftertax = salary - salary * tax;
        // System.out.println(salaryAftertax);
        //

        if (isMarried) {

        }

        {
            if (salary >= 130_000) {
                tax = 0.35;
                salaryAftertax = salary - salary * tax;
                System.out.println(salaryAftertax);

            } else if (salary >= 100_000 && salary <= 129_000) {
                tax = 0.30;
                salaryAftertax = salary - salary * tax;
                System.out.println(salaryAftertax);
            } else if (salary >= 80_000 && salary <= 99_000) {
                tax = 0.25;
                salaryAftertax = salary - salary * tax;
                System.out.println(salaryAftertax);

            } else if (salary <= 79_000) {
                tax = 0.20;
                salaryAftertax = salary - salary * tax;
                System.out.println(salaryAftertax);
            }


        }


    }
}
