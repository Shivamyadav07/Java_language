// in the given array we have the length of the poles and we are suppose to find the maximun 
// rain water the area can contain 


public class TrappinRainWater{
    public static int maxElement(int x,int y){
        if(x==y){
            return x;
        }else{
            return x>y?x:y;
        }
    }

    public static int minElement(int x,int y){
        if(x==y){
            return x;
        }else{
            return x>y?y:x;
        }
    }

    public static void main(String []args){
        //Scanner scan=new Scanner(System.in);
        //int n=scan.nextInt();
        int n=7;
        int arr[]={4,2,0,6,3,2,5};
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        //creating the leftMax array to select maximum left boundry for the water level
        for(int i=0;i<n;i++){
            if(i==0){
                leftMax[i]=maxElement(leftMax[i],arr[i]);
            }else{
                leftMax[i]=maxElement(leftMax[i-1],arr[i]);
            }
        }

        //creating the rightMost array to select maximym right boundry for the water level
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rightMax[i]=maxElement(rightMax[i],arr[i]);
            }else{
                rightMax[i]=maxElement(rightMax[i+1],arr[i]);
            }
        }

        //Solution code of the problem
        int totalWaterTraped=0;
        for(int i=0;i<n;i++){
            int waterLevel=minElement(leftMax[i], rightMax[i]);
            int waterTraped=waterLevel-arr[i];
            if(waterTraped>0){
                totalWaterTraped+=waterTraped;
            }
        }

        System.out.println(totalWaterTraped);
    }
}
