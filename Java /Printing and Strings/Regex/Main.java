
public class Main {
    public static void main(String[] args) {
        String str="ab";
        System.out.println(str.matches(".[adc]"));
        System.out.println(str.matches(".[^adc]"));
        String str1 = "a5gmail";
        System.out.println(str1.matches("[0-5a-zA-Z][0-5]gmail"));
        String str3=" ";
        System.out.println(str3.matches("\\s"));

        String str4="aayus12ew21eh@gmail.com";
        System.out.println(str4.matches("[a-z0-9]*@gmail.*"));
        System.out.println(str4.matches("\\w*@gmail.*"));
    }
    
}
