public class BinarySearch {
    static int searchNum(int[] arr, int target) {
        // returns index at which target found else returns -1
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                start = middle + 1; //doing +1 as we already checked middle
            } else {
                end = middle - 1;  
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2,4,5,9,11,15,16};
        System.out.println(searchNum(arr, 17));
    }
}
