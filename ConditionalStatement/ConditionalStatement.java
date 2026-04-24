package ConditionalStatement;


public class ConditionalStatement {
    public static void main(String[] args) {
        
        int age = 10;
        if (age >= 18) {
            System.out.println("you can vote");
        }else{
            System.out.println("Not allowed");
        }

// -------------------------------------------------------------------------------------------

        // Which number is greter
        // int A = 2;
        // int B = 3;

        // if (A>B) {
        //     System.out.println("A is greter");
        // }else{
        //     System.out.println("B is greter");
        // }
// -------------------------------------------------------------------------------------------

        // Odd or even
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        
        // if (num % 2 == 0) {
        //     System.out.println("Even Number");
        // }else{
        //     System.out.println("The given number is Odd");
        // }
// -------------------------------------------------------------------------------------------
        // Income tax Calculater
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if (income<500000) {
        //     tax = 0;
        // }else if (income>=500000 && income<=1000000) {
        //     tax = (int) (income * 0.2);
        // }else{
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("your tax is " + tax);
// -------------------------------------------------------------------------------------------
        // Largest number

        // int A = 2, B = 5, C = 10;

        // if ((A>=B) && (A>=C)) {
        //     System.out.println("A");
        // }else if(B>=C) {
        //     System.out.println("B");
        // }else{
        //     System.out.println("C");
        // }
// -----------------------------------Ternary  Operator--------------------------------------------------------
        // Pass or Fail

        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();

        // String reportCard = (marks >= 30)? "PASS" : "FAIL";
        // System.out.println(reportCard);
        
// -----------------------------------Swith Statement --------------------------------------------------------

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char Operator = sc.next().charAt(0);

        // switch (Operator) {
        //     case '+':
        //         System.out.println(a+b);
        //         break;
        //     case '-':
        //         System.out.println(a-b);
        //         break;
        //     case '*':
        //         System.out.println(a*b);
        //         break;
        //     case '/':
        //         System.out.println(a/b);
        //         break;
        //     case '%':
        //         System.out.println(a%b);
        //         break;
        //     default:
        //         System.out.println("Wrong input");
        //         break;
        // }

// -------------------------------------------------------------------------------------------

    }
}
