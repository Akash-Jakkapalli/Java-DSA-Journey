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
    public static void flouds_Tringle(int n, int counter){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        } 
    }
    



    public static void main(String[] args) {
        // printpiramid(4);
        // Print_Invert_half_Piramid_Num(5);
        flouds_Tringle(5, 1);
 
    }
}
