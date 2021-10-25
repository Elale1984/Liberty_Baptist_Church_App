package us.libertybaptist.libertybaptistchurchapp.calender_event;

import java.util.List;
/*
 * This class defines a global list that is used for CalenderEvents. The CalenderEvents
 * List will be displayed in the Calender Fragment. This list will update via the CalenderEvent_IO
 * class methods.
 */
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
