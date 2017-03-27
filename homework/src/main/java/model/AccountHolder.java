package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class AccountHolder{

    String name;
    List<Account> accountList = new ArrayList<Account>();

    public AccountHolder(String name) {
        this.name = name;
    }

    public void addCurrentAccount(CurrentAccount curacc){
        accountList.add(curacc);
    }

    public void addSavingsAccount(SavingsAccount savacc){
        accountList.add(savacc);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
