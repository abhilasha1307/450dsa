public class p2_min_max_array {

    static class Pair<K,V>{
        private final K min;
        private final V max;

        public Pair(K min, V max) {
            this.min = min;
            this.max = max;
        }

        public K getMin() {
            return min;
        }

        public V getMax() {
            return max;
        }   
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 56, 10000, 167};

        Pair<Long, Long> result = getMinMax(arr);
        
        System.out.println("Min : " + result.getMin());
        System.out.println("Max : " + result.getMax());
    }

    public static Pair<Long, Long> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : arr){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }

        Pair<Long, Long> result = new Pair(min,max);
        return result;
    }
}
