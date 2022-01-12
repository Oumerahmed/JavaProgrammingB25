package Day3Practice12_15_2021;

public class SumOfEven_Odd {
    public static void main(String[] args) {

                        /*
                       (SumOfEven_Odd)
                     Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
                   */


        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;

        do {

            if (i % 2 == 0) {
                sumOfEven += i; //  sumOfEven= 2+4=6

            } else {
                sumOfOdd += i;    // sumofodd= 1+3=4
            }
            i++;


        }

          while (i<=10);


        System.out.println("sum of even are "+sumOfEven);
        System.out.println("sum of odd are  "+sumOfOdd);

        }


    }




