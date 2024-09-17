import java.util.*;

class LinesrSearch{
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int n,key,res;
        System.out.println("Enter the size of the array you want to create");
        n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the value which you want to search in the array");
        key=scan.nextInt();
        res=linearSearch(arr,key);
        if(res==-1){
            System.out.println("The element is not present in the list");
        }else{
            System.out.println("The element is present at the "+ res +" location in the array");
        }
    }
}