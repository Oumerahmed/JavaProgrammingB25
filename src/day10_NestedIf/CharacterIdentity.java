package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 65;

        /*   1  out put = digit
             2  out put = alphabetic
             3   out put = special character
         */
        if (ch >= 48 && ch <= 57)
            System.out.println("Digit");
        else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Alphabetic");
        else {
            System.out.println("Special character");
        }
    }
}
