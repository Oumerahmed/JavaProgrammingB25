package day12_Scanner;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter no 1~7");
        scan.nextInt();



        int number =3;

        String result = "";

        if (number>=1 && number<=7){

          result=  (number==1)? "mon" : (number==2)? "tus" : (number==3)? "wed" :(number==4)? "thu" : (number==5)? "fri"
            :(number==6)? "sat":"sun";



        }else {
            result = "invalid";
        }

       scan.close();
    }
}
