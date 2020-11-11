package pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.stream.Collectors;

public class UserInfo {
    @SerializedName("id")
    @Expose
    private int id ;

    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("firstname")
    @Expose
    private String firstname;

    @SerializedName("lastname")
    @Expose
    private String lastname;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

    @SerializedName("activated")
    @Expose
    private boolean isActivated;

    @SerializedName("longKey")
    @Expose
    private String longKey;

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
    private List<String> authorities ;

    public UserInfo() {    }

    public UserInfo(int id, String login, String firstname,
                    String lastname, String email, String imageUrl,
                    boolean isActivated, String longKey, String createdBy,
                    String createdDate, String lastModifiedBy, String lastModifiedDate,
                    List<String> authorities) {
        this.id = id;
        this.login = login;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.imageUrl = imageUrl;
        this.isActivated = isActivated;
        this.longKey = longKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public String getLongKey() {
        return longKey;
    }

    public void setLongKey(String longKey) {
        this.longKey = longKey;
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
        String result="";
        if(getAuthorities().size()!=0){
            result= getAuthorities().stream().map(t->"      \""+t+"\",\n").collect(Collectors.joining());
            //to remove the last comma
            result=result.substring(0,result.length()-1);
        }
        return result;
    }

    @Override
    public String toString() {
        return "[\n" +
                "\"id\": \"" + id +
                "\"login\": \"" + login + "\",\n" +
                "\"firstname\": \"" + firstname + "\",\n" +
                "\"lastname\": \"" + lastname +  "\",\n" +
                "\"email\": \"" + email +  "\",\n" +
                "\"imageUrl\": \"" + imageUrl +  "\",\n" +
                "\"isActivated\": \"" + isActivated + ",\n" +
                "\"longKey\": \"" + longKey +  "\",\n" +
                "\"createdBy\": \"" + createdBy +  "\",\n" +
                "\"createdDate\": \"" + createdDate +  "\",\n" +
                "\"lastModifiedBy\": \"" + lastModifiedBy +  "\",\n" +
                "\"lastModifiedDate\": \"" + lastModifiedDate +  "\",\n" +
                "\"authorities\": [\n" + authoritiesToString() +"\n"+
                "   ]\n}";
    }

    /*
    * "id": 4623,
    "login": "team07admin",
    "firstName": "Team07",
    "lastName": "Admin",
    "email": "team07admin@kmail.com",
    "imageUrl": null,
    "activated": true,
    "langKey": "en",
    "createdBy": "anonymousUser",
    "createdDate": "2020-11-09T20:42:18.014Z",
    "lastModifiedBy": "admin3",
    "lastModifiedDate": "2020-11-09T20:45:02.997Z",
    "authorities": [
        "ROLE_ADMIN"
    ]
}
    * */
}
