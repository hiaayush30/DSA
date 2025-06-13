//Linear Search O(n)
// slow for large data sets
// good for small data sets
// do not need to be sorted
// useful for data structures which dont have random access (Linked lists)

public class Linear {

    private static int linearSearch(int[] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {20,30,40,10,4,55} ;
        int targetIndex =linearSearch(array, 4);

        if(targetIndex==-1){
            System.out.println("Value not found");
        }else {
            System.out.println("Element found at index "+targetIndex);
        }
    }
}
