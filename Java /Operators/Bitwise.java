//operands can only be integral values ie byte short int and long
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
        // if both bits different then only 1

        // Bitwise NOT
        int notResultM = ~m; // notResultM is now -6 (binary: 11111111111111111111111111111010)
        int notResultN = ~n; // notResultN is now -4 (binary: 11111111111111111111111111111100)

        // Bitwise left shift <<
        int a = 5; // 101
        int c = a << 1; // all bits shift to left by 1 ie 1010
        System.out.println(c);

        // Bitwise right shift >>
        int b = 5; // 101
        int d = a >> 1; // all bits shift to right by 1 ie 10
        System.out.println(d);

        // unsigned right shift >>>
        // if the number is positive then the left most bit is left positive ie 0

        // in case of right shift of negative numbers the left most bits are given the value 1
        // and for positive numbers the given the value 0
        int f = -5;
        System.out.println("f:" + Integer.toBinaryString(f));
        System.out.println("f:" + Integer.toBinaryString(f >> 2)); //right shift of f by 2
        int g = f >>> 2;
        System.out.println("g:" +Integer.toBinaryString(g)); //unsigned right shift of f by 2
    }
}
