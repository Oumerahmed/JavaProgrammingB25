package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {





        /* java =avaj =false (not palindrom)

          anna  = anna  = true
          dad = dad   =true

         */

       String word = "Level";
       String reversed =" ";

      for (int i = word.length()-1; i>=0; i--){
          reversed+=word.charAt(i);
      }

      boolean isplindrome =word.equalsIgnoreCase(reversed);

        System.out.println("isplindrome = " + isplindrome);
    }
}
