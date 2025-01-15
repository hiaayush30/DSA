
public class Main {
public static void main(String[] args) {
    Inter c = new Implementor();
    Inter.info();
    System.out.println(Inter.MAX_AGE);
    c.concrete();
    Implementor i = new Implementor();
    i.concrete();
}    
}
