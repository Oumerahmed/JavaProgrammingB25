package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {


    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Aygum", 'F', 39, 2022, 'A');

        Student student2 = new Student();
        student2.setInfo("hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Emilar", 'M', 26, 2210, 'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 55, 5511, 'B');


        Student[] students = {student1, student2, student3, student4};


        for (Student student : students) {

            System.out.println(student);
        }

        System.out.println("===========================");

        ArrayList<Student> earlyBird = new ArrayList<>();   // grade A
        ArrayList<Student> angryBird = new ArrayList<>();

        for (Student student : students) {

            if (student.grade == 'A') {
                earlyBird.add(student);


            } else {

                angryBird.add(student);
            }
        }


        System.out.println(earlyBird);


        System.out.println(angryBird);

    }

}
