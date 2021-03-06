package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCCBC";
        String result1 = " ";  // ABC

        for (int i = 0; i < str.length(); i++) { // i: represents all the index number of srt (start from 0)
            String ch = " " + str.charAt(i); // represents each character of str

            if (!result1.contains(ch)) {  //if the character is not contain the result'
                result1 += ch; //the character will be added to  the result
            }
        }
        System.out.println(result1);
    }
}
   /* 2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */
