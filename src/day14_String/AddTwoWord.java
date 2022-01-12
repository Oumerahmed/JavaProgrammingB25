package day14_String;

import java.util.Scanner;

public class AddTwoWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        input.close();

        String result = "";

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            result = word1 + word2.substring(1);

        } else {
            result = word1 + word2;
        }
        System.out.println(result);

    }
}

/*4. Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the last letter is the same,
        print that character once.

        Input:
        one
        eight
        Output:
        oneight
 */