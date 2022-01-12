package Day6Practice_1_5_2022;

public class RemoveSpace {



             /*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String

                            Input: "  Hello world      I      love      Java    "
                           Output: Hello world I love Java
                     */


    public static void main(String[] args) {

      String imput = "  Hello world      I      love      Java    ";

      removeSpace(imput);


    }
    public static void removeSpace(String str){
        String result = " ";
        String[] strArr = str.trim().split(" ");
        for (String each :strArr){

            if (!each.isEmpty()){
                result +=each+" ";
            }
        }


        System.out.println(result.trim());

    }


}
