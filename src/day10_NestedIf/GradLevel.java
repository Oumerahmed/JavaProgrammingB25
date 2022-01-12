package day10_NestedIf;

public class GradLevel {
    public static void main(String[] args) {


        byte age = 4;
        String result1 = "";

        if (age >= 1 && age <= 19) {


            if (age >= 1 && age <= 5) {

                result1 = "elementary school";

            } else if (age >= 6 && age <= 8) {
                result1 = "middle school";
            } else if (age >= 9 && age <= 12) {
                result1 = "high school";
            } else if (age >= 13 && age <= 16) {
                result1 = "college";
            } else {
                result1 = "grade school";
            }

          } else {
              result1 = "Invalid grad level";
        }
            System.out.println(result1);
    }
}
