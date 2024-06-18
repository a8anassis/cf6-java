package gr.aueb.cf.ch17.clones;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        City clonedAthens = athens.clone();
        clonedAthens.setDescription("Paris");

        System.out.println(athens);
        System.out.println(clonedAthens);
    }
}
