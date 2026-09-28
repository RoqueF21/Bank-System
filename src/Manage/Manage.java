package Manage;

import java.util.ArrayList;

import Bank.Account;

public class Manage {

    ArrayList<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account account){
        accountList.add(account);
        System.out.println("Conta adicionada com sucesso!\n" + accountList);
    }
}
