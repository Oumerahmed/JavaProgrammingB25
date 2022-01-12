   package day07_Oprator;

   public class RelatinalOprators {
       public static void main(String[] args) {

           // > , >= , <  ,>=

           boolean result = 200 > 40;   // true

           System.out.println("11 = " + 11);

           boolean result12 = 300 >= 150;  //true

           System.out.println("12 = " + 12);

           boolean result113 = 100 >= 100;  // true

           System.out.println("13 = " + 13);

           boolean result114 = 300 >= 500;   //false

           System.out.println("result114 = " + result114);

           // credit score of 720

           int creditScore = 745;
           boolean isEligibleForLoan = creditScore >= 720;  // if the credit score is 720 or greater;then it's eligible for loan

           boolean result15 = 100 < 120; // false

           System.out.println("result15 = " + result15);

           boolean result16 = 200 < 188;    //false
           System.out.println("result16 = " + result16);

           int score = 75;
           boolean hasFailed = score <= 59;

                //59 <=59
           System.out.println("hasFailed = " + hasFailed);

           boolean result17 = 45 <= 60;
           System.out.println("result7 = " + result17);

           System.out.println("____________________________________________");

           int x = 100;
           int y = 200;

           boolean equal = x == y; //false
           //             100 == 200

           System.out.println("equal = " + equal);

           boolean result8 = " omar = " == " Good guy";
           System.out.println("result8 = " + result8);

           boolean result9 = 'A' == 'a';

           System.out.println("result9 = " + result9);

           boolean result10 = "Java" == "Java"; // true
           System.out.println("result10 = " + result10);

           //"Hello World" == hello world" ==> false
           System.out.println("________________________________");

           boolean result11 = 100 != 200.5;  // true

           System.out.println("result11 = " + result11);

           boolean result1 = " Java " != " Break";  // true
           System.out.println("result12 = " + result12);

           boolean result13 = 300 != 300;// false
           System.out.println("result13 = " + result13);

       }
   }
