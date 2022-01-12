package day07_Oprator;

public class ShortHandOprators {

    public static void main(String[] args) {

       // assignment : =

        int number = 100;

        System.out.println("   number= " + number);   //100

        number = 200;

        System.out.println("   number   " + number);  // 200

        String word = "   Java programing ";

        System.out.println("   word = " + word); // java programing

        word = " Wooden Spoon";

        System.out.println(" word  = " + word);  // wooden spoon

        word = "  Cydeo";

        System.out.println("  word =  " + word);

        word = "  jsva programing";

        System.out.println(" word =" + word);

        // double qouat "" is for string

        System.out.println("-------------------------------------------");

        // Addition assignment

        int x = 100;

        System.out.println("x =" + x);
        System.out.println(x + 200); // 300

        // x = x + 200:

        x += 200;

        System.out.println(" x = " + x);


        String str = " Wooden";

        str += " spoon";

        System.out.println(" str = " + str);

        double num1 = 2.5;
        System.out.println("num =" + num1); // 2.5

        num1 += 5.5;

        System.out.println("num =" + num1);  // 8.0

        double availableBalance = 1000.50;

              // deposit 300$

        availableBalance += 300;  // availableBalance = 1000.50 + 300

        System.out.println("availableBalance  =" + availableBalance);

        System.out.println("______________________");

        // withdrawing 500$

        availableBalance -= 500; //availableBalance = 1300.5 - 500

        System.out.println("availableBalance = " + availableBalance);


        // withdrawing 200$ , then deposit 400$

        availableBalance -= 200; // availableBalance = 600.5

        availableBalance += 400; //availableBalance = 1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println(" ______________________________________");

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2;  // slary * salary
        System.out.println("salary = " + salary);

     double  dodge = 0.00000001;
     dodge *= 1000000;

        System.out.println("dodge = " + dodge);

        System.out.println("------------------------------------------------------");

        double num2 = 25000;
       // num2 = num2/ 2;

       num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------------------------");

     double num3 = 100;
     // %
     num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("_______________");

      int amount = 127; // cents

     int quarters = 127/25;
     int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("_______________________________");

    int cents2 =127;
     cents2 %=25;

        System.out.println("cents2 = " + cents2);

        System.out.println("___________________________________________");

        int y = 300;

        y = 300;

       y %=16;

        System.out.println("y = " + y);

        System.out.println("____________________________________________");

        int balance = 3500;
        //inshurance fee: 153
        
       balance %= 153;

        System.out.println("balance = " + balance);
        
        
    }

}
