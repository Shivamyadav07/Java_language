import java.util.*;
public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str=scan.nextLine();
        String word[]=str.split(" ");
        System.out.println(word[0].length());
        for(String x:word){
            for(int i=0;i<x.length();i++){
                System.out.println(x.charAt(i));
            }
            System.out.println(x);
        }
    }
}
