package functions;

import java.util.Scanner;

public class B_basic {

    // basic structure code of function
    public static void print(){
        System.out.println("Hello World");
    }

    public static int calculateSum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        // print();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        calculateSum(a, b);
    
    }
}
