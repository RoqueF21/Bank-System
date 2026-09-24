package Bank;

import java.util.Random;

public class Account {

    Random random = new Random();

    private String name;
    private int age;
    private double balance;
    private int id;

    public Account(String name, int age){
        this.name = name;
        this.age = age;
        this.balance = 0;
        this.id = randomId();
    }

    public void withdraw(double value){
        if(value > 0 && value <= this.balance){
            this.balance -= value;

            System.out.println("Valor do saque: " + value + " Saldo atual: " + this.balance);
        }
        else{
            System.out.println("Você não tem saldo suficiente no momento");
        }
    }

    public void depositAmount(double value){
        if(value > 0){
            this.balance += value;
        }
    }

    //Ainda precisa aprimorar isso aqui
    private int randomId(){
        int randomIdNum = random.nextInt(500);
        return randomIdNum;
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
