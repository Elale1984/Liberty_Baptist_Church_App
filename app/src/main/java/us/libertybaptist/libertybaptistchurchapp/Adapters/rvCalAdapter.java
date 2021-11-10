package us.libertybaptist.libertybaptistchurchapp.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import us.libertybaptist.libertybaptistchurchapp.R;
import us.libertybaptist.libertybaptistchurchapp.calender_event.CalenderEvent;
import us.libertybaptist.libertybaptistchurchapp.calender_event.EventList;

//Adapter for the Calender Events Recycler View

public class rvCalAdapter extends RecyclerView.Adapter<rvCalAdapter.CalViewHolder> {

    private List<CalenderEvent> eventLists;

    public rvCalAdapter(List<CalenderEvent> eventLists) {
        this.eventLists = eventLists;
    }

    public class CalViewHolder extends RecyclerView.ViewHolder {


        private TextView tvEventName;
        private TextView tvEventDate;
        private TextView tvEventStartTime;
        private TextView tvEventEndTime;



        public CalViewHolder(@NonNull View itemView) {
            super(itemView);

            tvEventName = (TextView) itemView.findViewById(R.id.tv_EventItemName);
            tvEventDate = (TextView) itemView.findViewById(R.id.tv_EventItemDate);
            tvEventStartTime = (TextView) itemView.findViewById(R.id.tv_EventItemStartTime);
            tvEventEndTime = (TextView) itemView.findViewById(R.id.tv_EventItemEndTime);

        }
    }

    @NonNull
    @Override
    public rvCalAdapter.CalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View calenderEventView = inflater.inflate(R.layout.layout_events_view_item, parent, false);

        // Return a new holder instance
        CalViewHolder calViewHolder = new CalViewHolder(calenderEventView);
        return calViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull rvCalAdapter.CalViewHolder holder, int position) {
        CalenderEvent eventList = eventLists.get(position);

        TextView tvEventName = holder.tvEventName;
        TextView tvEventDate = holder.tvEventDate;
        TextView tvEventStartTime = holder.tvEventStartTime;
        TextView tvEventEndTime = holder.tvEventEndTime;
    }



    @Override
    public int getItemCount() {
        return eventLists.size();
    }


}
