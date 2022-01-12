package day11_Switch_Scanner;

public class DayInWeek {
    public static void main(String[] args) {

        int number =15;

        switch (number){  //1,2,3,4,5,6,7, expression
                          // if == only

            case 1 :
                System.out.println("mon");
                break;
            case 2 :
                System.out.println("tus");
                break;
            case 3 :
                System.out.println("wed");
                break;
            case 4 :
                System.out.println("thu");
                break;
            case 5 :
                System.out.println("fri");
                break;
            case 6 :
                System.out.println("sat");
                break;            // all break exits the switch after excutting case block
            case 8 :
                System.out.println("sun");
                break;            // the last one no need

                        // if we need additional print

            default:
                System.out.println("invalid");

          /* case value must much switch data type and must be unoqe.
             switch data can not be long,float,double and boolean.
             if we don't give break switch statement continiue excuting until break statement or }
             the sign
             default not case much

           */
        }

    }
}
