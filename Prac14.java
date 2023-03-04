// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Divisior: ");
        String dividend = input.next();
        System.out.print("Enter Dividend: ");
        String divisor = input.next();
        input.close();
        try{
            int num1 = Integer.parseInt(dividend);
            int num2 = Integer.parseInt(divisor);
            try{
                System.out.println( num1 + "/" + num2 + " = " + (num1/num2)); 
                if(num2 != 0){
                    String s=null;  
                    System.out.println(s.length());
                }    
            }
            catch(ArithmeticException e){
                System.out.println( e + ": Divisible by zero not possible.");
            }
        }
        catch(NumberFormatException e){
            System.out.println( e + ": Integer is required.");
        }
        catch(NullPointerException e){
            System.out.println( e + ": Trying to access null.");
        }
    }
}