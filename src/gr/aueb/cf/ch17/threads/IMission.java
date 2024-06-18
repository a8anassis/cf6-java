package gr.aueb.cf.ch17.threads;

public interface IMission {
    MissionStatus getMissionStatus();
    void setMissionStatus(MissionStatus missionStatus);
    void embark();
}
