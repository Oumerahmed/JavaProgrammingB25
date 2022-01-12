package day15_ForLoop;

public class EvenNunmberSum {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 100; i++) {
            sumEven += i;
        }

        System.out.println("sumOdd = " + sumOdd);

        System.out.println("sumEven = " + sumEven);
    }
}
