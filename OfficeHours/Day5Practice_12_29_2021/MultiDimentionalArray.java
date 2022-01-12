package Day5Practice_12_29_2021;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {

        String[] scrum1 = {"Ayseguale", "Timul", "Oliksander"};

        String[] scrum2 = {"Ali", "Timul", "Omar"};

        String[] scrum3 = {"Adem", "Timul", "abrbra"};


        String[][] scrumTeam = {scrum1, scrum2, scrum3};


        System.out.println(Arrays.deepToString(scrumTeam));  // must be deepToString

        System.out.println("===========================");
        System.out.println(scrumTeam[1][1]);


        System.out.println("===========================");
        for (String[] eachScrum : scrumTeam) {
            System.out.println(Arrays.toString(eachScrum));
        }

        System.out.println("===========================");


        for (String[] eachScrum : scrumTeam) {
            for (String eachName : eachScrum) {
                System.out.print(eachName + " ");
            }
        }


    }
}
