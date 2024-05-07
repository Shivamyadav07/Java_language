public class FrogWellProblem {
    public static void main(){
        int wellHeight=30;
        int climbPerHour=3;
        int slipPerHour=2;
        int totalHour=0,currentHeight=0;
        while(currentHeight<wellHeight){
            currentHeight+=(climbPerHour-slipPerHour);
            totalHour++;
        }
        System.out.println("The time taken by the frog to climb the well is : "+ totalHour);
    }
}
