
// upgrade over binary search
// used for "uniformly" distributed data
// "guesses" where a value must be based on calculated probe results
// if probe is incorrect,, search area is narrowed and a new probe is calculated 

// average case O(log(logn))
// worst case O(n) [values increase exponentially]
public class Interpolation {

    private static int interpolationSearch(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;

        while (value >= arr[low] && value <= arr[high] && low <= high) {
            int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            System.out.println("probe:" + probe);
            if (arr[probe] == value) {
                return probe;
            } else if (arr[probe] > value) {
                high = probe - 1;
            } else {
                low = probe + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 16, 32, 64, 128, 256 };
        int index = interpolationSearch(arr, 16);
        System.out.println(index);
    }
}
