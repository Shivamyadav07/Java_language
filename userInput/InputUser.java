package userInput;
import java.util.Scanner;

public class InputUser {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=scan.nextLine();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your phoneNo");
        int phone=scan.nextInt();
        System.out.println("Enter your address");
        String address=scan.nextLine();
        System.out.println("my name is"+name+"and my age is"+age+"address"+address+"Phone: "+phone);
        scan.close();
    }
}
