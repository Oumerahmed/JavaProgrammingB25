package day2_12_11_2021;

public class EncryptPassword {

    /**
     *  5.
     *                 Given a string password. Encrypt with "x" a given password
     *                 and print.
     *                 (do with for loop)
     *                 password: cydeo
     *                 encrypt with char :x
     *                 output:cxyxdxexox
     */
    public static void main(String[] args) {

      String password = "cydeo";
      char  encryptwithchar = 'x';

        String encryptPassword =" ";

        for (int i = 0; i < password.length(); i++) {
            encryptPassword+= ""+password.charAt(i)+encryptwithchar;

        }
        System.out.println("encryptPassword = " + encryptPassword);
    }
}

