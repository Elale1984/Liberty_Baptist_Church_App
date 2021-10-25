package us.libertybaptist.libertybaptistchurchapp.calender_event;

import java.time.LocalDate;
import java.time.LocalTime;

import us.libertybaptist.libertybaptistchurchapp.general.info.Address;
/*
 * This class defines Calender Events. It includes all of the information that is needed for any
 * specific event.
 */
public class CalenderEvent {

    //Calender Event Properties
    private String eventName;
    private LocalDate eventDate;
    private LocalTime eventStartTime;
    private LocalTime eventEndTime;
    private String eventDescription;
    private Address Location;

    // Calender Event constructor
    public CalenderEvent(String eventName, LocalDate eventDate, LocalTime eventStartTime, LocalTime eventEndTime, String eventDescription, Address location) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.eventDescription = eventDescription;
        Location = location;
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

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(LocalTime eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public LocalTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(LocalTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Address getLocation() {
        return Location;
    }

    public void setLocation(Address location) {
        Location = location;
    }

    //Overridden toString method
    @Override
    public String toString() {
        return "CalenderEvent{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventStartTime=" + eventStartTime +
                ", eventEndTime=" + eventEndTime +
                ", eventDescription='" + eventDescription + '\'' +
                ", Location=" + Location +
                '}';
    }
}
