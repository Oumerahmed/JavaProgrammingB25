package day16_ForLoopStringPractice;

public class UniqeCharacters {
    public static void main(String[] args) {

        String str = "AAABCC";
        String result = " ";     // B

        for (int i = 0; i < str.length(); i++) { // i: index number of string(start from 0)
            char ch = str.charAt(i); //ch: each character of string

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
   /* 3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AAABCC
				output:
					B
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
        */