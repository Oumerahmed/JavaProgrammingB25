package day17_while_DoWhileLoop;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
     String str = "Java Java Python python";
     int frequency = 0;

     while (str.contains("Java")){
         str =str.replaceFirst(" Java"," ");
         frequency++;

     }
        System.out.println(frequency);

        System.out.println("-------------------");

        String sentence = "cat cat dog dog";
                    // "cat dog dog"
                    // " dog dog "

        sentence = sentence.toLowerCase();

        int countCat = 0; // 2

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat"," ");
            countCat++;

            System.out.println(countCat);

            System.out.println("----------------------");

           String s = "java java java python python";

           int countJava = 0;
           int countpython = 0;

          while (s.contains("java")|| s.contains("python")){

              if (s.contains("java")){
                  s = s.replaceFirst("python"," ");
                  countJava++;

              }
              if (s.contains("python")){
                  s = s.replaceFirst("python"," ");
                  countpython++;

              }
            }

            System.out.println("countJava = " + countJava);
            System.out.println("countpython = " + countpython);

        }


    }
}
