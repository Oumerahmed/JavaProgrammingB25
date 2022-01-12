package day1;

public class StringPractice2 {
    public static void main(String[] args) {

        // get 3 copy selected character



    /*   String  str = "CYDEO";
      int lastIndexOfchar = str.length()-4;
      int lastsecondofchar = str.length()-2;
      String result ="" + str.charAt(lastIndexOfchar)+str.charAt(lastIndexOfchar);

        System.out.println("result = " + result.repeat(3));

        */

        String str = "CYDEO";
        int lastsecondofchar = str.length();
        String chars = str.substring(lastsecondofchar - 3);
        System.out.println("lastsecondofchar = " + lastsecondofchar);


    }
}
