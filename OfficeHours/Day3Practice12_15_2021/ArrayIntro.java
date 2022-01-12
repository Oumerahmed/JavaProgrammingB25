package Day3Practice12_15_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String [] color = {"yellow","blue","purple"};
                //            0         1     2
        // finding sizeof array
        System.out.println(color.length);



        // equals

        int [] num = new int[4];
        num[0]= 40;
        num[1]= 420;
        num[2]= 41;
        num[3]= 4222;


        System.out.println(Arrays.toString(num));


        String[] color1= new  String[3];

        color1[0] = "red";
        color1[1]= "orange";
        color1[2]=  "green";

        System.out.println(Arrays.toString(color1));


        // sort

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));





    }
}
