package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 195;
        if (score >= 0 && score <= 100) {// pre condition  if it is valid

      if (score>=90) {
          System.out.println("Excelent");
      }else if (score>=80){
          System.out.println("Great");
      }else if(score>=70){
          System.out.println("Good");
      }else if (score>=60){
          System.out.println("Passed");
      }else {
          System.out.println("Failed");
      }

        }else {
            System.out.println("Invalid");
        }
    }

}



         /* 90~100 = excelent
                    80~89 =great
                    70~79 =good
                    60~69 =passed
                   0~59   = failed
                              */