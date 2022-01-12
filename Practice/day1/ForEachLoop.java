package day1;

public class ForEachLoop {
    public static void main(String[] args) {



        int [] number = {3, 6, 9};

        for (int each: number){
            System.out.println( each);
        }



    // replace x with a

           String str =   "xcodex";

              str=str.replace("x","a");


        System.out.println(str);


        System.out.println("===========================");


        String str1 = "          ";
        boolean r = str1.isEmpty();

        System.out.println("r = " + r);

        boolean r1 = str1.isBlank();
        System.out.println("r2 = " + r1);

       String str2 = "Cydeo                       ";

        System.out.println(str2.isBlank());

        System.out.println(str2.repeat(4));


        System.out.println("==================");


        String s1 ="CYDEO";
        String s2 ="cydeo";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("==================");



        String  sentence = "My favorite Programming language is Java";

        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java")||sentence.contains("Java");

        System.out.println("hasCsharp = " + hasCsharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("r3 = " + r3);

        System.out.println("==================");

        String input1 = "I love jAvA";
        String input2 =  "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java"));

        System.out.println(input1.toUpperCase().contains("java"));



        System.out.println("==================");


       String s3 =  "wooden spoon";

       boolean x = s3.startsWith("woo");
       boolean y = s3.endsWith("spoon");
       boolean z = s3.toLowerCase().startsWith("wooden");


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


          int sum = 0;

        for (int i = 1; i < 101; i++) {

            sum+= i;
        }

        System.out.println("sum = " + sum);




    }
}
