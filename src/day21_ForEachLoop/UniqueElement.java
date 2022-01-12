package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {

        String[] word = {"Layan", "layan", "Oleksandra", "olga", "adem", "Adem", "Cihad", "Cihad", "Cydeo"};

        for (String each : word) {
            int count = 0;

            for (String element : word) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}





