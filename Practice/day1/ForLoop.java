package day1;

public class ForLoop {
    public static void main(String[] args) {


        for (int i = 1; i <=8; i++) {

            System.out.println("hello world");
        }


        for (int number = 1; number <8; number++){

            System.out.println("number = " + number);
        }



        for (char i= 'A'; i <='Z';i++){


            System.out.print(i+ " ");
        }
        System.out.println("------------------------");

        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i+" ");

        }


        System.out.println("------------------------");


        for ( int i =15; i<46;i++){
          System.out.print(i+" ");
      }

        System.out.println("------------------------");



        for(int i = 100; i > 49; i-- ){ //i: 100, 99, 98... 51   ( >= , <=, > , < )
            System.out.print(i+" ");
        }

        System.out.println("------------------------");


        // print all even number 1~55

        for (int i = 1; i < 56; i++) {

            if (i%2==0){

                System.out.print(i+" ");
            }
        }







    }
}
