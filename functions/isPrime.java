package functions;

public class isPrime {
    public static boolean primeNum(int n) {
        
        for(int i=2; i<=n-1; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        System.out.println(primeNum(3));

    }
}
