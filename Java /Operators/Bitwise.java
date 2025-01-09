package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int m = 5; // binary representation: 0101
        int n = 3; // binary representation: 0011

        // Bitwise AND
        int andResult = m & n; // andResult is now 1 (binary: 0001)

        // Bitwise OR
        int orResult = m | n; // orResult is now 7 (binary: 0111)

        // Bitwise XOR
        int xorResult = m ^ n; // xorResult is now 6 (binary: 0110)

        // Bitwise NOT
        int notResultM = ~m; // notResultM is now -6 (binary: 11111111111111111111111111111010)
        int notResultN = ~n; // notResultN is now -4 (binary: 11111111111111111111111111111100)
    }
}
