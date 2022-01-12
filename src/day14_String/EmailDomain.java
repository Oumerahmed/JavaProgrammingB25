package day14_String;

import javax.swing.*;

public class EmailDomain {
    public static void main(String[] args) {

        String email = " Cydio.School@gmail.com";
        // domain
        int beginningindex = email.indexOf("@") + 1;
        int endingindex = email.lastIndexOf(".");

        String domain = email.substring(beginningindex, endingindex);

        System.out.println(domain);

        System.out.println("--------------------");

        String str1 = "java is fun , java is cool ,I love java";

        // 0123456789
        String s1 = str1.substring(0, 10 + 1); // java is fun

        int beg = str1.indexOf(" j") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end); // java is cool

        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
