package pattern1;

public class pattern {
    public static void main(String[] args) {
        /*
            *
            * *
            * * *
            * * * *
        */

        // for(int line = 1; line <= 4; line++){

        //     for(int star = 1; star <= line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            * * * *
            * * *
            * * 
            * 
        */
        // int n = 4;
        // for(int line = 1; line <= 4; line++){

        //     for(int star = 1; star <= 4-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            1
            12
            123
            1234
        */
        // int n = 4;
        // for(int line = 1; line <= n; line++){
        //     for(int num = 1; num <= line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

        /*
            A
            BC
            DEF
            GHIJ
        */
        // int n = 4;
        // char ch = 'A';

        // // outer loop
        // for(int line = 1; line <= n; line++){
        //     //inner loop
        //     for(int chars = 1; chars <= line; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        /*
            * * * *
            *     *
            *     *
            * * * *
        */
        // int totRow = 4;
        // int totCol = 4;

        // outer loop for row
        // for(int i=1; i<=totRow; i++){
        //     // inner loop for col
        //     for(int j=1; j<=totCol; j++){
        //         //what we have to print here?
        //         if(i == 1 || i == totRow || j==1 || j==totCol){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        
    }
}
