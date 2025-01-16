public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tata Safar");
        c.Engine engine = c.new Engine();
        engine.start();
        //this instance of engine is associated with that instance of Car(ie c )
    }

}
