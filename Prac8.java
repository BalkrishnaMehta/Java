// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac8 {

    public static void reverse(int arr[]){
        for(int j=0;j<arr.length/2;j++){
            int tmp = arr[9-j];
            arr[9-j] = arr[j];
            arr[j] = tmp; 
        }
        System.out.print("Numbers in Reverse order: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number"+i+": ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        reverse(arr);
    }
}
