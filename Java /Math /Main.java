
//package
public class Main {
    public static void main(String[] args) {
        int a =11;
        int b=12;
        Math.max(a, b);
        int c=-3;
        Math.abs(c);
        double y =1.12;
        Math.ceil(y); //2.0
        Math.round(y); //1
        Math.sqrt(y);
        Math.pow(12, 2); //144
        Math.log(12);  //log of base e
        Math.log10(12);
        System.out.println(Math.PI);
        Math.random(); //0.0 to 1.0 excluding 1
        System.out.println((int)(Math.random()*11));

        System.out.println(Math.nextAfter(1, 2));
        //next number after 1 towards 2
    }
}
