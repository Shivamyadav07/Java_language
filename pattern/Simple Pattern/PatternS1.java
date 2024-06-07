public class PatternS1{


    public static void main(String[]args){

        //the problem statement is somthing line this
        /*
              *
             **
            ***
           ****  
        */
        System.out.println("The pattern 1");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //for printing the pattern in this formate 
        /* 
             1
             12
             123
             1234
             12345
         */
         System.out.println("The pattern 2");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }

         //to print the pattern in the following ways
         /*
             12345
             1234
             123
             12
             1
          */
          System.out.println("The pattern 3");
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
          }

          //the patter problem looks like this
          /*
              1  
              2  3
              4  5  6
              7  8  9  10
              11 12 13 14  15

           */
          System.out.println("The pattern 4");
          int m=1;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m++ +" ");
            }
            System.out.println();
          }

          System.out.println("The pattern 5");
          //the pattern looks like this
          /*
              1
              0 1
              1 0 1
              0 1 0 1
              1 0 1 0 1
           */
          for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
          }

          System.out.println("The pattern 6");
          // Problem statement is as follows
          /* *****
             *****
             *****
             *****
          */

          for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("The pattern 7");
        //the problem statemet is as follows
        /*
             *
             **
             ***
             ****
         */

         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("The pattern 8");
        /*  This is the patter of the problem statement 
        *****
        *   *
        *   *
        *****
        */

        int size=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=size;j++){
                if(i==1||i==n){
                    System.out.print("*");
                }else{
                    if(j==1||j==size){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        System.out.println("The pattern 9");
        /*  This is the patter of the problem statement 
            *
           ***
          *****
         *******
        *********
        ***   ***
        ***   ***
        ***   ***
        ***   ***
        ***   ***
        */

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
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
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            for(int j=4;j<=(n*2)-4;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
