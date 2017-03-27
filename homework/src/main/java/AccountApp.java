import model.Account;
import model.AccountHolder;
import model.CurrentAccount;
import model.SavingsAccount;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class AccountApp {
    public static void main(String[] args) {

        CurrentAccount curacc = new CurrentAccount("demo",12345, true);

        SavingsAccount savacc = new SavingsAccount("2nd demo", 1093, 0.01);

        SavingsAccount savacc2 = new SavingsAccount(
                "This is the saving account of James Bond", 1232, 0.1);

        AccountHolder jamesbond = new AccountHolder("James Bond");

        jamesbond.addCurrentAccount(curacc);

        jamesbond.addSavingsAccount(savacc);

        jamesbond.addSavingsAccount(savacc2);

        for (Account e : jamesbond.getAccountList()){
            e.print();
            System.out.println(e.getIBAN()+ "\n");
        }

    }
}
