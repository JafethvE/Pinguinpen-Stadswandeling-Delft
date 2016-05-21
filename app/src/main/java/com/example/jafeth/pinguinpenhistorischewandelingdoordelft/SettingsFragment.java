package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Jafeth on 21/05/2016.
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragment_preference);
    }

}
