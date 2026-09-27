import Bank.CheckingAccount;
import Bank.Account.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        CheckingAccount user1 = new CheckingAccount("Roq", 22, true, false);

        user1.depositAmount(200);

        System.out.println(user1);
    }
    
}
