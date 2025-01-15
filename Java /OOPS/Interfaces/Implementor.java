public class Implementor implements Inter {

    @Override
    // Cannot reduce the visibility of the inherited method from Inter
     public void sleep(){
        System.out.println("sleeping");
    }

    public void eat(){
        System.out.println("eating");
    }

    public void yo(){
        System.out.println("yo");
    }
}
