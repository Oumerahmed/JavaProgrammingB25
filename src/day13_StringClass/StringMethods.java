package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String word = "cydio";
        // 01234
        char thirdchar = word.charAt(2);
        char fouthchar = word.charAt(4);
        System.out.println("thirdchar = " + thirdchar);
        System.out.println("fouthchar  =" + fouthchar);
       /*  char tenthChar= = word.charAt(9)
        System.out.println("tenthChar = "+tenthChar);

        */
        System.out.println("----------------------------");

        String s1 = " Batch 25 is the best batch. Java programming language";
        int totalChar = s1.length();

        System.out.println("totalChar =" + totalChar);

        char lastChar = s1.charAt(s1.length() - 1); // last index number
        System.out.println("lastChar" + lastChar);

              /*String oumer = "hhhhnnbbbbzbshuhduhdehyeyfyegygyhshdhdhshdhshhhklj";
              int totalchar = oumer.length();
             System.out.println("totalchar = " + totalchar);*/


        System.out.println("--------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println(str);

        String omo = "oumer adem";
        omo = omo.toUpperCase();
        System.out.println(omo);


        // Today is a great day to lean java programming language.

        String sentence = "Today is a great day to lean java programming language";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

    }
}
