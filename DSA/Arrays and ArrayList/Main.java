
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] roll = new int[5];
        // or
        int[] roll1 = { 1, 2, 3, 4, 5 };

        int[] roll3; // declaration //at compile time
        roll3 = new int[5]; // initialization (Actual memory allocation in heap ) at runtime
        // ie dynamic memory allocation

        // 2d array
        Scanner sc = new Scanner(System.in);
        int[][] arr2 = new int[2][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int[] a : arr2) {
            System.out.println(Arrays.toString(a));
        }
    }
}