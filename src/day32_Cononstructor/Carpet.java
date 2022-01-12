package day32_Cononstructor;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;


    //          5.5      7.5         10.5


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }




    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;

        if (isPersian) {

            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price =$" + calcCost() +

                '}';
    }
}
