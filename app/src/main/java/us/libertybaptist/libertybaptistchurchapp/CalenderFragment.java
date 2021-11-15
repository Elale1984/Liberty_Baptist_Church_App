package us.libertybaptist.libertybaptistchurchapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import us.libertybaptist.libertybaptistchurchapp.Adapters.rvCalAdapter;
import us.libertybaptist.libertybaptistchurchapp.calender_event.CalenderEvent;


public class CalenderFragment extends Fragment {

    List<CalenderEvent> eventList;

    public CalenderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_calender, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvCalenderEvents = requireView().findViewById(R.id.rv_CalenderEvents);

        eventList = CalenderEvent.createContactsList(50);


        rvCalAdapter calAdapter;
        calAdapter = new rvCalAdapter(eventList);
        rvCalenderEvents.setAdapter(calAdapter);

        rvCalenderEvents.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}