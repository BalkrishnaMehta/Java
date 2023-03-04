// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

package a;
import a.Hello;
public class Hey extends Hello {
	public void printMessage()
	{
		System.out.println("Hey");
        //super.printMessage();
	}
	public static void main(String[] args)
	{
		Hello obj = new Hey();
		obj.printMessage();
	}
}