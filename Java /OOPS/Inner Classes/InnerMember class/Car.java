//Member inner class

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = true;
    }

    class Engine {
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started");
            } else {
                System.out.println(model + " engine is already running");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped");
            } else {
                System.out.println(model + " engine is already stopped");
            }
        }
    }
}