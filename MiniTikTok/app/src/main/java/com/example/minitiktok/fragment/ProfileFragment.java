package com.example.minitiktok.fragment;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minitiktok.R;
import com.example.minitiktok.activity.LoginActivity;


public class ProfileFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String userName;
    private String userID;

    public ProfileFragment() {
        super();
    }

    public ProfileFragment(String userName, String userID) {
        super();
        this.userName = userName;
        this.userID = userID;
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment(param1, param2);
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        ((TextView)v.findViewById(R.id.tv_username)).setText(userName);
        /*getChildFragmentManager()
                .beginTransaction()
                .add(R.id.fl_placeholder, new DiscoverFragment(userName))
                .commit();*/
        return v;
    }
}