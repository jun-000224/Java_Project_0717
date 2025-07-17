package day2;
import java.util.Scanner;

public class Star_Square {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("n값을 입력하세요");
        int n = scanner.nextInt();  
        
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
        for (i = n; i >=1; i--) {
           for (int j = n; j >= 1; j++) {
           	System.out.println(" ");           	
           }
           for (int j = n; j >= 1; j++) {
           	System.out.println("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

