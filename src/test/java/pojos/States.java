package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private int id;
    private String name;
    private String tpcountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(String tpcountry) {
        this.tpcountry = tpcountry;
    }


    @Override
    public String toString() {
        return "States{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tpcountry='" + tpcountry + '\'' +
                '}';
    }
}
