package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true) //Bazi hatalari ignore ediyor

    public class US_021Countries {

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
            return "US_021Countries{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", states='" + states + '\'' +
                    '}';
        }
    }



