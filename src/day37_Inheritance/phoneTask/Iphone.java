package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber) {

        System.out.println(brand + "  " + model + "is have face Time with phone number:" + phoneNumber);
    }

    public void faceTime(String email) {

        System.out.println(brand + "  " + model + "is have face Time with email: " + email);

    }

}

/*1.2 Create a subclass of Phone named IPhone:
        Variables:
            brand, model, size, price, color

        Methods:
                setInfo()
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */