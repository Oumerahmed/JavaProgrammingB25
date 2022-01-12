package day30_CustomClass;

public class MobilePhone {

    public String brand;
    public String model;
    public String color;
    public int storage;
    public int year;
    public double price;

    public void setInfo(String brand, String model, String color, int storage, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", year=" + year +
                ", price = $" + price +
                '}';
    }

    public void speed() {
        System.out.println(brand + " " + model + " has speed ");
    }

    public void photo() {
        System.out.println(brand + "  " + model + " has amazing picture");
    }


}
