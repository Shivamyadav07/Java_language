import java.util.*;
class MyString{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String fullName=new String();
        fullName=scan.nextLine();
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}