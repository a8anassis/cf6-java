package gr.aueb.cf.ch17.clones;

public class City implements Cloneable {
    private String description;

    public City() {

    }

    public City(String description) {
        this.description = description;
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
}
