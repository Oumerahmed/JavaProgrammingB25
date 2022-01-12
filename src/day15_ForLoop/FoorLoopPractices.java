package day15_ForLoop;

public class FoorLoopPractices {
    public static void main(String[] args) {

       // 15 16 17 18...45

       /* System.out.println(15);
        System.out.println(16);
        System.out.println(17);
        ...
        System.out.println(45);*/


     for (int i = 15; i<46; i++){

         System.out.print(i+" ");

     }
        System.out.println(  "Hello World");

        System.out.println("----------------------");

     // 100 99 98 ...50

     for (int i =100; i >=50; i--) {  // i: 100 99 98..50

         System.out.print(i+ "  ");
     }

        System.out.println("---------");

     // print al even number between 1 ~ 55

        for (int i = 1; i <=55 ; i++){
            if (i % 2 == 0){
                System.out.print(i+"  ");

            }
        }
        System.out.println();

        System.out.println("________________________");

        // print all even number between 1 ~ 55: 2, 4, 6, 8,...

        for (int i = 2; i<=54 ; i+=2){  // 2 4 6 8...54
            System.out.print(i+"  ");


        }

    }
}
