package com.example.nirapod.tabs;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.nirapod.R;

public class SecurityFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_security, container, false);

        Spinner location_spinner = view.findViewById(R.id.security_location_spinner);
        Spinner notification_level_spinner = view.findViewById(R.id.security_notification_level_spinner);


        String []location_data = new String[]{"Select","Never","Always"};
        ArrayAdapter<String> location_adapter = new ArrayAdapter<String>(location_spinner.getContext(), android.R.layout.simple_dropdown_item_1line,location_data);
        location_spinner.setAdapter(location_adapter);
        location_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View view, int position, long id) {
                if(position!=0) {
                    String selected_item = adapter.getItemAtPosition(position).toString();
                    location_spinner.setFocusable(false);
                    Toast.makeText(location_spinner.getContext(),selected_item,Toast.LENGTH_SHORT);
                }
                else {
                    Toast.makeText(location_spinner.getContext(),"Nothing Selected",Toast.LENGTH_SHORT);
                    location_spinner.setFocusable(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapter) {
                Toast.makeText(location_spinner.getContext(),"Nothing Selected",Toast.LENGTH_SHORT);
            }
        });

        String []notification_level_data = new String[]{"Select","Low","High"};
        ArrayAdapter<String> notification_level_adapter = new ArrayAdapter<String>(notification_level_spinner.getContext(),
                                                                                   android.R.layout.simple_dropdown_item_1line,
                                                                                   notification_level_data);
        notification_level_spinner.setAdapter(notification_level_adapter);
        notification_level_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View view, int position, long id) {
                if(position!=0) {
                    String selected_item = adapter.getItemAtPosition(position).toString();
                    notification_level_spinner.setFocusable(false);
                    Toast.makeText(notification_level_spinner.getContext(),selected_item,Toast.LENGTH_SHORT);
                }
                else {
                    Toast.makeText(notification_level_spinner.getContext(),"Nothing Selected",Toast.LENGTH_SHORT);
                    notification_level_spinner.setFocusable(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapter) {
                Toast.makeText(notification_level_spinner.getContext(),"Nothing Selected",Toast.LENGTH_SHORT);
            }
        });

        return view;
    }
}