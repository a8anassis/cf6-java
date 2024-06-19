package gr.aueb.cf.ch17.clones;

import java.io.Serializable;
import java.util.Objects;

public class City implements Cloneable, Serializable {
    private static final long serialVersionUID = -1236784L;
    private String description;
    private transient long hashCode;

    public City() {

    }

    public City(String description) {
        this.description = description;
    }

    // Copy Constructor
    public City(City city) {
        this.description = city.getDescription();
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City: " + description;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;

        City city = (City) other;

        return this.getDescription().equals(city.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }
}
