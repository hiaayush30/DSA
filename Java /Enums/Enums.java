
import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(Day.MONDAY.name().toLowerCase());
        System.out.println(Day.MONDAY.display());

        for(Day d:Day.values()){
            System.out.println(d);
        }

        Scanner sc = new Scanner(System.in);
        String response = sc.next().toUpperCase();

        try {
            Day day = Day.valueOf(response);
            // enhanced switch
           String result= switch (day) {
                case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY -> "It's a weekday!";
                case SATURDAY,
                        SUNDAY -> "it's the weekend!";
            };
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a valid day!");
        }
    }
}
