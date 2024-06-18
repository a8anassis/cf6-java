package gr.aueb.cf.ch17.threads;

public class KillTheDragon implements IMission {
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getMissionStatus() {
        return missionStatus;
    }

    @Override
    public void setMissionStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Kill the dragon mission.");
    }
}
