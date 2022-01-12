package day2;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBCCCCCCDDDDDDEEEEEEE";

        char ch = 'C';

        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);


            if (ch == eachChar) {
                frequency += 1;

            }
        }

        System.out.println("frequency = " + frequency);

        System.out.println("------------------");

        //print all even number 1~10


        for (int i = 1; i < 10; i++) {

            if (i % 2 == 0) {
                continue;

            }

            System.out.println(i);
        }


        System.out.println("------------------");


        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {

                continue;
            }
            System.out.print(" " + i);


        }


        for (int j = 0; j < 4; j++) {


            for (int i = 0; i < 2; i++) {

                System.out.println("wooden spoon");

            }

        }

        for (int j = 0; j < 10; j++) {

        }

        for (int i = 0; i < 10; i++) {

            System.out.print(" * ");

        }

        System.out.println();

    }
}
