package com.tarapus.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] forecastArray = {
                "Today - sunny  - 88/67",
                "Tomorrow - sfsf - sfsf",
                "Wed - sfsf - fsfssf",
                "Thursday - sasf- sfsf",
                "friday - sfsf - safsf",
                "Sat - asfsf - asfsf",
                "Sunday - sfsf - sfsf"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        //Adapter
        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView listView = (ListView) rootView.findViewById(R.id.list_view_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
