import java.util.Arrays;

public class Bubble {
    // O(n^2) time complexity with best case is O(n) when the array is already sorted
    // O(1) space complexity aka in place sorting algo
    // its a stable sorting algo because it does not change the order of the elements
    // with the same value 
   public static void main(String[] args) {
    int[] arr={9,5,2,8,4,99,0,6,23,1};
    // with the first loop (whole j loop ran once) the largest element came at the end
    // with the second loop the second largest element came at the second last position and so on
    for (int i = 0; i < arr.length-1; i++) { 
        // i loop just runs the below steps n-1 times as the last element is automatically sorted
        boolean swap=false; // to check if the array is already sorted
        for (int j = 0; j < arr.length-1-i; j++) { 
            //-1 because we are comparing j with j+1
            //-i because the last i elements are already sorted
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;
            }
            if(!swap){
                break; 
            }
        }
    }
    System.out.println(Arrays.toString(arr));
   }
}
