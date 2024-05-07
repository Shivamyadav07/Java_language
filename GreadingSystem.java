import java.util.Scanner;

public class GreadingSystem {
    public static void main(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your marks to find the gread you got");
        int marks; 
        marks=scan.nextInt();
        if(marks>=70 && marks<=100){
            System.out.println("Excellent");
        }else if(marks>=50 && marks<75){
            System.out.println("Good");
        }else if(marks>=40 && marks<50){
            System.out.println("Average");
        }else if(marks<40 && marks>=0){
            System.out.println("Poor");
        }else{
            System.out.println("Please Enter you correct marks");
        }
        scan.close();
    }
}
