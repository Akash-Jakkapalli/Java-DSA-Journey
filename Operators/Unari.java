package Operators;

public class Unari{
    public static void main (String[] args) {

        // Post Inc
        int a1 = 10;
        int b1 = a1++;
        System.out.println("a value is - " + a1);
        System.out.println("b value is - " +b1);

        //Pre Inc
        int a2 = 10;
        int b2 = ++a2;
        System.out.println("a value is - " + a2);
        System.out.println("b value is - " + b2);
    }
}