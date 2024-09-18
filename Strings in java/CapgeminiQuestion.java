import java.util.*;
public class CapgeminiQuestion {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        for(int i=0;i<str1.length();i++){
            if(str2.contains(Character.toString(str1.charAt(i)))){
                System.out.println(true);
            }

        }
    }
}
