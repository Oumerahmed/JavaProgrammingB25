package day3_12_18_2021;

public class WriteTillWord {
    public static void main(String[] args) {



       /* Given a non-empty string like "Code" print a string like below output.
        (do with substring  first)
        Code → "CCoCodCode"
        abc → "aababc"
        ab → "aab"
        (do with replaceFirst())
        Code → "C-Co-Cod-Code"
        abc → "a-ab-abc"
        ab → "a-ab"

        */


        String word = "code";

        String c = word.substring(0,1);
        System.out.println("c = " + c);
        String co = word.substring(0,2);
        System.out.println("co = " + co);






        for (int i = 0; i <word.length() ; i++) {
            String temp = word.substring(0,i);
            System.out.println(temp);
        }

    }
}
