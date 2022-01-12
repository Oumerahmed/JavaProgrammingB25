package day1;

public class CustomMethod {
    public static void main(String[] args) {
        displayMessage();

        System.out.println("wooden spoon");
    }

    public static void displayMessage() {
        System.out.println("hello world");
        System.out.println("I love java");

        int i = 1;
        while (i <= 10) {

            System.out.println(i);
            i++;
        }

        do {
            System.out.println("hello ");
            i++;

        } while (i < 5);

        System.out.println("-------------------------");


    }
}
