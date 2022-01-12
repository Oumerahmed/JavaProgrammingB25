package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 75;
        String Oxygen ="";

        if (level > 90) {
            Oxygen  ="your thank is full";
        } else if (level >= 80 && level <= 89) {
            Oxygen ="still okay";
        } else if (level >= 70 && level <= 79) {
            Oxygen  ="don't go too far";
        } else if (level >= 60 && level <= 69) {
            Oxygen ="start head to back";
        } else {
            Oxygen  ="be careful now you at 50%";
        }

        System.out.println(Oxygen);

    }
}

     /* 4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you  at 50%

                USE ONE PRINT STATEMENT ONLY
        */