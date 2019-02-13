package com.example.week3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class OverviewFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.overview_fragment, container, false);

        Pokemons_Mock pokemons = new Pokemons_Mock();



        ArrayAdapter<String> pkmNameAdapter = new ArrayAdapter<String>(getActivity(), R.layout.overview_fragment, pokemons.getNames());

        ListView pkmNames = (ListView) rootView.findViewById(R.id.pkmNameList);
        pkmNames.setAdapter(pkmNameAdapter);

        return rootView;
    }

    public interface Listener
    {
        void onItemSelected();
    }

}
