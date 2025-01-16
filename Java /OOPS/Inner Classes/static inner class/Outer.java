public class Outer {
    private static String message = "Hello from Outer";

    static class StaticNested {
        void displayMessage() {
            System.out.println(message); // Accessing static field of the outer class
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested nested = new Outer.StaticNested(); // No need for an instance of Outer
        nested.displayMessage();
    }
}
