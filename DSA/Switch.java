
public class Switch {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("yo");
                break;
            case 2:
                System.out.println("bro");
                break;
            default:
                throw new AssertionError();
        }

        // or
        switch (a) {
            case 1 -> System.out.println("yo");
            case 2 -> System.out.println("bro");
            default -> throw new AssertionError();
        }
    }
}
