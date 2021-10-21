package us.libertybaptist.libertybaptistchurchapp.calender_event;

import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CalenderEvent_IO {

    Context context;

    ObjectMapper om = new ObjectMapper();


    public CalenderEvent_IO(Context context) {
        this.context = context;
    }

    public void writeList(EventList eventList, String filename) {


        File path = context.getExternalFilesDir(null);
        File file = new File(path, filename);
        try {

            om.writerWithDefaultPrettyPrinter().writeValue(file, eventList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public EventList readList(String filename) {
        File path = context.getExternalFilesDir(null);
        File file = new File(path, filename);
        EventList returnList = new EventList();

        try {
            returnList = om.readValue(file, EventList.class);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnList;

    }
}