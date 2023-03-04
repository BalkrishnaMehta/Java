// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac11 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nCalculating area of Triangle");
        System.out.print("Enter base length: ");
        float base1 = input.nextFloat();
        System.out.print("Enter height length: ");
        float height1 = input.nextFloat();
        Triangle obj1 = new Triangle();
        obj1.area(new float[] {base1, height1});
        System.out.println("\nCalculating area of Rectangle");
        System.out.print("Enter base length: ");
        float base2 = input.nextFloat();
        System.out.print("Enter height length: ");
        float height2 = input.nextFloat();
        Rectangle obj2 = new Rectangle();
        obj2.area(new float[] {base2, height2});
        Circle obj3 = new Circle();
        System.out.println("\nCalculating area of Circle");
        System.out.print("Enter radius length: ");
        float  radius = input.nextFloat();
        obj3.area(new float[] {radius});
        input.close();
    }
}
abstract class Shape{
    abstract void area(float[] args);
}
class Triangle extends Shape{
    void area(float[] args){
        System.out.println("Area of Triangle is: "+(0.5*(args[0])*(args[1])));
    }
}
class Rectangle extends Shape{
    void area(float[] args){
        System.out.println("Area of Rectangle is: "+((args[0])*(args[1])));
    }
}
class Circle extends Shape{
    void area(float[] args){
        System.out.println("Area of Circle is: "+(((22)*(args[0])*(args[0])))/7);
    }
}


