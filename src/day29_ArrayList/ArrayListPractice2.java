package day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {


        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("ali", "david", "cydeo", "ahmed", "shay", "david"));

        employee.retainAll(Arrays.asList("ahmed", "david"));


        System.out.println(employee);


        System.out.println("============================");

        String[] names = {"Mary", "Monica", "Mehary", "Musti", "Sumray", "bushera"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));


        list.removeIf(p -> p.charAt(0) == 'M');

        System.out.println(list);


    }
}
