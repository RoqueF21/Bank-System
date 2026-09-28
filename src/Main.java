import Bank.CheckingAccount;
import Bank.Account;
import Manage.Manage;

public class Main {
    
    static Manage manage = new Manage();

    public static void main(String[] args) throws Exception {
        CheckingAccount user1 = new CheckingAccount("Roq", 22, true, false);
        CheckingAccount user2 = new CheckingAccount("Gus", 20, false, true);

        user1.depositAmount(200);

        manage.addAccount(user1);
        manage.addAccount(user2);
        //System.out.println(user1);
    }
    
}
