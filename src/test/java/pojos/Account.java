package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
<<<<<<< HEAD
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Account {


=======

public class Account {

>>>>>>> main
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("balance")
    @Expose
<<<<<<< HEAD
    private double balance;
=======
    private int balance;
>>>>>>> main

    @SerializedName("accountType")
    @Expose
    private String accountType;

    @SerializedName("accountStatusType")
    @Expose
    private String accountStatusType;

    @SerializedName("createDate")
    @Expose
<<<<<<< HEAD
    private double createDate;
=======
    private String createDate;
>>>>>>> main

    @SerializedName("closedDate")
    @Expose
    private String closedDate;

    @SerializedName("employee")
    @Expose
    private String employee;

<<<<<<< HEAD

    @SerializedName("accountlogs")
    @Expose
    private String accountlogs;
=======
    @SerializedName("accountLogs")
    @Expose
    private String accountLogs;
>>>>>>> main

    public Account() {
    }

<<<<<<< HEAD
    public Account(int id, String description, double balance, String accountType, String accountStatusType, double createDate, String closedDate, String employee, String accountlogs) {
=======
    public Account(int id, String description, int balance, String accountType,
                   String accountStatusType, String createDate, String closedDate,
                   String employee, String accountLogs) {
>>>>>>> main
        this.id = id;
        this.description = description;
        this.balance = balance;
        this.accountType = accountType;
        this.accountStatusType = accountStatusType;
        this.createDate = createDate;
        this.closedDate = closedDate;
        this.employee = employee;
<<<<<<< HEAD
        this.accountlogs = accountlogs;
=======
        this.accountLogs = accountLogs;
>>>>>>> main
    }

    public int getId() {
        return id;
    }

<<<<<<< HEAD
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
=======
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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
>>>>>>> main
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

<<<<<<< HEAD
=======
    public String getEmployee() {
        return employee;
    }

>>>>>>> main
    public void setEmployee(String employee) {
        this.employee = employee;
    }

<<<<<<< HEAD
    public void setAccountlogs(String accountlogs) {
        this.accountlogs = accountlogs;
=======
    public String getAccountLogs() {
        return accountLogs;
    }

    public void setAccountLogs(String accountLogs) {
        this.accountLogs = accountLogs;
>>>>>>> main
    }

    @Override
    public String toString() {
<<<<<<< HEAD
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








=======
        return "{\n" +
                "id: " + id +",\n" +
                "description: " + description + ",\n" +
                "balance: " + balance +",\n" +
                "accountType: " + accountType + ",\n" +
                "accountStatusType: " + accountStatusType + ",\n" +
                "createDate: " + createDate + ",\n" +
                "closedDate: " + closedDate + ",\n" +
                "employee: " + employee + ",\n" +
                "accountLogs: " + accountLogs + ",\n" +
                '}';
    }
>>>>>>> main
}
