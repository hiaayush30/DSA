package Operators;

public class Relational {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Equal to
        boolean isEqual = (x == y); // isEqual is now false

        // Not equal to
        boolean isNotEqual = (x != y); // isNotEqual is now true

        // Greater than
        boolean isGreater = (x > y); // isGreater is now true

        // Less than
        boolean isLess = (x < y); // isLess is now false

        // Greater than or equal to
        boolean isGreaterOrEqual = (x >= y); // isGreaterOrEqual is now true

        // Less than or equal to
        boolean isLessOrEqual = (x <= y); // isLessOrEqual is now false
    }
}
