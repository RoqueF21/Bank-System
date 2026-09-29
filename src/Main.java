import Bank.CheckingAccount;
import Bank.SavingsAccount;
import Bank.Account;
import Manage.Manage;

public class Main {
    
    static Manage manage = new Manage();

    public static void main(String[] args) throws Exception {
        CheckingAccount user1 = new CheckingAccount("Gus", 20);
        SavingsAccount user2 = new SavingsAccount("Roq", 21);

        //manage.addAccount(user1);
        user1.depositAmount(200);
        user2.depositAmount(200);
        user1.withdraw(1);

        //manage.addAccount(user1);
        
        System.out.println(user1);
        System.out.println(user2);
    }
    
}
