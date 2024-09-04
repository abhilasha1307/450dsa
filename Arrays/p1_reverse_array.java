// import java.util.ArrayList;

public class p1_reverse_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);   

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int[] arr){
        int start = 0; 
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //reverse subarray
    // public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
    //     // code here
        
    //     int leftIdx = l -1;
    //     int rightIdx = r-1;
        
    //     ArrayList<Integer> result = arr;
        
    //     while(leftIdx < rightIdx){
    //         int temp = result.get(leftIdx);
    //         result.set(leftIdx, result.get(rightIdx));
    //         result.set(rightIdx, temp);
    //         leftIdx++;
    //         rightIdx--;
    //     }
        
    //     return result;
    // }
}