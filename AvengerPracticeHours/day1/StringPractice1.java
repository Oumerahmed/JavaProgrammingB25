package day1;

public class StringPractice1 {
    public static void main(String[] args) {

        /*give a string, print the string made of its first two string tow
        string ''Hello''  yeled ''HE''
         */


      /* String str = "Hello";
       str=  str.toUpperCase();
        String S =  "" +str.charAt(0)+str.charAt(1);
        System.out.println("S = " + S);

       */

        String str = "Hello";
        str = str.toUpperCase();
        System.out.println("str = " + str.substring(0, 2));


    }
}
