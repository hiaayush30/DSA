import java.util.Arrays;

// O(logn)
//sorted array required
//great for large data sets

public class Binary {
     private static int binarySearch(int[] arr,int val){
        int startIndex  = 0;
        int endIndex = arr.length-1;

        while(startIndex<=endIndex){
          int middleIndex = (startIndex+endIndex)/2;
          if(arr[middleIndex]==val){
            return middleIndex;
          }
          else if(arr[middleIndex]>val){
            endIndex = middleIndex-1;
          }
          else {
            startIndex = middleIndex+1;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {20,30,40,50,55,65,75,80,90,200,3560,6436,653975} ;
        int targetIndex =binarySearch(array, 55);

        System.out.println(Arrays.binarySearch(array, 390));

        if(targetIndex==-1){
            System.out.println("Value not found");
        }else {
            System.out.println("Element found at index "+targetIndex);
        }
    }
}
