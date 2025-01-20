import java.util.ArrayList;

public class Main2 {
    //ArrayList for list with dynamic size
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.set(1, 60);
        System.out.println(list);
        System.out.println(list.subList(0, 1));

        ArrayList<ArrayList<Integer>> l=new ArrayList<>(5);
        // l is just array of 5 nulls for now
        // 1st initialize some arraylists
        for (int i = 0; i < 3; i++) {
            l.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                l.get(i).add(32);
            }
        }
        System.out.println(l);
    }

}
