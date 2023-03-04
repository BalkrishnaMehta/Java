// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Unit in Meters: ");
        int unit = scan.nextInt();
        scan.close();
        // 1 meter = 3.281 feet
        System.out.println(unit + " meters = "+ unit*3.281 + " feets");
    }
}
