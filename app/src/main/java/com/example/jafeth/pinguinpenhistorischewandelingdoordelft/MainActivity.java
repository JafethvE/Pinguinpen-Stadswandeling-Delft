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

public class MainActivity extends AppCompatActivity {

    private TextView welcomeTextView;
    private Button startButton;
    private static int textSize, buildingId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUiElements();
        PreferenceManager.setDefaultValues(this, R.xml.fragment_preference, false);
    }

    private void setUiElements()
    {
        welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startTour();
            }
        });
    }

    private void startTour()
    {
        Intent i = new Intent(MainActivity.this, BuildingActivity.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        textSize = Integer.parseInt(settings.getString("text_size", "14"));
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

    public static void setTextSize(int newTextSize)
    {
        textSize = newTextSize;
    }

    public static int getTextSize()
    {
        return textSize;
    }
}
