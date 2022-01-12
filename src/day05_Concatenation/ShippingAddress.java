package day05_Concatenation;

public class ShippingAddress {


    public static void main(String[] args) {

      /*  String   Name = "  James king",    // this one if we have same data type name
                 buildingNumber = "1234",
                 streetAddress = "Jones Branch",
                 city =  "seattle",
                 state = "Wa",
                 zipCode = "98145"; */


        String name = "  James king";
        String buildingNumber = "1234";
        String streetAddress = "Jones Branch";
        String city =  "seattle";
        String state = "Wa";
        String zipCode = "98145";

     System.out.println (name + "\n" + buildingNumber +" " + streetAddress +"\n" + city +"," + state + " " +zipCode );


        System.out.println(name + "\n" + buildingNumber +"  "+streetAddress +"\n" + city +","+ state + " " + zipCode);

    }
}
/* Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address


 */