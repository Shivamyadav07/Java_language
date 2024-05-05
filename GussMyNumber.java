import java.util.*;

public class GussMyNumber {
    public static void main(String[] args){
        int myNumber=(int)(Math.random()*100);
        Scanner sc= new Scanner(System.in);
        int userNumber;
        System.out.println("To guess the number Enter a number between 1 to 100" + "\n" + "To stop enter -1 ");
        userNumber=sc.nextInt();
        while(userNumber!=-1){
            if(userNumber>myNumber){
                System.out.println("Sorry, You gussed a heigher number");
            }else if(userNumber<myNumber){
                System.out.println("Sorry, You gussed a lower number");
            }else if(userNumber==myNumber){
                System.out.println("Congratulation, You gussed it right");
                break;
            }
            System.out.println("To guess the number Enter a number between 1 to 100" + "\n" + "To stop enter -1");
            userNumber=sc.nextInt();
        }
        if(userNumber==-1){
            System.out.println("You were so close"+"The number is : " + myNumber);
        }else{
            System.out.println("The number is : " + myNumber);
        }
    }
}
