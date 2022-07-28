package Section3;

public class Circle {
    final public static double Math_PI = 3.14;
    public static void calculatearea(double radius){
        System.out.println("The area is "+ Math_PI * ( radius * radius ));
    }
    public static void calculatecircumference(double radius){
        System.out.println("The circumference is " + Math_PI * 2*radius);
    }
}
