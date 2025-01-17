public class Main2<T> implements  GenericInterface<T> {
    private T item;

    @Override
    public void add(T item){
        this.item=item;
    }

    @Override
    public T get(){
        return this.item;
    }

}
