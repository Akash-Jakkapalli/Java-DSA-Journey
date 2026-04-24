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
        int n = 4;
        for(int line = 1; line <= 4; line++){

            for(int star = 1; star <= 4-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
