package pattern2;

public class PatternTwo {

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
    public static void main(String[] args) {
        printpiramid(4);
    }
}
