package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "yahoo";
        String result1 ="";

        boolean validbrowser = browserName == "chrom" || browserName == "firefox" || browserName == "opera" ||
                browserName == "safari" || browserName == "edge";
        if (validbrowser) {       // pre- condition there is five possibility

            if (browserName == "chrom") {
                result1 = "chrome resalt is selected";
            } else if (browserName == "firefox") {
                result1 = "firefox is selected";
            } else if (browserName == "opera") {
                result1 = "opera is selected";
            } else if (browserName == "safari") {
                result1 = "safari is selected";
            } else {
                result1 = "edge is selected";
            }

        } else {
            result1 = "invalid broser";
        }
           System.out.println(result1);
    }
}
 /*1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
        String browser = "chrome";

        Output:
        Chrome Browser is selected

        Note: MUST use nested if

        nested is use alwayes when we have pre-condition

 */