import java.util.*;
public class ConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=scan.next();
        System.out.println(str);
        StringBuilder res=new StringBuilder("");
        char curr=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==curr){
                count++;
            }else{
                res.append(curr);
                res.append(count);
                curr=str.charAt(i);
                count=1;
            }
        }
        res.append(curr);
        res.append(count);
        System.out.println(res);
    }
}
