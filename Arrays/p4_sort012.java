public class p4_sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr);
    }   

    public static void sort012(int[] arr){
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int x : arr){
            if(x == 0){
                zeros++;
            }else if(x == 1){
                ones++;
            }else{
                twos++;
            }
        }

        int i = 0;
        while(zeros-- > 0){
            arr[i++] = 0;
        }
        while(ones-- > 0){
            arr[i++] = 1;
        }
        while(twos-- > 0){
            arr[i++] = 2;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
