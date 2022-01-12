package day04_Variable;

    public class Circle {
    public static void main(String[] args) {


// pi ,radius,diameter,area,perimeter

double radius = 5.5;
double pi = 3.14;
double diameter = radius * 2;  //find the diameter by multiplying the radius to 2     10*2
double area = radius * radius* pi; // find the area of circle  10*10*3.14
double perimeter= diameter* pi; // find the perimeter of the circle 10* 2*3.14


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
/* 3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI

 */