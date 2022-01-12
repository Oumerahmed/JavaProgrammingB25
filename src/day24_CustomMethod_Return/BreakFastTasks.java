package day24_CustomMethod_Return;

public class BreakFastTasks {

    public static void main(String[] args) {

        initials("oumer", "Adem");  // o . A
        System.out.println("----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }
        System.out.println("------------------");


        nameOfDay(6);


        System.out.println("---------------");


        nameOfMonth(12);


        }


    // 1. Create a method that can display the initials of the person.
    // initials(String firstName, String lastName)


    public static void initials(String firstName, String lastName) {

        String initials = firstName.charAt(0) + " . " + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);


    }

   // 2. Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

   // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String name = " ";

        if (number>=1&& number<=12){

            name= (number==1)?"jan" :(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may"
                    :(number==6)?"jun":(number==7)?"jul":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
                    :(number==11)?"nov":"dec";
        }else {
            name= "invalid";
        }
        System.out.println(" Month name = " + name);
    }

   // 4. Create a method that can print the name of the day based on the given number to the method

        public static void nameOfDay(int number){
            if (number<1||number>1){
            System.out.println("invalid");
            return;
}

            if (number==1){
                System.out.println("mon");
            }else if(number== 2){
                System.out.println("tus");
            }else if(number== 3){
                System.out.println("wed");
            }else if(number== 4){
                System.out.println("thu");
            }else if(number== 5){
                System.out.println("fri");
            }else if(number== 6){
                System.out.println("sat");
            }else {
                System.out.println("sun");
            }


    }

    // 5. Create a method that can print how many days a month has
    public static void dayInMonth(int number){


        String result = "";
        if (number >= 1 && number <= 12) {  // if it is valid  this is pre-condition
            if (number == 1) {
                result = "Jan";
            } else if (number == 2) {
                result = "Feb";
            } else if (number == 3) {
                result = "Mar";
            } else if (number == 4) {
                result = "Apr";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "Jun";
            } else if (number == 7) {
                result = "Jul";
            } else if (number == 8) {
                result = "Aug";
            } else if (number == 9) {
                result = "Sep";
            } else if (number == 10) {
                result = "Oct";
            } else if (number == 11) {
                result = "Nov";
            } else {
                result = "Dec";
            }
        } else {
            result = "invalid";
        }







    }
}


  /*1. Create a method that can display the initials of the person

        2. Create a method that can display the domain of the email

        3. Create a method that can display the name of the month based on the given number to the method

        4. Create a method that can print the name of the day based on the given number to the method

        5. Create a method that can print how many days a month has
        6. age group

 */