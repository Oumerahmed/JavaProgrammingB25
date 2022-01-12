package day29_ArrayList;

import utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


        System.out.println(list);


        list.addAll(Arrays.asList(3, 4));


        System.out.println(list);

        System.out.println("===================");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 300, 900, 800));

        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(100, 300, 200));

        System.out.println(numbers);


        System.out.println("===================");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("qa", "sdet", "developer", "qa", "scrum method"));

        jobTitles.retainAll(Arrays.asList("qa", "sdet"));

        System.out.println(jobTitles);

        System.out.println("===================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));

        // boolean r1 = nums.contains(10);

        // boolean r2 = nums.contains(2) && nums.contains(5)&& nums.contains(10);


        boolean r3 = nums.contains(Arrays.asList(2, 5, 10));


        // System.out.println("r1 = " + r1);

        // System.out.println("r2 = " + r2);

        System.out.println("r3 = " + r3);


        System.out.println("===================");


        String[] name = {"josh", "jack", "danile", "shay", "brina"};

        //   ArrayList<String> nameList = new ArrayList<>();
        //  nameList.addAll(Arrays.asList(name));

        ArrayList<String> namelist = new ArrayList<>(Arrays.asList(name));

        System.out.println(namelist);


        System.out.println("===================");


        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("===================");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list3);


        System.out.println("===================");


        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList("JAVA","PAYTHON","JAVASCRIPY","C++","C#","JAVA"));
        list5.removeIf(   p-> p.startsWith("J")   );

        System.out.println(list5);

        System.out.println("===================");


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("ANNA","OUMER","EVE","JAVA","CYDEO"));

        names.removeIf(o -> StringUtility.isPalindrome(o));


        System.out.println(names);




    }

}







