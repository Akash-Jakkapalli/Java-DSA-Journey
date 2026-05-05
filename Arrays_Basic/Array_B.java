package Arrays_Basic;

public class Array_B {

    // Find the Index of element in a given Array
    
    public static int LinerSerch(int numbers[] , int key){

        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 6;

        int index = LinerSerch(numbers, key);
        if (index == -1) {
            System.out.println("NOT Found");
        }else{
            System.out.println("Key is at index of :- " + index);
        }

        



    }
}
