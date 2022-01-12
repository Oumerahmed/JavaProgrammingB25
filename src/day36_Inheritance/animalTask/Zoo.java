package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();   no included


        System.out.println(dog);



        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","Brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();


        System.out.println(cat);



        Tiger tiger = new Tiger();
        tiger.setInfo("sher khan","bengal",'M',4,"large","Orange");


        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        System.out.println(tiger);

    }
}
