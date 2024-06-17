package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess.");
            }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                //System.out.println("Kill the dragon.");
                killTheDragon();
            }
        });

        joa.embarkOnMission(() -> System.out.println("Save the princess."));
        saintGeorge.embarkOnMission(() -> killTheDragon());

        saintGeorge.embarkOnMission(Main::killTheDragon);   // method refernce
        joa.embarkOnMission(Main::saveThePrincess);
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess.");
    }

    public static void killTheDragon() {
        System.out.println("Kill the dragon");
    }
}
