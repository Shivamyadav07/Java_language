import java.util.*;
// arr=[1,3,4,5,6,7,8]

class Subarray {
    public static void printSubarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void maxSubarraySum(int arr[]){
        int n=arr.length;
        int maxSum=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("the maximum subarray sum is : "+maxSum);
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array");
        n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        printSubarray(arr);
        maxSubarraySum(arr);
    }    
}
