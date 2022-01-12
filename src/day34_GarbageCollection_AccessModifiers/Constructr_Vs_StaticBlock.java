package day34_GarbageCollection_AccessModifiers;

public class Constructr_Vs_StaticBlock {

    static {

        System.out.println("Static Block");


    }

    public Constructr_Vs_StaticBlock() {

        System.out.println("Constructor");


    }


    public static void main(String[] args) {

        new Constructr_Vs_StaticBlock(); // 1
        new Constructr_Vs_StaticBlock();  // 2
        new Constructr_Vs_StaticBlock();  // 3
        new Constructr_Vs_StaticBlock();  // 4
        new Constructr_Vs_StaticBlock();  // 5


    }
}
