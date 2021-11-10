package us.libertybaptist.libertybaptistchurchapp.calender_event;


import java.util.ArrayList;

/*
 * This class defines Calender Events. It includes all of the information that is needed for any
 * specific event.
 */
public class CalenderEvent {

    //Calender Event Properties
    private String eventName;
    private String eventDate;
    private String eventStartTime;
    private String eventEndTime;

    // Calender Event constructor
    public CalenderEvent(String eventName, String eventDate, String eventStartTime, String eventEndTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    // Default constructor
    public CalenderEvent(){}

    //Getters and Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public static ArrayList<CalenderEvent> createContactsList(int numEvents) {
        ArrayList<CalenderEvent> events = new ArrayList<CalenderEvent>();

        for (int i = 1; i <= numEvents; i++) {
            events.add(new CalenderEvent("event", "date", "start", "end"));
        }

        return events;
    }



}
