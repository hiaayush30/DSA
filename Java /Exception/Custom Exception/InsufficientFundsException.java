public class InsufficientFundsException extends Exception {
    private  double amount;
    public InsufficientFundsException(double amount){
        super("paise nhi hn tere paas");
        this.amount=amount;
    }
    public double getAmount(){
        return this.amount;
    }
}
