package gr.aueb.cf.ch17.threads;

public interface IKnight {

    IMission[] missions = {
            new KillTheDragon(),
            new SaveThePrincess(),
            new KillTheDragon()
    };

    void embarkOnMission(IMission mission);
}
