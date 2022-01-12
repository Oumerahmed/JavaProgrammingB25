package day31_Constracters;

public class Pizza {

    public char size;
    public int numberOfCheeseTapping;
    public int numberOfPepperoniTapping;


    public Pizza(char size, int numberOfCheeseTapping, int numberOfPepperoniTapping) {
        this.size = size;
        this.numberOfCheeseTapping = numberOfCheeseTapping;
        this.numberOfPepperoniTapping = numberOfPepperoniTapping;
    }

    public double calcCost(){

       double startingPrice = (size=='S')? 10:(size=='M')? 12:14;

        double totalPrice = startingPrice + (numberOfCheeseTapping+numberOfPepperoniTapping) * 2;

      return totalPrice;
    }

}
   /* Pizza Task:
        Attributes:
             size, numberOfCheeseTopping, numberOfPepperoniTopping

              Add a constructor that can set all the fields

        Actions:
             calcCost(): returns the totalCost of the pizza
             toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
            S: $10 + $2 per topping
            M: $12 + $2 per topping
            L: $14 + $2 per topping

    */