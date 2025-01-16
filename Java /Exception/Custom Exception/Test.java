public class Test {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(10);
        try{
            b.withdraw(11);
        }catch(InsufficientFundsException e){
            System.out.println(e.getAmount());
            System.out.println(e);
        }
    }
    
}
