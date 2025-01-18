In Java, **shadowing** occurs when a variable declared in a local scope (e.g., a method or a block) has the same name as a variable in an enclosing scope (e.g., a class). When this happens, the local variable **shadows** the variable from the outer scope, making the outer variable inaccessible within the local scope.

### Key Points:
1. Shadowing applies to instance variables, static variables, and method parameters.
2. The inner variable with the same name "hides" the outer variable, but the outer variable is still present and can be accessed using `this` or the class name (in case of static variables).

---

### Example 1: Shadowing Instance Variables
```java
class ShadowingExample {
    int x = 10; // Instance variable

    void display() {
        int x = 20; // Local variable shadows the instance variable
        System.out.println("Local x: " + x); // Prints 20
        System.out.println("Instance x: " + this.x); // Access instance variable, prints 10
    }

    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        obj.display();
    }
}
```
**Output:**
```
Local x: 20
Instance x: 10
```

---

### Example 2: Shadowing Static Variables
```java
class ShadowingStaticExample {
    static int y = 30; // Static variable

    void modifyY() {
        int y = 40; // Local variable shadows the static variable
        System.out.println("Local y: " + y); // Prints 40
        System.out.println("Static y: " + ShadowingStaticExample.y); // Access static variable, prints 30
    }

    public static void main(String[] args) {
        ShadowingStaticExample obj = new ShadowingStaticExample();
        obj.modifyY();
    }
}
```
**Output:**
```
Local y: 40
Static y: 30
```

---

### Example 3: Shadowing Method Parameters
```java
class ShadowingParamExample {
    int z = 50; // Instance variable

    void setZ(int z) { // Parameter shadows the instance variable
        System.out.println("Parameter z: " + z); // Prints the parameter value
        this.z = z; // Assign parameter value to the instance variable
    }

    void display() {
        System.out.println("Instance z: " + z);
    }

    public static void main(String[] args) {
        ShadowingParamExample obj = new ShadowingParamExample();
        obj.setZ(100); // Pass 100 as parameter
        obj.display(); // Prints 100
    }
}
```
**Output:**
```
Parameter z: 100
Instance z: 100
```

---

### Summary:
- **Shadowing** can make code less readable because the same name refers to different variables in different contexts.
- Use `this` (for instance variables) or the class name (for static variables) to distinguish between the outer and inner variables when they are shadowed.