package us.libertybaptist.libertybaptistchurchapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class BibleFragment extends Fragment {
    
    private Button btnBook;

    public BibleFragment() {
        // Required empty public constructor
    }


    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bible,
                container, false);

        //Book button onclick action
        Button btnBook = (Button) view.findViewById(R.id.btnBook);
        btnBook.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Book", Toast.LENGTH_SHORT).show();
            }
        });

        //Chapter button onclick action
        Button btnChapter = (Button) view.findViewById(R.id.btnChapter);
        btnChapter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Chapter", Toast.LENGTH_SHORT).show();
            }
        });

        //Verse button onclick action
        Button btnVerse = (Button) view.findViewById(R.id.btnVerse);
        btnVerse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Verse", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    
}