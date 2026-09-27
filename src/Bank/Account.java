package Bank;

import java.util.Random;

public class Account {

    Random random = new Random();

    private String name;
    private int age;
    private double balanceChecking;
    private double balanceSavings;
    private int id;
    private boolean isChecking;
    private boolean isSavings;

    public Account(String name, int age, boolean ischecking, boolean issavings){
        this.name = name;
        this.age = age;
        
        if(ischecking){
            this.balanceChecking = 0;
        }

        if(issavings){
            this.balanceSavings = 0;
        }

        this.id = randomId();
        this.isChecking = ischecking;
        this.isSavings = issavings;
    }

    //Precida aprimorar para sacar em ambos tipo de contas
    public void withdraw(double value){
        if(value > 0 && value <= this.balanceChecking){
            this.balanceChecking -= value;

            System.out.println("Valor do saque: " + value + " Saldo atual: " + this.balanceChecking);
        }
        else{
            System.out.println("Você não tem saldo suficiente no momento");
        }
    }

    //Precida aprimorar para depositar em ambos tipo de contas
    public void depositAmount(double value){
        if(value > 0){
            this.balanceChecking += value;
        }
    }

    //Ainda precisa aprimorar isso aqui
    private int randomId(){
        int randomIdNum = random.nextInt(500);
        return randomIdNum;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name + "\n" +
               "Idade: " + this.age + "\n" +
               "Saldo Corrente: " + this.balanceChecking + "\n" +
               "Saldo Poupança: " + this.balanceSavings + "\n" +
               "ID da conta: " + this.id + "\n" +
               "Corrente: " + isChecking + "\n" +
               "Poupança: " + isSavings;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getBalanceChecking(){
        return this.balanceChecking;
    }

    public double getBalanceSavings(){
        return this.balanceSavings;
    }

    public int getId(){
        return this.id;
    }

    public boolean getIsChecking(){
        return this.isChecking;
    }

    public boolean getIsSavings(){
        return this.isSavings;
    }
}
