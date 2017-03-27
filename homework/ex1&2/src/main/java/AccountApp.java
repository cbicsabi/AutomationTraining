import model.Account;
import model.AccountHolder;
import model.CurrentAccount;
import model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class AccountApp {
    public static void main(String[] args) {

        CurrentAccount curacc = new CurrentAccount("This is Mr. Bond's account",12345, true);

        SavingsAccount savacc = new SavingsAccount("Savings account for Mary", 1000, 0.1);

        SavingsAccount savacc2 = new SavingsAccount(
                "Savings account for John", 1000, 0.1);

        AccountHolder jamesbond = new AccountHolder("James Bond");

        //List<Account> lista = new ArrayList<Account>();

        //lista.add(curacc);
        //lista.add(savacc);
        //lista.add(savacc2);

        jamesbond.addAccount(curacc);

        jamesbond.addAccount(savacc);

        jamesbond.addAccount(savacc2);

        for (Account e : jamesbond.getAccountList()){
            e.print();
        }

    }
}
