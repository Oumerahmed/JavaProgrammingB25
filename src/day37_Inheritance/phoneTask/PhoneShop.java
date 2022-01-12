package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone", "6.7 inch", 1000, "Black");


        Samsung samsung = new Samsung("galaxy S19", "6 inch", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inch", 600, "gray");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12345678);
        iphone.faceTime(7688);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("================================");


        samsung.call(911);
        samsung.text(123456);
        samsung.freeze();

        System.out.println("================================");

        nokia.call(20689899);
        nokia.text(2065432);
        nokia.selfDefense();

        System.out.println("================================");


        System.out.println(Phone.hasBattery);

        System.out.println(Iphone.hasBattery);

        System.out.println(Samsung.hasBattery);

        System.out.println(Nokia.hasBattery);

    }
}
