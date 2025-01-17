

public class Main implements  GenericInterface<String> {
    private String item;

    @Override
    public void add(String item){
        this.item=item;
    }

    @Override
    String get(){
        return this.item;
    }
}
