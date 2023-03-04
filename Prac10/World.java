// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

package b;
import a.Hello;
public class World extends Hello {
	public void printMessage()
	{
		System.out.println("World");
		//super.printMessage();
	}

	public static void main(String[] args)
	{
		Hello obj = new World();
		obj.printMessage();
	}
}

