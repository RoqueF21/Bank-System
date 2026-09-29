package Bank;

public class CheckingAccount extends Account{
    
    public CheckingAccount(String name, int age) {
        super(name, age);
    }

    @Override 
    public String toString(){
        return super.toString() + "Saldo Corrente: " + super.getBalance() + "\n";
    }
}
