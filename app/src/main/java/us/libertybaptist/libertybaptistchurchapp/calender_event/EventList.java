package us.libertybaptist.libertybaptistchurchapp.calender_event;

import java.util.List;

public class EventList {

    private List<CalenderEvent> eventList;

    public EventList(){

    }

    public EventList(List<CalenderEvent> eventList) {
        this.eventList = eventList;
    }

    public List<CalenderEvent> getEventList() {
        return eventList;
    }

    public void setEventList(List<CalenderEvent> eventList) {
        this.eventList = eventList;
    }
}
