package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_29_Esra_Country {
    private int id;
    private String name;
    private String states;

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

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states='" + states + '\'' +
                '}';
    }
}
