package day23_CustomMethods_Void;

public class oddNumbers1to100 {

    public static void main(String[] args) {

        oddNumbers1to100();
    }

    public static void oddNumbers1to100(){

        for (int i = 0; i < 101; i++) {

            if (i <101 && !(i % 2==0)){

                System.out.print(i+"   ");
            }
        }



    }
}
