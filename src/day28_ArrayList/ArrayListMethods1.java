package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);    // 0
        numbers.add(20);    //1
        numbers.add(30);    //2
        numbers.add(40);    // 3
        numbers.add(50);    // 4
        numbers.add(60);   // 5


        numbers.add(2, 25);
        numbers.add(5, 456);

        System.out.println(numbers);


        System.out.println(numbers.size());

        System.out.println(numbers.size() - 1); //



       int num =numbers.get(3);

        System.out.println("num="+num);

        System.out.println("-------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("----------------");


        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.add("c++");
        list.add("ruby");


        list.set(2,  "javaScript");
        list.set(3,"c++");


        System.out.println(list);

        System.out.println("---------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("suat");
        employees.add("oumr");
        employees.add("Ali");
        employees.add("abeabr");
        employees.add("kedbr");
        employees.add("bgdd");
        employees.add("bhgff");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

         employees.remove(0);

        System.out.println(employees);


        employees.remove(1);

        System.out.println(employees);

     employees.remove(employees.size()-1);

        System.out.println(employees);

           boolean r1 =employees.remove("bgdd");

        System.out.println(employees);

        boolean r2= employees.remove("Ali");

        System.out.println(employees);





    }
}
