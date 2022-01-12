package Dat4Practice_12_22_2021;

public class Practiceloop {
    public static void main(String[] args) {


     //   String s = "I will find the lost book";

      //  String word = "";

   //     for (int index = s.length()-1 ;index>=1;index--){

    //        word+= s.charAt(index);


    //    }

    //    System.out.println(word);


        String input = "today it will be 100 degrees";
        int n = 0;

        while (n++<input.length()){


            if (n==8){
                continue;

            }else if (n==9){
                break;
            }

            System.out.println(input.charAt(++n)); // charAt(2) =d
                                                  // charAt(4) = y
                                                  // charAt(6) = i
                                                 // charAt(8) = ' '






        }








    }
}
