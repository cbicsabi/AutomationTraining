import model.CurrentAccount;
import model.SavingsAccount;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class AccountApp {
    public static void main(String[] args) {

        CurrentAccount curacc = new CurrentAccount("demo", 123345, true);

        curacc.print();

        SavingsAccount savacc = new SavingsAccount("2nd demo", 1093, 0.01);

        savacc.print();


    }
}
