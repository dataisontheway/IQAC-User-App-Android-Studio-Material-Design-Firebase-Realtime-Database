package info.androidhive.navigationdrawer.other;

public class EventInfo {

    public String eventProgramme;
    public String eventTime;
    public String eventVenue;

    public EventInfo(){

    }

    public EventInfo(String eventProgramme, String eventTime, String eventVenue) {
        this.eventProgramme = eventProgramme;
        this.eventTime = eventTime;
        this.eventVenue = eventVenue;
    }

    public String getEventProgramme() {
        return eventProgramme;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventVenue() {
        return eventVenue;
    }

}
