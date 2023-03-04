// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac5
{
public static void main(String[] args) 
 {
 int num1,num2,num3,tmp;
 Scanner input = new Scanner(System.in);
 System.out.print("Enter Num1: ");
 num1 = input.nextInt();
 System.out.print("Enter Num2: ");
 num2 = input.nextInt();
 if(num1<num2)
 {
  tmp=num1;
  num1=num2;
  num2=tmp;
 }
 System.out.print("Enter Num3: ");
 num3 = input.nextInt();
 input.close();
 if(num3>num2)
 {
  if(num3>num1)
  {
   tmp=num3;
   num3=num2;
   num2=num1;
   num1=tmp;
  }
  else
  {
   tmp=num3;
   num3=num2;
   num2=tmp;
  }
 }
 System.out.println("Decreasing Order :"+num1+" "+num2+" "+num3);
 }
}
