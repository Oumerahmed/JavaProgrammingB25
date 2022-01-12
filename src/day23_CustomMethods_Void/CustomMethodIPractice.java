package day23_CustomMethods_Void;

public class CustomMethodIPractice {
    public static void main(String[] args) {
        helloworld5times();

        System.out.println("-------------");

        hellocydeo5times();

        System.out.println("-------------");

        evenNumbers();

    }
    // create a function that can print hello world 5 times== helloworld5times()
   public static  void helloworld5times(){
       for (int i = 0; i < 5; i++) {
           System.out.println("hollo world!");
       }
   }


    // create a function that can print hello cydeo 5 times // hellocydeo5times

    public static void   hellocydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("wodden spoon");
        }
    }


    // create a function that can print all the even numbers 1~10 ==evenNumbers

    public  static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }
    }




}
