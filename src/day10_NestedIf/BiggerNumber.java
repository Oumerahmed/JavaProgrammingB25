package day10_NestedIf;

public class BiggerNumber {
    public static void main(String[] args) {

        int n1 = 55;
        int n2 = 45;
        int n3 = 341;
        String oum = "";
        String result = "";
        if (n1 > n2 && n1 > n3) {
            result = "n1 is bigger";
        } else if (n2 > n1 && n2 > n3) {
            result = "n2 is bigger";
        } else {
            result = "n3 is bigger";
        }
        System.out.println(result);

        System.out.println("---------------------");

        result = (n1 > n2 && n1 > n3)? "n1 is bigger" :(n2 > n1 && n2 > n3)? "n2 is bigger" : "n3 is bigger";

        System.out.println(result);
    }
  }
    /* 5. Create a class called BiggerNum, write a program that checks for the Bigger of 3 numbers.
        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

        if n1 is Biggest output: "n1 is bigger"
        if n2 is Biggest output: "n2 is bigger"
        if n3 is Biggest output: "n3 is bigger"

        NOTE: MUST USE TERNARY
     */









