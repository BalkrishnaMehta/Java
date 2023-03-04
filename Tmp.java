import java.util.Scanner;
public class Tmp {
    public static void main(String[] args)
    {
        int a=5 , b=10 , c , d, e , f, g;
        c=a+b;
        System.out.println("Addition is: " + c);
        Scanner var_scan = new Scanner(System.in);
        d = var_scan.nextInt();
        e = var_scan.nextInt();
        System.out.println("Addition is: " +(d+e));
        var_scan.close();
        f = Integer.parseInt(args[0]);
        g = Integer.parseInt(args[1]);
        int h = f+g;
        System.out.println("Addition of command line inputs: " + h);

        //for(int i=0;i<args.length;i++) {
        //    System.out.println(args[i]);
        //}
    }
}
