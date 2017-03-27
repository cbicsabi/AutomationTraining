package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class AccountHolder{

    private String name;
    private List<Account> accountList = new ArrayList<Account>();

    public AccountHolder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void addAccount(Account curacc){
        accountList.add(curacc);
    }
}
