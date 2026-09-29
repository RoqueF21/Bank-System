package Bank;

public class SavingsAccount extends Account{

    private double interestAmount;

    private double interest = 0.5;
    
    public SavingsAccount(String name, int age){
        super(name, age);
    }

    private double increaseInterestRate(){
        interestAmount = super.getBalance();
        return (interestAmount * interest) / 100;
    }

    public void setIncreaseInterestRate(){
        super.setSavingsIncrease(increaseInterestRate());
    }

    @Override 
    public String toString(){
        return super.toString() + "Saldo Poupança: " + (increaseInterestRate() + getBalance()) + "\n";
    }
}