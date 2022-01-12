package day3_12_18_2021;

public class WritngTillWord2 {
    public static void main(String[] args) {

       /* do with charat

       code c


        */




     String word = "code";
     String c =word.charAt(0)+""; // c
     String co=""+  word.charAt(0)+word.charAt(1); //
     String cod =""+word.charAt(0)+word.charAt(1)+word.charAt(2);   // cod
         String code =""+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3); // code

        String temp= "";

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j <=i ; j++) {

                temp=""+word.charAt(j);

            }

            temp +="";
        }


        System.out.println("co = " + co);





    }
}
