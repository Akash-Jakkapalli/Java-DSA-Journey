package Arrays_Basic;

import java.util.*;

public class B_LargestInArray {
    // Find the Largest in a given Array

    public static int getLargest(int num[]){

        int Largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<num.length; i++){
            if (Largest < num[i]) {
                Largest = num[i];  // if new  Number is greter than Largest then update as Largest
            }
        }
        return Largest;
    }
    
    public static void main(String[] args) {
        
        int num[] = {1, 2, 6, 4, 5};
        System.out.println("Largest Number is :- " + getLargest(num));

    }
}
