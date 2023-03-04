// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac2 {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner var_scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        num1 = var_scan.nextInt();
        System.out.print("Enter number2: ");
        num2 = var_scan.nextInt();
        System.out.print("Enter operator: ");
        char operator = var_scan.next().charAt(0);
        var_scan.close();
        switch(operator){
            case '+':
                System.out.println("Addition is: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction is: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is: "+(num1*num2));
                break;
                case '/':
                    System.out.println("Division is: "+(num1/num2));
                    break;
        }
     }
}
