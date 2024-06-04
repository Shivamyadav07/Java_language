package pattern;
import java.util.Scanner;

// Problem statement is as follows
/* *****
   *****
   *****
   ***** */

public class Pattern1 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of lines you want in the pattern");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
