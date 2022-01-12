package Day3Practice12_15_2021;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

                    /*
                     (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi
                  */

        Scanner input = new Scanner(System.in);
        System.out.println("enter any word");
        String word= input.nextLine();
        System.out.println("enter positive number");
        int num= input.nextInt();


        int count=0;
        String sum = "  ";


        while (count<num){
            sum+=word;
            count++;
        }


       System.out.println(sum);



    }
}
