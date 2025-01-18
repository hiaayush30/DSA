In Java, assigning a variable of a **parent class type** to an **object of a child class** is an example of **polymorphism**. This assignment affects how the object behaves in terms of accessible methods, fields, and overridden functionality.

---

### How It Works:
1. **Declaration Type and Actual Type**:
   - The **declaration type** determines which methods and fields are accessible at compile time.
   - The **actual type** (the type of the object) determines which overridden methods are invoked at runtime.

   Example:
   ```java
   Parent obj = new Child();
   ```

   - `Parent` is the declaration type.
   - `Child` is the actual type.

2. **Compile-Time Behavior**:
   - Only members (methods and fields) declared in the **Parent** class are accessible directly, as the compiler checks the declaration type.
   - You cannot access members specific to the **Child** class without explicit casting.

3. **Runtime Behavior**:
   - At runtime, if a method is **overridden** in the child class, the child's implementation is invoked (dynamic method dispatch).
   - If the method is not overridden, the parent class's version of the method is used.

---

### Example: Methods
```java
class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent type, Child object
        obj.show(); // Runtime polymorphism, invokes Child's show method
    }
}
```
**Output:**
```
Child's show method
```

---

### Example: Fields
In contrast to methods, **fields are not overridden**; they are **hidden**. The field accessed depends on the declaration type.

```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent type, Child object
        System.out.println(obj.name); // Accesses Parent's field
    }
}
```
**Output:**
```
Parent
```

If you want to access the `Child`'s field, explicit casting is required:
```java
System.out.println(((Child) obj).name); // Accesses Child's field
```
**Output:**
```
Child
```

---

### Example: Child-Specific Methods (Casting)
Child-specific methods are **not accessible** through the parent type unless the object is explicitly cast back to the child type.

```java
class Parent {
    void show() {
        System.out.println("Parent's show");
    }
}

class Child extends Parent {
    void display() { // Specific to Child
        System.out.println("Child's display");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent type, Child object
        obj.show(); // Works, as show() is declared in Parent

        // obj.display(); // Compile-time error: display() not in Parent

        // Explicit casting
        if (obj instanceof Child) {
            ((Child) obj).display(); // Access Child's method
        }
    }
}
```
**Output:**
```
Parent's show
Child's display
```

---

### Key Intricacies:
1. **Dynamic Method Dispatch**:
   - Overridden methods are resolved at runtime based on the actual object's type.
   - This is the essence of **runtime polymorphism** in Java.

2. **Field Hiding**:
   - Fields are resolved at compile time based on the reference type, not the object's type.
   - This is often a source of confusion and bugs.

3. **Child-Specific Behavior**:
   - To access methods or fields exclusive to the child class, explicit casting is necessary.
   - Use `instanceof` to avoid `ClassCastException`.

4. **Final Methods**:
   - Final methods in the parent class cannot be overridden in the child class, ensuring the parent's behavior is preserved.

5. **Abstract Classes and Interfaces**:
   - Polymorphism is especially useful when working with abstract classes and interfaces, where the parent type is used to define general behavior, and the child implements specific behavior.

---

### Practical Use Case:
Polymorphism is often used in scenarios like this:
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Parent type, Dog object
        animal.sound(); // "Woof"

        animal = new Cat(); // Parent type, Cat object
        animal.sound(); // "Meow"
    }
}
```
This flexibility enables dynamic behavior and simplifies code management in frameworks like Spring and Hibernate.