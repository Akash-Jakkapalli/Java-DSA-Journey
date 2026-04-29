package pattern2;

public class PatternTwo {

// --------------------------------------------

    /*
           *
          **
         ***
        ****
    */
    public static void printpiramid(int n){

        for(int i=1; i<=n; i++){
            // print gaps
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// --------------------------------------------

    /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
    */
    public static void Print_Invert_half_Piramid_Num(int n){

        //outer loop
        for(int i=1; i<=n; i++){
            //outer loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

// --------------------------------------------

    /*
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
    */
    public static void flouds_Tringle(int n){
        // outer loop that tracks the number of Lines
        int counter = 1;
        for(int i=1; i<=n; i++){
            // Inner loop it will print the counter
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        } 
    }

    /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
    */

    public static void ZeroOne_Tringle(int n){

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop if position of 1 ==> add position row and col if == even then print 1 else 0
            for(int j=1; j<=i; j++){
                if ((i+j) % 2 == 0) {
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    /*

    *             * 
    * *         * * 
    * * *     * * * 
    * * * * * * * * 
    * * * * * * * * 
    * * *     * * * 
    * *         * * 
    *             * 
    
    */

    public static void butterfly(int n){
        // 1st half
        for (int i=1; i<=n; i++){

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces --> 2 * (n - 1)
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces --> 2 * (n - 1)
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
                * * * * * * 
              * * * * * * 
            * * * * * * 
          * * * * * * 
        * * * * * * 
        
    */

    public static void Solid_Rhombus(int n){
        for(int i=1; i<=n; i++){
            
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // printpiramid(4);
        // Print_Invert_half_Piramid_Num(5);
        // flouds_Tringle(5);
        // ZeroOne_Tringle(5);
        // butterfly(5);
        Solid_Rhombus(5);


 
    }
}
