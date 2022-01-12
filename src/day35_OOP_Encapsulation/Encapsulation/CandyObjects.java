package day35_OOP_Encapsulation.Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyObjects {
    public static void main(String[] args) {


        Candy candy1 = new Candy("m&m", 2, 5.99, true);
        Candy candy2 = new Candy("Snickers", 3, 5.99, true);
        Candy candy3 = new Candy("Crunch", 4, 12.99, false);
        Candy candy4 = new Candy("m&m", 1, 9.99, true);


        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4));

        for (Candy each : candies) {
            System.out.println(each.getBrand() + "is: $" + each.getPrice());

        }




    }
}
