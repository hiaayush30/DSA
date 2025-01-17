
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // list.add(1.1);
        list.add("Hello");
        String str = list.get(0);

        Box<Integer> b = new Box<>();
        b.setValue(2);
        System.out.println(b.getValue());
    }
}
