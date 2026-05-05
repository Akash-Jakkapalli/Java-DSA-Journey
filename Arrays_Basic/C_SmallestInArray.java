package Arrays_Basic;

public class C_SmallestInArray {

    public static int getSmallest(int arr[]){

        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int arr[] = {100, 67, 44, 23, 77, 8};

        System.out.println("smallest num is :- " + getSmallest(arr));
    }
}
