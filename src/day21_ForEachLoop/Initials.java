package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] name = {"Omar Ahmed", "Eliminur Abimit", "Ali kilic", "Hulia Keles", "Simen Kaya",
                "Begech Begejor", "Ruvenda Durna",
                "Jonatthan Holly ", "Alishnur Rodersr ", "Mnas Kaleven", "Gulsen Shorter"};

           for (String each : name){
               String initial = each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);

               System.out.println(initial);
           }




    }

}
