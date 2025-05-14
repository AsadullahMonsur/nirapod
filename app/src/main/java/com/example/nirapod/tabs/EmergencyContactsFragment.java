package com.example.nirapod.tabs;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.nirapod.R;
import com.example.nirapod.other.ContactsAdapter;


public class EmergencyContactsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_emergency_contacts, container, false);

        RecyclerView recycler_view = view.findViewById(R.id.fragment_emergency_contacts_recycler_view);
        ContactsAdapter adapter = new ContactsAdapter();
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new GridLayoutManager(view.getContext(),1));  //column amount per row
        recycler_view.setAdapter(adapter);
        recycler_view.setNestedScrollingEnabled(false);
        adapter.notifyDataSetChanged();

        return view;
    }


}