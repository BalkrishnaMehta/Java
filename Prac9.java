// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

//import java.util.Scanner;
public class Prac9 {
    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        /*Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.print("Enter value at "+(i+1)+(j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();*/
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                mat[i][j]=(int)((Math.random() * 2) + 0);
            }
        }
        for(int i=0;i<=5;i++){
            System.out.print("| ");
            for(int j=0;j<=5;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("|");
        }
        for(int i=0;i<=5;i++){
            int count1=0;
            for(int j=0;j<=5;j++){
                if(mat[i][j]==1){
                    count1+=1;
                }
            }
            if(count1%2!=0){
                System.out.println("Row "+(i+1)+" have an odd number's of 1's.");
            }
        }
        System.out.println("\n");
        for(int j=0;j<=5;j++){
            int count2=0;
            for(int i=0;i<=5;i++){
                if(mat[i][j]==1){
                    count2+=1;
                }
            }
            if(count2%2!=0){
                System.out.println("Column "+(j+1)+" have an odd number's of 1's.");
            }
        }
        int count3=0;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i==j){
                    if(mat[i][j]==1){
                        count3+=1;
                    }
                }
            }
        }
        if(count3%2!=0){
            System.out.println("\nDiagonal 1 have an odd number's of 1's.");
        }
        int count4=0;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i+j==5){
                    if(mat[i][j]==1){
                        count4+=1;
                    }
                }
            }
        }
        if(count4%2!=0){
            System.out.println("\nDiagonal 2 have an odd number's of 1's.");
        }
    }
}
