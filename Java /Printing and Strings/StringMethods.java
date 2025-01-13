public class StringMethods {
    public static void main(String[] args) {
        String name = "John Cena";
        System.out.println(name.length());
        char c = name.charAt(1);
        System.out.println(c);
        System.out.println(name.equalsIgnoreCase("John"));
        String str1 = "remote";
        String str2 = "car";
        System.out.println('r' + 0);
        System.out.println('c' + 0);
        int i = str2.compareTo(str1);
        // compares ascii value of the letters and returns the diff
        System.out.println(i);

        String a = "hello there";
        System.out.println(a.substring(3, 5));
        //3 inclusive while 5 is exclusive

        System.out.println(a.replace("there", "here"));
        System.out.println(a.startsWith("he"));
        System.out.println(a.endsWith("he"));
        String b= " ";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());
        System.out.println(a.lastIndexOf('e'));

        int z = 10;
        String num=String.valueOf(z);
        System.out.println(num);

        String formatted=String.format("Hello %s","Aayush");
        System.out.println(formatted);
        System.out.println(name.substring(2,7));
    }
}
