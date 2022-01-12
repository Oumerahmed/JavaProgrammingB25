package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {
          //  oddOrEven();  // the method demand additional info to complete its task


        oddOrEven(10);
        System.out.println("----------------------------");

        ageOfPerson(1986);
        }

    // create a function that can check if a  number is odd of even number
    public  static  void  oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+"is even number");
        }else {
            System.out.println(number+"is odd number");
        }


    }


    // create a function that can display the age of the person



    public  static void  ageOfPerson(int birthYear){

        int age =2021-birthYear;

        System.out.println("your age is "+age);


    }

   // create a function that can print all number between x and y


    public static void printNumbers(int x,int y){

    }
}
