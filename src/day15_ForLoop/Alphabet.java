package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        //A~Z
        for (char i = 'A'; i <= 'Z'; i++) {  //i: A B C D...Z
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("_______________________");

        //a~z
        for (char i = 'a'; i <= 'z'; i++) {    // i: a b c d
            System.out.print(i + "    ");
        }

        System.out.println();

        System.out.println("_________________-");

        //Z~A

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "  ");

        }

        System.out.println();
        System.out.println("---------------------------------");

        //z~a

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("------------------------");

        //for (char i = 1; i <= 40000; i++) {
        //  System.out.print(i + "   ");
        // }

    }
}
       /* print
        A~Z
        a~z
        Z~A
        z~a
      */