package de.fhbielefeld.swe.raumbuchung;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeScreen extends Fragment {


    public HomeScreen() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);
        ListView listView_home = view.findViewById(R.id.listView_home);
        final MainActivity mainActivity = (MainActivity) getActivity();
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (mainActivity, android.R.layout.simple_list_item_1, mainActivity.arrayList);
        listView_home.setAdapter(arrayAdapter);
        listView_home.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mainActivity.deleteItem(position);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        //Toolbar toolbar_home = (Toolbar) view.findViewById(R.id.toolbar_home);



        return view;
    }

}
