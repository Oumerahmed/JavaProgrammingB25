package day04_Variable;

public class PrimitiveIntro {


    public static void main(String[] args) {

        // age : 38 years old

        Byte age = 38;


        // weight: 160 pounds

         // byte weight=160 ; //160 is out of byte range

        short weight =160; //160 is within the range of short

       // salary: 100000 $
       //short salary= 100000; //100000 is out of short range

        int salary =100_000; // int is the  preferred data type integer numbers

       // int salary = 3_333_333 _333  this is out of int range.
      //  long asset = 3_333_333_333l; we can do like this.


       long asset = 3_333_333_333L; // when we use long we have to put upper  or lower case L


        //tax: o.26
        float tax = 0.26F;  // for decimal number we have to use float and double.but double the preferred one


        double pi =  3.14;




      // #
       char ch1 = '#';
       char gender = 'F';
       char gender1= 'M';
       char  yesOrno= 'y';
        System.out.println("ch1 = " + ch1);



   boolean isEmployeed = true;
   boolean isMarried = false;
   boolean results1 = 100 > 300 ;

   System.out.println("isEmployeed = " + isEmployeed);
   System.out.println("isMaried =" + isMarried);
   System.out.println("result1=" + results1 );





       String name = " Wooden  Spoon";
       String city = " McLean";
       String State = " Virginia";
       String country = "USA";


        System.out.println("name=" + name);



    }

}


/*  int for integer
    double for decimale
    char single character
    boolean for true false

    string =   sequence of character


        * when you have two variable use Camel case

    1.variable must be uniqe
    2.camel case
    3.can not start by digits
    4.start with lower case letter
    5.can not be java reserved word like byte char, int
    6. no special character ohet than _ and $
    7. readable, understandable

 */


