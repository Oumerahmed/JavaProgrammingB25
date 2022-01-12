package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);  // hashcode will happen

        System.out.println(Arrays.toString(nums));  // "{1, 2, 3, 4, 5}"
        System.out.println(nums[0]); // to print one element

        System.out.println("-------------------");

        int[] scores = {95, 100, 95, 65, 85, 78};
        Arrays.sort(scores); // 65.. 100

        System.out.println(Arrays.toString(scores));

        System.out.println("min score"+ scores[0]);
        System.out.println("max score"+ scores[scores.length-1]);

        String[]name= {"Gnya", "Anna","Zuhal",  "Maria","Ahmet"};

        Arrays.sort(name);

        System.out.println(Arrays.toString(name));


        String[]word = {"Anna ","ANNA"};  // upper case print first
        Arrays.sort(word);

        System.out.println(Arrays.toString(word));

        System.out.println("-----------------");

        int [] art1 = {1, 3, 2};
        int [] art2 = {1,2,3};

        boolean r1 = Arrays.equals(art1,art2);

        Arrays.sort(art1);
        Arrays.sort(art2);

        boolean r2 = Arrays.equals(art1,art2);

        System.out.println(r2);

        System.out.println("----------------");

        // "acb , bac

        char [] ch1= {'a','c','b'};
        char [] ch2 = {'b','a','c'};

        Arrays.sort(ch1); // abc
        Arrays.sort(ch2); // abc

      boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram ="+ anagram);




    }
}
