package day10_NestedIf;

public class chooseLanguage {
    public static void main(String[] args) {
        int select=16;

        if (select==1){
            System.out.println("Hello, thank for your call");
        }else if (select==2){
            System.out.println("Hola, gracias para llamar");
        }else if (select==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if (select==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }else if (select==5){
            System.out.println("Merci ,pour votre appel");
        } else{
            System.out.println("Invalid ");
        }
        /*for 1: Hello, thank for your call
		  for 2: Holla, gracias para llamar
		  for 3: Merhaba, aradiginiz icin tesekkurler
		  for 4: Privet, spasibo za vash zvonok
		   for 5: Merci ,pour votre appel*/
    }
}




