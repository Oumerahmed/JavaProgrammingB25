package day20_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] name = {"Kider","Jemal","Java","Ahmed"," Mohamed","Ibra","Diana","Adem","Nuruhusen","Omo"};

        String reverseName = "";

        for (int i = 0; i <name.length ; i++) {

            for (int j =name[i].length()-1; j>=0; j--){
                reverseName = ""+name[i].charAt(j);

                System.out.print(reverseName);
            }

            System.out.println();
         }

        }
    }

