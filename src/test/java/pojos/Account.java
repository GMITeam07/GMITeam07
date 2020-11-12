package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

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
    private double createDate;

    @SerializedName("closedDate")
    @Expose
    private String closedDate;

    @SerializedName("employee")
    @Expose
    private String employee;


    @SerializedName("accountlogs")
    @Expose
    private String accountlogs;

    public Account() {
    }

    public Account(int id, String description, double balance, String accountType, String accountStatusType, double createDate, String closedDate, String employee, String accountlogs) {
        this.id = id;
        this.description = description;
        this.balance = balance;
        this.accountType = accountType;
        this.accountStatusType = accountStatusType;
        this.createDate = createDate;
        this.closedDate = closedDate;
        this.employee = employee;
        this.accountlogs = accountlogs;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountStatusType() {
        return accountStatusType;
    }

    public double getCreateDate() {
        return createDate;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public String getEmployee() {
        return employee;
    }

    public String getAccountlogs() {
        return accountlogs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountStatusType(String accountStatusType) {
        this.accountStatusType = accountStatusType;
    }

    public void setCreateDate(double createDate) {
        this.createDate = createDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setAccountlogs(String accountlogs) {
        this.accountlogs = accountlogs;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", accountStatusType='" + accountStatusType + '\'' +
                ", createDate=" + createDate +
                ", closedDate='" + closedDate + '\'' +
                ", employee='" + employee + '\'' +
                ", accountlogs='" + accountlogs + '\'' +
                '}';
    }







    /*{
        "id": 3964,
        "description": "ticari kredi talebi",
        "balance": 25000,
        "accountType": "INVESTING",
        "accountStatusType": "ACTIVE",
        "createDate": "2020-11-09T21:00:00Z",
        "closedDate": "2020-11-09T21:00:00Z",
        "employee": null,
        "accountlogs": null
    },*/








}
