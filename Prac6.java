// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

import java.util.Scanner;
public class Prac6 {
    public static void main(String[] args){
        char ary[] = {'a','e','i','o','u','A','E','I','O','U'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char input = sc.next().charAt(0);
        sc.close();
        int tmp = 0;
        for(char i:ary){
            if(input == i){
                tmp = 1;
                break;
            }
        }
        if(tmp==1){
            System.out.println(input + " is a Vowel.");
        }
        else if(((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) && (tmp == 0) ){
            System.out.println(input + " is a consonant.");
        }
        else{
            System.out.println("Wrong Input....");
        }
    }
}
