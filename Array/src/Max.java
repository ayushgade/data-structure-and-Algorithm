public class Max {
    public static void main(String[] args) {
        int[] arr = {3,2,42,54,5};
        System.out.println(inRange(arr,0,1));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int inRange(int[] arr, int start,int end){
        int maxval = arr[start];
        for (int i = start; i <= end ; i++) {
            if (maxval < arr[i]){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
