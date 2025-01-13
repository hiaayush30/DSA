public class Strings {
    // String pool is a storage space in the Java heap
    // memory where string literals are stored.
    public static void main(String[] args) {
        String a = "Ram";
        String b = "Ram"; 
        System.out.println(a==b);  //checks the reference
        //true as both point to the same object in string pool
        String c = new String("Ram");
        //new object (reference) created in heap (seperate from pool)
        System.out.println(a==c);
        String x = "Ram";
        System.out.println(a==x);
        System.out.println(a.equals(c)); //compares the string value
    }
}
