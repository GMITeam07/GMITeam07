package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Accounts {

    private List<Account> accountList;

    public Accounts(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Accounts() {
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "[\n" +
                accountList +"\n"+
                ']';
    }
}
