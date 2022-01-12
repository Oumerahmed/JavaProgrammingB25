package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 11;

        String result = " ";
        if (number >= 1 && number <= 12) {  // if it is valid  this is pre-condition
            if (number == 1) {
                result = "Jan";
            } else if (number == 2) {
                result = "Feb";
            } else if (number == 3) {
                result = "Mar";
            } else if (number == 4) {
                result = "Apr";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "Jun";
            } else if (number == 7) {
                result = "Jul";
            } else if (number == 8) {
                result = "Aug";
            } else if (number == 9) {
                result = "Sep";
            } else if (number == 10) {
                result = "Oct";
            } else if (number == 11) {
                result = "Nov";
            } else {
                result = "Dec";
            }
          } else {
            result = "invalid";
        }
        System.out.println(result);
    }
}











































