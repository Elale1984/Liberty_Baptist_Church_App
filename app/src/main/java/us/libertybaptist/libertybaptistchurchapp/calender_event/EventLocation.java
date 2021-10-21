package us.libertybaptist.libertybaptistchurchapp.calender_event;

import androidx.annotation.NonNull;

public class EventLocation {

    private String locationName;
    private String address;
    private String aptOrSuitNum;
    private String city;
    private String county;
    private String state;
    private String zip;

    public EventLocation(String locationName, String address, String aptOrSuitNum, String city, String county, String state, String zip) {
        this.locationName = locationName;
        this.address = address;
        this.aptOrSuitNum = aptOrSuitNum;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
    }


    public EventLocation(){ }


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAptOrSuitNum() {
        return aptOrSuitNum;
    }

    public void setAptOrSuitNum(String aptOrSuitNum) {
        this.aptOrSuitNum = aptOrSuitNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EventLocation{" +
                "locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", aptOrSuitNum='" + aptOrSuitNum + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
