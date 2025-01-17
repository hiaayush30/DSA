//only one object
public class CoffeeMachine {
    private float coffeeQuantity;
    private float waterQuantity;
    private float sugarQuantity;
    private float milkQuantity;

    static private CoffeeMachine theMachine = null;

    private CoffeeMachine() {
        this.coffeeQuantity = 1;
        this.waterQuantity = 1;
        this.sugarQuantity = 1;
        this.milkQuantity = 1;
    }

    static public CoffeeMachine getInstance(){
        if(theMachine==null) return new CoffeeMachine();
        else return theMachine;
    }

    public void addMilk(int milk){
        this.milkQuantity+=milk;
    }

    public void addSugar(int sugar){
        this.sugarQuantity+=sugar;
    }

}
