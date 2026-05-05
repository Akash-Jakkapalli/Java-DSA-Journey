package Arrays_Basic;

public class D_BinarySearch {

    public static int BinarySearchInArray(int num[], int key){
        int start=0, end=num.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            // comparisons
            if (num[mid] == key) {
                return mid; // found
            }
            if (num[mid] < key) {
                start = mid+1; // right
            }else{
                start = mid-1;  // left
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {

        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 111;

        System.out.println(BinarySearchInArray(num, key));
        
    }
}
