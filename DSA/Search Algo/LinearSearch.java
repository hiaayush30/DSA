public class LinearSearch {
    static int searchNum(int[] arr, int target) {
        // returns index at which num found else returns -1
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2,4,5,9,11,15,16};
        System.out.println(searchNum(arr, 2));
    }
}    
