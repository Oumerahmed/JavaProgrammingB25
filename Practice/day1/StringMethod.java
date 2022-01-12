package day1;

public class StringMethod {
    public static void main(String[] args) {

        String word = "Cydeo";

        char lastchar = word.charAt(0);

        System.out.println("lastchar = " + lastchar);

        System.out.println("-------------");


        String omo = "bach 25 is the best and java programming is cool but sometimes boring";

        omo = omo.toUpperCase();


        int totalchar = omo.length();


        System.out.println("omo = " + omo);

        System.out.println("totalchar = " + totalchar);

        char lastcharesd = omo.charAt(omo.length() - 1);

        System.out.println("lastchars = " + lastcharesd);


        String str = "wooden spoon";

        System.out.println(str);


        str = str.toUpperCase();

        System.out.println("str = " + str);


        String str4 = "           bach25                                   ";

        str4 = str4.trim(); //just cut blank space

        System.out.println("str4 = " + str4);


        String str5 = "Cydeo school";

        int n1 = str5.indexOf("h");

        System.out.println("n1 = " + n1);


        String str7 = "java is cool I love to learn java";

        str7 = str7.replace("java", "c++");

        System.out.println("str7 = " + str7);


        String email = "oumeradem@yahoo.com";

        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String s = "dog dog dog dog";

        s = s.replace("dog","cat");

        System.out.println("s = " + s);



        String result = "omar omar omar";

       result = result.replaceFirst("omar","java");

        System.out.println("result = " + result);

        System.out.println("------------------------");

        String word2 = "Cydeo school";

        String brand = word2.substring(0,4+1);

        System.out.println("brand = " + brand);


        String str1 = word2.substring(6);

        System.out.println(str1);


        System.out.println("------------------------");

        String word3 = "Python C# Ruby";

        String s1 = word3.substring(0,  word3.indexOf(" ") ); //"Python"

        String s2 = word3.substring( word3.indexOf(" ")+1 ,   word3.lastIndexOf(" ") ); //"C#"

        String s3 = word3.substring( word3.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("------------------------");


        String str9 = " Cydeo";

        str9 = str9.repeat(5);

        System.out.println("str9 = " + str9);

        System.out.println("------------------------");

       String emails = " Cydeo.school@gmail.com" ;

       int beginigindex =emails.indexOf("@")+1;
       int endingindex = emails.lastIndexOf(".");
         String domain = emails.substring(beginigindex,endingindex);

        System.out.println("domain = " + domain);










    }
}
