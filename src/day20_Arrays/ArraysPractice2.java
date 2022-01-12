package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letter = new char[26];
     /*
        letter[0]=  'A';
        letter[1]=  'b';
        letter[2]=  'C';
        ....
               */

       /*  for (int i = 0, j = 'A'; i< letter.length;i++ ,j++){ // i: index number 0 ~ last index
            letter[i]= (char) j;
        }
       */

        char ch = 'A';
        for (int i = 0; i < letter.length; i++, ch++) {  // [A~Z
            letter[i] = ch;
        }
        System.out.println(Arrays.toString(letter));  // [A~z]

        System.out.println("-----------------");


        char[] letter2 = new char[26]; //[Z~A]



    }
}
