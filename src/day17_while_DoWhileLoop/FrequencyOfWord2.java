package day17_while_DoWhileLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = " Cat Cat DogObjects.Dog DogObjects.Dog cAt CAT caT ";
        int howoftencatappears = 0;

        for (int i = 0 ; i <=str.length()-3 ; i++){
            String eachSub = str.substring(i,i+3);

            if (eachSub.equalsIgnoreCase("Cat")){
                howoftencatappears++;
            }
        }

        System.out.println(howoftencatappears);
    }
}
