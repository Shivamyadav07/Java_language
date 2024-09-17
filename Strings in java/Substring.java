import java.util.*;
public class Substring {
    public static void main(String[] args){
        String name=new String();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        name=scan.next();
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<=name.length();j++){
                System.out.println(name.substring(i,j));
            }
        }
    }
}
