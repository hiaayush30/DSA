
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // public static void main(String[] args) throws FileNotFoundException {
    // FileReader fr = new FileReader("a.txt");
    // System.out.println("Hello"); //will not be printed
    // }
    // or

    // public static void method1() throws FileNotFoundException {
    // FileReader fr = new FileReader("a.txt");
    // }

    // public static void method2() {
    // try {
    // method1();
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }

    // or
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("a.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("in finally block");
            try {
                if (fr != null)
                    fr.close();
            } catch (Exception e) {
                System.out.println("Error in closing fr");
            }
            // but to better handle this use TryWith
        }

        try (BufferedReader r = new BufferedReader(new FileReader("a.txt"))) {
            // any object of a class which implements interface AutoClosable
            // will be automatically closed (which includes r here)
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}