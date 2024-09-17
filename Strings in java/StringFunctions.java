import java.util.*;
class StringFunctions{
    public static void main(String[] args) {
        StringBuilder name =new StringBuilder("shivam");
        name.delete(3,6);
        System.out.println(name);
        name.append("vam");
        System.out.println(name);
        name.deleteCharAt(5);
        System.out.println(name);
    }
}