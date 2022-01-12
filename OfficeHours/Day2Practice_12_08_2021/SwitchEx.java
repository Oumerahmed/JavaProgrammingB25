package Day2Practice_12_08_2021;

public class SwitchEx {
    public static void main(String[] args) {

/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */

        String animal = "TIGER";
        String result = "";

        switch (animal){

            case "DOG":
            case  "CAT":
                result= "domestiv animal";
                break;

            case "TIGER":
                result= "wild animal";
                break;

            default:
                result = "unkown animal";


        }

        System.out.println(result);





    }
}
