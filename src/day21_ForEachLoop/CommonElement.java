package day21_ForEachLoop;

public class CommonElement {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {4, 5, 6, 7, 8};

        String common = " ";
        for (int i : num1) {
            for (int i1 : num2) {
                if (i == i1) {
                    System.out.println(i);
                }
            }
        }
    }
}
          /*
               Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops
       */