package us.libertybaptist.libertybaptistchurchapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class CalenderFragment extends Fragment {



    public CalenderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View calenderView = inflater.inflate(R.layout.fragment_calender, container, false);
        Button goCalender = calenderView.findViewById(R.id.btn_GoToCalender);
        goCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calenderIntent = new Intent(getActivity(), MyCalender.class);
                startActivity(calenderIntent);
            }
        });
        return calenderView;
    }
}