package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] name = {"Omar Ahmed", "Eliminur Abimit", "Ali kilic", "Hulia Keles", "Simen Kaya",
                "Begech Begejor", "Ruvenda Durna",
                "Jonatthan Holly ", "Alishnur Rodersr ", "Mnas Kaleven", "Gulsen Shorter"};

        for (String each : name) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}

