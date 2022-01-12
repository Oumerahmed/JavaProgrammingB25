package day2;

public class Unique2 {
    public static void main(String[] args) {



   String [] word = {"Layan", "layan", "Oleksandra", "olga", "adem", "Adem", "Cihad", "Cihad", "Cydeo"};

   for (String each : word){

       int count = 0;
   for (String element :word){
       if (element.equals(each)){
           count++;
       }
   }
     if (count==1){

         System.out.println(each);
     }
   }


        System.out.println("=============");


   String s = "Java is fun";
   char c = s.charAt(4);

      if (c=='a'){
          System.out.println("A");
      }else if (c==' '){
          System.out.println("B");
      }else {
          System.out.println("C");
      }

        System.out.println("c = " + c);

    }
}
