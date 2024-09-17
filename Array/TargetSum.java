import java.util.Scanner;

public class TargetSum {

    public static int countTargetSum(int arr[],int n,int target){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size,target;
        System.out.println("Enter the size of the array");
        size=scan.nextInt();
        int array[]=new int[size];
        System.out.println("Enter "+ size +" elementes of the array");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Enter the target sum which you want to find");
        target=scan.nextInt();
        System.out.println("The number of sum present in the array equal to target is : "+ countTargetSum(array, size, target));
    }   
}
