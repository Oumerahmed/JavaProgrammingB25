package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26]; // z~a

                     /* alphabet[0]=  'z';
                      alphabet[1]= 'y';
                      alphabet[2]= 'x';
                        */
        char ch = 'z';

        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }
        System.out.println(Arrays.toString(alphabet));     // print the whole array

        System.out.println(alphabet[3]);// print the element of array

        System.out.println("---------------------");

        int[] number = {1, 2, 3, 5,};
        int sum = number.length;

        for (int i = 0; i < number.length; i++) {

            sum += number.length;
        }
        System.out.println(Arrays.toString(number));
        System.out.println(sum);

        System.out.println("------------------------");


    }
}

