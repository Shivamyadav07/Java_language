//the pattern will look somthing like this 
/*  
           *      *
           **    **
           ***  ***
           ********
           ********
           ***  ***
           **    **
           *      *
 */

class PatternA1{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //the next pattern will look like 
        /*
                        *****
                       *****
                      *****
                     *****
                    ***** 
         */


         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
         }


                 //the next pattern will look like 
        /*
                        *****
                       *   *
                      *   *
                     *   *
                    ***** 
         */


         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1||j==n ||i==1 ||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
         }

         //The next pattern looks somthing like this
         /*
                    1
                   2 2
                  3 3 3
                 4 4 4 4
                5 5 5 5 5
          */


          for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(j%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print(i);
                }
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.println();
          }

          //The next pattern looks somthing like this

          /*
                    1
                   212
                  32123
                 4321234
                543212345    
           */


           for(int i=1;i<=n;i++){
                for(int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
           }
    }
}