public class Index {
    public static void main(String[] args) {
        // Java is not a pure OOP language as it has primitive datatypes
        // wrapper classes allow us to use primitive datatypes as reference
        // data types 

        int a = 1; // stored in stak,primitive variable
        // autoboxing
        Integer b = 2; // stored in heap,object
        // behind the scenes
        Integer b1 = Integer.valueOf(2); // boxing

        int x = b.intValue(); // unboxing
        int x1 = b; // autounboxing

        Boolean c = true;
        Byte g = 12;
        Short d = 23;
        Double yo = 22.33;
        Long f = 1234l;
        Character n = 'Y';


    }
}
