package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("middleInitial")
    @Expose
    private String middleInitial;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobilePhoneNumber")
    @Expose
    private String mobilePhoneNumber;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("zipCode")
    @Expose
    private String zipCode;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("ssn")
    @Expose
    private String ssn;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("zelleEnrolled")
    @Expose
    private Boolean zelleEnrolled;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("accounts")
    @Expose
    private Object accounts;

    /**
     * No args constructor for use in serialization
     *
     */
    public Customer() {
    }

    public Customer(Integer id,
                    String firstName,
                    String lastName,
                    String middleInitial,
                    String email,
                    String mobilePhoneNumber,
                    String phoneNumber,
                    String zipCode,
                    String address,
                    String city,
                    String ssn,
                    String createDate,
                    Boolean zelleEnrolled,
                    Object country,
                    String state,
                    User user,
                    Object accounts) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.ssn = ssn;
        this.createDate = createDate;
        this.zelleEnrolled = zelleEnrolled;
        this.country = country;
        this.state = state;
        this.user = user;
        this.accounts = accounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Boolean getZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(Boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getAccounts() {
        return accounts;
    }

    public void setAccounts(Object accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("id"+ id).
                append("firstName"+ firstName).
                append("lastName"+ lastName).
                append("middleInitial"+ middleInitial).
                append("email"+ email).
                append("mobilePhoneNumber"+ mobilePhoneNumber).
                append("phoneNumber"+ phoneNumber).
                append("zipCode"+ zipCode).
                append("address"+ address).
                append("city"+ city).
                append("ssn"+ ssn).
                append("createDate"+ createDate).
                append("zelleEnrolled"+ zelleEnrolled).
                append("country"+ country).
                append("state"+ state).
                append("user"+ user).
                append("accounts"+ accounts).toString();
        return stringBuilder.toString();
    }

}