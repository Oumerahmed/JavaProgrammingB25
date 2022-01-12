package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimentinalArrayIntro {
    public static void main(String[] args) {

        String[] group1= {"jone ", "mike", "oum"};
        String[] group2= {"jone ", "mike", "oum"};
        String[] group3= {"jone ", "mike", "oum" ,"adem ","tuba"};

        String[][] group = new String[3][]; //  index : 0 1 2
        group[0] = group1;
        group[1] = group2;
        group[2]= group3;

        System.out.println(Arrays.deepToString(group));

        System.out.println("-----------------------------------");

        /*
        {1, 2, 3}
        {4, 5,6,7}
        {8, 9,10,11,12,}


         */
     // index of element     0 1 2     0 2 3 4    0  1  2  3 4
        int[][] arr2D = {   {1,2,3}  ,{4,5,6,7,} ,{8,9,10,11,12}     };

       //                       0           1              2


        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1])); // 4 5 6 7

        System.out.println(arr2D[2][3]);    // 11


    }

}

     /*
        String[] group1= {"jone ", "mike", "oum"};
        String[] group2= {"jone ", "mike", "oum"};
        String[] group3= {"jone ", "mike", "oum"};

         */




