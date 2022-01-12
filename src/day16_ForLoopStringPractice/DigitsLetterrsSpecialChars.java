package day16_ForLoopStringPractice;

public class DigitsLetterrsSpecialChars {
    public static void main(String[] args) {

    String str   =  "Cydeo1234school!@#$%woodenspoon ";

    String digits = " "; // 1234
    String letter = " "; // Cydeoschholwoodenspoon
    String specialChar = " "; // !@#$%

    for (int i = 0; i<str.length() ; i++){ // i:index number of the str (start from 0)
        char ch = str.charAt(i); // ch: each character that we have in the str

        if(ch>='0' && ch<='9'){ // if the character is between '0' to '9' then it is digits
            digits += ch;
        }else if(ch>='A' && ch<='Z'){ // if the character is between 'A' to 'Z' then it is letter.
            letter += ch;
        }else if (ch>='a'&& ch<='z'){ // if the character is between 'a' to 'z' then it is letter.
            letter += ch;
        }else {   // if the character is neither digit nor letter, then it is special character
          if (ch!=' ') {   // if the special character is not a space
              specialChar += ch;
          }
        }

    }
        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);

    }
}






















