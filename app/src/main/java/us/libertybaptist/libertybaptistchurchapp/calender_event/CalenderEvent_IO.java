package us.libertybaptist.libertybaptistchurchapp.calender_event;

import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
/*
 * This class defines methods to read and write the CalenderEvent data to and from a JSON file within
 * the android file system.
 */
public class CalenderEvent_IO {


    Context context;

    // Object mapper to map data to and from JSON in parsing
    ObjectMapper om = new ObjectMapper();

    // Constructor
    public CalenderEvent_IO(Context context) {
        this.context = context;
    }

    // Method to write the data to the JSON file in the android file system
    public void writeList(EventList eventList, String filename) {

        // gets the path within the android files system
        File path = context.getExternalFilesDir(null);

        //creates the file object
        File file = new File(path, filename);
        try {

            // utilizes the prettyPrinter to organize the data in the file for users comfort
            om.writerWithDefaultPrettyPrinter().writeValue(file, eventList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read the data from the file and parse it into EventList class object
    public EventList readList(String filename) {

        // gets the file from the internal storage in android file system
        File path = context.getExternalFilesDir(null);

        //creates the file object from path and file name
        File file = new File(path, filename);

        //creates a EventList that holds the saved data
        EventList returnList = new EventList();

        try {
            returnList = om.readValue(file, EventList.class);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnList;

    }
}