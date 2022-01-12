package day17_while_DoWhileLoop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

      String str = "AABBCC";
      char ch ='B';
      int frequency = 0; // 1+1+1
      for (int i = 0; i<str.length() ;i++){ // i:index of str
        char eachChar = str.charAt(i); // eachChar  : each character for str

         if (ch==eachChar){  //if given ch matching with each char,then ch appeared in the string
             frequency+=1;
         }

      }
        System.out.println(frequency);

    }
}

  /*
     1. Write a program that can return the frequency of a char from a String
			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
 */