package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 =200.5,
                n2= 10.5;
    String result = "";
        char opratore ='+';
        boolean valid =opratore=='+'|| opratore=='-'||opratore=='*'||opratore=='/';

        if (valid){

            switch (opratore){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
            }

        }else
            System.out.println("invalied");
    }
}
/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result1 of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */