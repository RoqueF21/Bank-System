package Bank;

import Manage.Manage;
import java.util.Random;

public class Account {
    
    Manage manage = new Manage();

    Random random = new Random();

    private String name;
    private int age;
    private double balance;
    private int id;

    public Account(String name, int age){
        this.name = name;
        this.age = age;
        this.id = randomId();
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;

            System.out.println("Valor do saque: " + amount + " Saldo atual: " + this.balance);
        }
        else{
            System.out.println("Você não tem saldo suficiente no momento");
        }
    }

    public void depositAmount(double amount){

        if(amount > 0){
            this.balance = amount;
        }
    }

    //Ainda precisa aprimorar isso aqui
    private int randomId(){
        int randomIdNum = random.nextInt(500);
        return randomIdNum;
    }

    protected void setSavingsIncrease(double value){
        this.balance += value;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name + "\n" +
               "Idade: " + this.age + "\n" +
               "ID da conta: " + this.id + "\n";
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getId(){
        return this.id;
    }
}
