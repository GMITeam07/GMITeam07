package pojos;

<<<<<<< HEAD
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class State implements Serializable {
=======
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State implements Serializable
{
>>>>>>> main

    @SerializedName("id")
    @Expose
    private Integer id;
<<<<<<< HEAD
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tpcountry")
    @Expose
    private String tpcountry;
=======

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("tpcountry")
    @Expose
    private String tpcountry;


>>>>>>> main
    /**
     * No args constructor for use in serialization
     *
     */
    public State() {
    }
<<<<<<< HEAD
=======

>>>>>>> main
    /**
     *
     * @param tpcountry
     * @param name
     * @param id
     */
    public State(Integer id, String name, String tpcountry) {
<<<<<<< HEAD
        super();
=======

>>>>>>> main
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }
<<<<<<< HEAD
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
=======

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
                append("    \"id\": "+ id).
                append(",\n").
                append("    \"name\": \""+ name).
                append("\",\n").
                append("    \"tpcountry\": "+ tpcountry).
>>>>>>> main
                append("\n}").
                toString();
    }

<<<<<<< HEAD


}
=======
}
>>>>>>> main
