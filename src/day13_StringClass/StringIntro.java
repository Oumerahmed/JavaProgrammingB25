package day13_StringClass;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1==name2);   //true
        System.out.println(name2==name3);  //true
        System.out.println(name3==name4);  //true

        System.out.println("-------------------");

        String sta1 = new String("wooden Spoon");
        String sta2 = new String("wooden Spoon");
        String sta3 = new String("wooden Spoon");
        String sta4 = new String("wooden Spoon");

        System.out.println(sta1==sta2); //false
        System.out.println(sta2==sta3); //false
        System.out.println(sta3==sta4); //false

        System.out.println("---------------------------");
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = new String("Java");


        System.out.println(s3.equals(s4));  //false
    }
}



