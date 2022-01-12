package day1;

public class NestedLoop {
    public static void main(String[] args) {

        // print 1~5 for 15 times


        for (int j = 1; j <= 15; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) { // we can paste to the Inter loop
            System.out.print(i + "  ");
        }


        // break statement:

        System.out.println("---------------------------------");


        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);

            if (i == 'C') {
                break;
            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "  ");

            if (i == 3) {
                break;  // exits the loop
            }
        }


        System.out.println("---------------------------------");
        // continue Statement
        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;  // for skip
            }

            System.out.print(i + " ");

        }

        System.out.println("==================");

        for (char ch = 'A'; ch <= 'D'; ch++) {
            if (ch == 'C') {
                continue;
            }
            System.out.println(ch + "");
            if (ch == 'B') {
                break;
            }

            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {

            System.out.println(i);
        }

    }
}
