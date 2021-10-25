package us.libertybaptist.libertybaptistchurchapp.general.info;

/*
 * This class defines the information that will make up addresses for general purposes. The Address
 * class is used in a few different places in the app.
 */

public class Address {

    // Class Variables for Address Class
    private String locationName;
    private String address;
    private String aptOrSuitNum;
    private String city;
    private String county;
    private String state;
    private String zip;

    // Constructor
    public Address(String locationName, String address, String aptOrSuitNum, String city, String county, String state, String zip) {
        this.locationName = locationName;
        this.address = address;
        this.aptOrSuitNum = aptOrSuitNum;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
    }

    // Default Constructor
    public Address(){ }

    // Getters and Setters
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

    // Overridden toString method for the Address Class

    @Override
    public String toString() {
        return "Address{" +
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
