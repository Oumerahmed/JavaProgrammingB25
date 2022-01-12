package day2;

public class Unique {
    public static void main(String[] args) {


        String str = "AAABCCCDEFFFFSSSZOhy";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch);
            }

        }


        System.out.println("---------------");


        if (true) {

            System.out.println("hello");
        }

        System.out.println("---------------");

        //  while (true) {   //   non stop
        //   System.out.println("hi");
        //  }

        String str2 = "AABBCC";

        String result = "";
        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);


            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;

        }
        System.out.println("result = " + result);


        System.out.println("=================================");

          int j = 1;
           while (j <= 10) {
            System.out.print(j);
            j++;
        }


    }
}
