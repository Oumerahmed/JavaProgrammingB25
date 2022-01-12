package day12_Scanner;

public class Gradelevel {
    public static void main(String[] args) {


      int number = 120;
      String result1 ="";
      if (number>=0&& number<=18) { //1~18   6~18  ,default 1~5

         switch (number){

             case 6: case 7: case 8:
                   result1 = "middle school";
                   break;
             case 9: case 10: case 11: case 12:
                 result1 ="high school";
                 break;
             case 13: case 14: case 15: case 16:
                 result1 ="college";
                 break;
             case 17: case 18:

             default:
                 result1= "elementary";

         }



      }else {

          result1 ="invalid grad";

          System.out.println(result1);

      }

        System.out.println(result1);


           /*  byte number = 10;
             String result1 = "";

           switch (number){

           case 1 : case 2 : case 3: case 4: case 5:
               result = "Elementary School";
               break;
           case 6: case 7: case 8:
               result = "Middle School";
               break;
           case 9: case 10: case 11: case 12:
               result = "High School";
               break;
           case 13: case 14: case 15: case 16:
               result= "College";
               break;
           case 17: case 18:
               result = "Grad School";

           default:
               result= "Invalid grade level";
              }

            System.out.println(result);
        */

    }
}

        /*1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        For Any Other grade: Invalid grade level given
        Note:
        Solution 1: Use switch statement
        Solution 2: use if & switch both
        */