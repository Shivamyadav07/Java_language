package pattern;
import java.util.Scanner;

//the problem statemet is as follows
/*
     *
     **
     ***
     ****
 */

public class Pattern4 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of line you want to print");
        int n=scan.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}
