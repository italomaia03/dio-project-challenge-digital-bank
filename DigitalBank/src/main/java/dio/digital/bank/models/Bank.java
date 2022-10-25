package dio.digital.bank.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Bank(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(CheckingAccount account) {
        this.accounts.add(account);
    }

    public void setAccounts(SavingsAccount account) {
        this.accounts.add(account);
    }

}
