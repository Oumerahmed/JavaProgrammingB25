package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "python"); //python is fun,I love learning python
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Python Python c# c# c++ c++ python Python Python Python";
        String sentence2 = sentence.replace("python", " "); // java java c# c# c++ c++

        System.out.println("sentence2 = " + sentence2);
        sentence2 = sentence2.replace("  ", "  ");
        System.out.println("sentence2 = " + sentence2);

        String s = "dog dog dog dog dog";
        s = s.replace("dog", "cat");

        System.out.println("s = " + s);

        String s2 = "c# is fun ,c# is cool";
        s2 = s2.replace("c#", "Java");
        //s2 = s2.replace("c# is c" ,"java is c"
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e"); // Jeve

        System.out.println("s3 = " + s3);

        System.out.println("------------------");

        String result = "java java java";
        // result= result.replace("java","python");
        result = result.replaceFirst("java", "python");

        System.out.println(result);

        String result2 = "c# is fun, c# is cool";
        result2 = result2.replaceFirst("c#", "java");

        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo"); // "Javo"

        System.out.println("result3 = " + result3);

    }
}
