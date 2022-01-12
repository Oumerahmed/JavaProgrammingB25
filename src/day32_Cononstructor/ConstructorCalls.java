package day32_Cononstructor;

public class ConstructorCalls {


    public ConstructorCalls() {

        System.out.println("Default Constructor ");
    }

    public ConstructorCalls(int a) {

        this();  // Default Constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str) {

        this(10);  // Default Constructor , Constructor with int argument
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls Obj1 = new ConstructorCalls();

        System.out.println("========================");

        ConstructorCalls Obj2 = new ConstructorCalls(10);

        System.out.println("========================");

        ConstructorCalls Obj3 = new ConstructorCalls("Java");
    }

}
