// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner; 
public class Prac13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Divisior: ");
        int dividend = input.nextInt();
        System.out.print("Enter Dividend: ");
        int divisior = input.nextInt();
        input.close();
        try{
            if(divisior == 0){
                throw new userdefinedException("Divisible by 0 is not possible.");
            }
            else{
                System.out.println(dividend + "/" + divisior + " = " + dividend/divisior);
            }
        }
        catch(userdefinedException exception){
            System.out.println(exception.getMessage());
        }
    }
}
class userdefinedException extends Exception  
{  
    public userdefinedException(String exception){
        super(exception);
    }
} 