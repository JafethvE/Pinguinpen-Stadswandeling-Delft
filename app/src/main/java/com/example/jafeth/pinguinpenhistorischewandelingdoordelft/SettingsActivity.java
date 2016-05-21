package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;

import android.preference.PreferenceActivity;

import java.util.List;

/**
 * Created by Jafeth on 21/05/2016.
 */
public class SettingsActivity extends PreferenceActivity
{
    //@Override
    //public void onBuildHeaders(List<Header> target)
    //{
    //    loadHeadersFromResource(R.xml.headers_preference, target);
    //}

    @Override
    protected boolean isValidFragment(String fragmentName)
    {
        return SettingsFragment.class.getName().equals(fragmentName);
    }
}
