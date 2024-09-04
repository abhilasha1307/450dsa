import java.util.PriorityQueue;

public class p3_kth_smallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};

        System.out.println(kthSmallest(arr, 3));
    }

    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a, b) -> b - a);  
        for(int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }  
        return maxHeap.peek();
    }

    //solve usin quick select
}
