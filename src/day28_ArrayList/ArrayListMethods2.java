package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

       /* int num = 1;
        list.remove(num);
        */

        Integer num = 200;
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);


        System.out.println("---------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("---------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf("A");


        System.out.println("-------------");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        characters.contains('Z');


        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("--------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));


        System.out.println("---------------------");

        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4);


        System.out.println("---------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3,4,5,6, 7));

        System.out.println(numbers);


        System.out.println("---------------------");

      ArrayList<String> name = new ArrayList<>();

      name.addAll(Arrays.asList("oumer","adem","ahmed"));

        name.set(1,"BANANA");
       name.remove(2);

        boolean r1=name.contains("ahmed");

        System.out.println("r1 = " + r1);


        System.out.println("name = " + name);

        System.out.println("r1 = " + r1);


        System.out.println("---------------------");




        ArrayList<Integer> oumer = new ArrayList<>();
               oumer.add(10);
               oumer.add(20);
               oumer.add(30);
               oumer.add(40);
               oumer.add(50);


        for (int i = 0; i < oumer.size(); i++) {
            System.out.println(oumer.get(i));
        }

        System.out.println("=======================");
        for (int i = oumer.size() - 1; i >= 0; i--) {
            System.out.println(oumer.get(i));
        }


    }
}
