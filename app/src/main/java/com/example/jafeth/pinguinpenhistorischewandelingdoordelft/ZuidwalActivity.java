package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ZuidwalActivity extends AppCompatActivity {

    private Button stopButton, nextButton, previousButton;
    private TextView buildingNameTextView, buildingDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_without_image);
        setUiElements();
        getBuildingInformation();
    }

    private void setUiElements() {
        buildingNameTextView = (TextView) findViewById(R.id.buildingNameTextView);
        buildingDescriptionTextView = (TextView) findViewById(R.id.buildingDescriptionTextView);
        buildingDescriptionTextView.setTextSize(MainActivity.getTextSize());

        stopButton = (Button) findViewById(R.id.stopButton);
        stopButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                stop();
            }
        });

        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                next();
            }
        });

        previousButton = (Button) findViewById(R.id.previousButton);
        previousButton.setEnabled(false);
    }

    private void stop()
    {

    }

    private void next()
    {

    }

    private void getBuildingInformation() {
        buildingNameTextView.setText(R.string.zuidwal);
        buildingDescriptionTextView.setText(R.string.zuidwal_description);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        MainActivity.setTextSize(Integer.parseInt(settings.getString("text_size", "14")));
        buildingDescriptionTextView.setTextSize(MainActivity.getTextSize());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.preferences:
            {
                Intent intent = new Intent();
                intent.setClassName(this, "com.example.jafeth.pinguinpenhistorischewandelingdoordelft.SettingsActivity");
                intent.putExtra( SettingsActivity.EXTRA_SHOW_FRAGMENT, SettingsFragment.class.getName() );
                intent.putExtra( SettingsActivity.EXTRA_NO_HEADERS, true );
                startActivity(intent);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
