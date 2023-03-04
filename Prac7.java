// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

//import java.lang.Math;
import java.util.Random;
public class Prac7 {
    public static void main(String[] args){
        char[] arr = new char[3];
        int[] arr2 = new int[4];
        /*char min = 'A';
        char max = 'Z';
        int Max = max;
        int Min = min;
        int range = Max - Min + 1;
        for(int i=0;i<3;i++){
                arr[i] = (char)((Math.random() * range) + min);
        }
        for(int i=0;i<4;i++){
                arr2[i] = (int)(Math.random() * 10)+ 0; // min = 0 max = 9 range = 9-0+1
        }*/

        Random arbitrary = new Random();
        for(int i=0;i<3;i++){
            arr[i] = (char)(arbitrary.nextInt(26)+'A');
        }
        for(int i=0;i<4;i++){
            arr2[i] = arbitrary.nextInt(10);
        }

        String str = String.copyValueOf(arr);
        System.out.print(str);
        for (int k:arr2){
            System.out.print(k);
        }
        System.out.println(" ");
    }
}
