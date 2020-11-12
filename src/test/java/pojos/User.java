package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.stream.Collectors;

public class User {
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
    private Object imageUrl;
    @SerializedName("activated")
    @Expose
    private Boolean activated;
    @SerializedName("langKey")
    @Expose
    private String langKey;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("lastModifiedBy")
    @Expose
    private String lastModifiedBy;
    @SerializedName("lastModifiedDate")
    @Expose
    private String lastModifiedDate;

    @SerializedName("authorities")
    @Expose
    private List<String> authorities;

    public User() {
    }

    public User(Integer id, String login, String firstName, String lastName, String email, Object imageUrl, Boolean activated, String langKey, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, List<String> authorities) {
        super();
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.activated = activated;
        this.langKey = langKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
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

    public void setImageUrl(Object imageUrl) {
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    public String authoritiesToString(){
        String result=authorities.
                stream().
                map(t->"\""+t+"\",\n").
                collect(Collectors.joining());
        result=result.substring(0,result.length()-1);           //to remove last comma ","
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("{\n}").
                append("\"id\": "+ id+",\n").
                append("\"login\": "+ "\""+login+"\",\n").
                append("\"firstName\": "+"\""+ firstName+",\n").
                append("\"lastName\": "+ "\""+lastName+",\n").
                append("\"email\": "+ "\""+email+",\n").
                append("\"imageUrl\": "+ "\""+imageUrl+",\n").
                append("\"activated\": "+ activated+",\n").
                append("\"langKey\": "+ "\""+langKey+",\n").
                append("\"createdBy\": "+ "\""+createdBy+",\n").
                append("\"createdDate\": "+ "\""+createdDate+",\n").
                append("\"lastModifiedBy\": "+ "\""+lastModifiedBy+",\n").
                append("\"lastModifiedDate\": "+ "\""+lastModifiedDate+",\n").
                append("\"authorities\": [\n"+authoritiesToString()+"\n]");
        return result.toString();
    }

}
