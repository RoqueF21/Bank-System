import Bank.Account;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Account usuario1 = new Account("Roq", 22);

        usuario1.depositAmount(200);
        usuario1.withdraw(-2);

        System.out.println();
    }

}
