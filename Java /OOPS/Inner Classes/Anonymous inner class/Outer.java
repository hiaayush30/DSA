//used when we want to implement an interface without creating a 
// seperate class or we want to extend a class without creating
// a seperate sub class
public class Outer {
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Anonymous inner class implementing an interface
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.sayHello();
    }
}
