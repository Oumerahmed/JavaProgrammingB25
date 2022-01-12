package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    // pre-condition: if there is only one statement in the block
    public static void main(String[] args) {
        int number = 10;
        String result1 = "";

        if(number == 1) {
            result1 = "January";
        }else if(number == 2)
            result1 = "February";
        else if(number == 3)
            result1 ="March";
        else if(number == 4)
            result1 ="April";
        else if(number == 5)
            result1 ="May";
        else if(number == 6)
            result1 ="June";
        else if(number == 7)
            result1 ="July";
        else if(number == 8)
            result1 ="August";
        else if(number == 9)
            result1 ="September";
        else if(number == 10)
            result1 ="October";
        else if(number == 11)
            result1 ="November";
        else
            result1 = "December";

         System.out.println(result1);
    }
}




        


