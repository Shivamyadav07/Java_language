// you are given an array prices where prices i is the price of a given stock on the ith
// day. You want to maximize your profit by choosing a single day to buy one stock and choosing
// different day in the future to sell that stock
// Return the maximum profit you can achieve from this transaction. if you cannot achieve any
// Profit, return 0

public class BuyAndSellStock{
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int n=6;
        /*
            int maximumProfit=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int profit=arr[j]-arr[i];
                    if(profit>0 && profit>maximumProfit){
                        maximumProfit=profit;
                    }
                }
            }
            System.out.println(maximumProfit);
        */

        int maxElement=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int currentPrice=arr[i];
            if(currentPrice<minPrice){
                minPrice=currentPrice;
            }
            int profit=currentPrice-minPrice;
            if(maxElement<profit){
                maxElement=profit;
            }
        }
        System.out.println(maxElement);
    }
}
