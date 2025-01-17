 https://engineeringdigest.medium.com/generics-b158a743d18f
 ---
 Generics were introduced in the later versions of Java (~1.5 onwards)
### The Object class
- the class Object is a built in class in Java which is the parent class of all classes in Java
  and this class is available in Java.lang package
  ### why this class has been provided to us?
  so that we can achieve generalization in Java
- as you know that if you have reference of a parent class then you can assign the object of any of its child classes
```Java 
Object obj = new String("Hi");
```
- `Type reference:` The object is of type String, but it is referenced by a variable of type Object.(vice versa is not possible)
- `Available methods:` Only methods from the Object class (e.g., toString(), equals(), hashCode()) are directly accessible, unless you explicitly cast it to String.
- This is nothing but generalization as we can generalize object of any type as an Object

```Java
String str = obj;
```
This is not allowed because =>
- The Object type is more general (superclass) and does not guarantee that the object it references is a String.
- Java requires you to explicitly cast the Object to a String to ensure type safety.


1. **Explicit Casting is Required**:  
   When assigning an `Object` reference to a `String` variable, you must explicitly cast it:
   ```java
   String str = (String) obj;
   ```

2. **Risk of `ClassCastException`**:  
   If the `Object` does not actually reference a `String`, the cast will throw a runtime exception:
   ```java
   Object obj = new Integer(5);  // Object points to an Integer
   String str = (String) obj;   // Throws ClassCastException at runtime
   ```

3. **Safer Approach with `instanceof`**:  
   To avoid runtime exceptions, use `instanceof` to check the type before casting:
   ```java
   if (obj instanceof String) {
       String str = (String) obj;
       System.out.println(str.length());
   } else {
       System.out.println("Not a String");
   }
   ```

So for acheiving generalization before 1.5 Java used Object class for generalization but there ar e problems like-
- i have to do typecasting
- there is no type safety 
- compiler is not cheching for type casting error causing which can runtime exception

---
