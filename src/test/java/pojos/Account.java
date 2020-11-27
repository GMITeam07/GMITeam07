package pojos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Account {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("balance")
    @Expose
    private double balance;
    @SerializedName("accountType")
    @Expose
    private String accountType;
    @SerializedName("accountStatusType")
    @Expose
    private String accountStatusType;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("closedDate")
    @Expose
    private String closedDate;
    @SerializedName("employee")
    @Expose
    private String employee;
    @SerializedName("accountLogs")
    @Expose
    private String accountLogs;
    public Account() {
    }

    public Account(int id, String description, int balance, String accountType,

                   String accountStatusType, String createDate, String closedDate,
                   String employee, String accountLogs) {
        this.id = id;
        this.description = description;
        this.balance = balance;
        this.accountType = accountType;
        this.accountStatusType = accountStatusType;
        this.createDate = createDate;
        this.closedDate = closedDate;
        this.employee = employee;
        this.accountLogs = accountLogs;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatusType() {
        return accountStatusType;
    }

    public void setAccountStatusType(String accountStatusType) {
        this.accountStatusType = accountStatusType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAccountLogs() {
        return accountLogs;
    }

    public void setAccountLogs(String accountLogs) {
        this.accountLogs = accountLogs;
    }

    @Override
    public String toString() {
        return "{\n" +
                "id: " + id + ",\n" +
                "description: " + description + ",\n" +
                "balance: " + balance + ",\n" +
                "accountType: " + accountType + ",\n" +
                "accountStatusType: " + accountStatusType + ",\n" +
                "createDate: " + createDate + ",\n" +
                "closedDate: " + closedDate + ",\n" +
                "employee: " + employee + ",\n" +
                "accountLogs: " + accountLogs + ",\n" +
                '}';
    }
}