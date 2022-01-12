package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner accountscan = new Scanner(System.in);
        System.out.println("Enter an account Number");
        String accountNumber= accountscan.next();

        int account2 = accountNumber.length();
        int account5 = accountNumber.length();

        char first2 = accountNumber.charAt(0);
        char first5 =accountNumber.charAt(0);



        if (first2=='2' && account2==7){

            System.out.println("Valid Account");
        }
        else if (first5=='5'&& account5==10){

            System.out.println("Valid Account");
        }
        else {
            System.out.println("Invalid Account");
        }

        System.out.println(accountNumber);
    }
}
       /*6. Create a class called AccountNumber.
        Ask the user enter an account number (String). Check if these account number is valid.
        > If the account number begins with a “2” the account number should be 7 characters long
        > If the account number begins with a “5” the account number should be 10 characters long
        —> If the account number does not begin with a 2 or a 5 OR the account number lengths
        do not meet the expected results print “Invalid account number”
 */
