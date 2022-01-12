package day2;

public class DigitsLetterSpecialChars {
    public static void main(String[] args) {


        String str = "987654321ABCDEFGHIJ@#$&*";

        String digits = "";
        String letters = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                digits += ch;


            } else if (ch >= 'A' && ch <= 'Z') {

                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {


            } else {

                if (ch != ' ') {

                    specialChar += ch;
                }
            }


        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);

        System.out.println("-------------------");


        String word = "Civic";

        String reversed = "";


        for (int i = word.length() - 1; i >= 0; i--) {

            reversed += word.charAt(i);

        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


        System.out.println("-------------------");


        String str1 = "aabbcc";
        String result = "";


        for (int i = 0; i < str1.length(); i++) {


            String ch = ""+ str1.charAt(i);

            if (!result.contains(ch)) {
                result += ch;

            }

        }


               System.out.println("result = " + result);


        System.out.println("-------------------");



      // reverse

       String str4 = "I love Java";

       String resulte = "";

        for (int i =  str4.length()-1 ; i>=0; i--) {

            resulte+= str4.charAt(i);

        }

        System.out.println("resulte = " + resulte);


    }
}
