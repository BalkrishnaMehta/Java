// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

public class Prac12{
    public static void main(String args[]) {
        Prac12_Son a = new Prac12_Son();
        System.out.print("My name is: Jack ");
        a.mname();
        a.surname();
	System.out.println("");
     }
}
interface Prac12_Grandfather {
   void surname();
}
 interface Prac12_Father {
   void mname();
}
 class Prac12_Son implements Prac12_Grandfather, Prac12_Father {
   public void surname() {
      System.out.print("Singh.");
   }
   public void mname() {
      System.out.print("Anmol ");
   }
}
