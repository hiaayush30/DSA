import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15};
        for (int i = 0; i <= arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        //or
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
