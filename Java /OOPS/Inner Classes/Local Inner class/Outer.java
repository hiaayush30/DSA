public class Outer {
    void display() {
        class LocalInner {
            void print() {
                System.out.println("Hello from Local Inner Class");
            }
        }
        LocalInner inner = new LocalInner();
        inner.print();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
