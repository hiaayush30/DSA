
import java.util.ArrayList;

public class Problem {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //here the Arraylist stores objects of Object class
        //so it can store object of any type
        list.add("Hello");
        list.add(123);
        list.add(3.14);
        //String s =list.get(0); //can't store Object type in String type
        String str = (String) list.get(0);
        //Type safety issue as well as manual type casting
        //no compile time checking
    }
}
