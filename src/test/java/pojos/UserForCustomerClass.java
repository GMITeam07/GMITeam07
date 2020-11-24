package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserForCustomerClass {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("activated")
    @Expose
    private Boolean activated;
    @SerializedName("langKey")
    @Expose
    private String langKey;

    @SerializedName("resetDate")
    @Expose
    private String resetDate;

    public UserForCustomerClass() {
    }

    public UserForCustomerClass(Integer id,
                                String login,
                                String firstName,
                                String lastName,
                                String email,
                                Boolean activated,
                                String langKey,
                                String imageUrl,
                                String resetDate) {
//        super();
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.activated = activated;
        this.langKey = langKey;
        this.resetDate = resetDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("");
        stringBuilder.
                append("\n{\n").
                append("\tid: "+ id+"\n").
                append("\tlogin: "+ login+"\n").
                append("\tfirstName: "+ firstName+"\n").
                append("\tlastName: "+ lastName+"\n").
                append("\temail: "+ email+"\n").
                append("\tactivated: "+ activated+"\n").
                append("\tlangKey: "+ langKey+"\n").
                append("\timageUrl: "+ imageUrl+"\n").
                append("\tresetDate: "+ resetDate +"\n").
                append("\n}\n").
                toString();
        return stringBuilder.toString();
    }

}