package pojos;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class State implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tpcountry")
    @Expose
    private String tpcountry;
    private final static long serialVersionUID = -1893745087587277957L;


    public State(Integer id, String name, String tpcountry) {
        super();
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(String tpcountry) {
        this.tpcountry = tpcountry;
    }

    @Override
    public String toString() {
        StringBuilder strb=new StringBuilder("");
        return strb.
                append("{\n").
                append("    id: "+ id).
                append(",\n").
                append("    name: "+ name).
                append(",\n").
                append("    tpcountry: "+ tpcountry).
                append("\n}").
                toString();
    }

}