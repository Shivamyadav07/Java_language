package pattern;
public class Pattern6 {
    public static void main(String[]args){
        int size=10;
        for(int i=1;i<=size;i++){
            for(int j=size-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            for(int j=4;j<=(size*2)-4;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
