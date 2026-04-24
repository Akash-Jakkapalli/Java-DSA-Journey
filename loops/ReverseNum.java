package loops;

public class ReverseNum {
    public static void main(String[] args) {

        int n = 987654321;
        while (n > 0) {
            int LastDigit = n % 10; // extracting last digit
            System.out.print(LastDigit);
            n = n / 10; // removing last digit
        }
        System.out.println();
    }
}
