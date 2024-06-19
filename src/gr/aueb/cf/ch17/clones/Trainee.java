package gr.aueb.cf.ch17.clones;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private City city;

    public Trainee() {

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    // Copy Constructor
    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city =  trainee.getCity(); // new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }


    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        if (!getName().equals(trainee.getName())) return false;
        return getCity().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
//        return Objects.hash(getName(), getCity());
        int result = getName().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }
}
