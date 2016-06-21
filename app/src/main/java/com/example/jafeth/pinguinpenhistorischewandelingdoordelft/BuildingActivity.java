package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Jafeth on 07/06/2016.
 */
public class BuildingActivity extends AppCompatActivity {

    private Button nextButton, previousButton;
    private TextView buildingNameTextView, buildingDescriptionTextView;
    private ScrollView scrollView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //if(hasImage())
        //{
            setContentView(R.layout.activity_building_with_image);
        //}
        //else
        //{
        //    setContentView(R.layout.activity_building_without_image);
        //}
        setUiElements();
        getBuildingInformation(MainActivity.getBuildingId());
    }

    private void getBuildingInformation(int buildingId) {
        switch (buildingId)
        {
            case 1: buildingNameTextView.setText(R.string.zuidwal);
                buildingDescriptionTextView.setText(R.string.zuidwal_description);
                scrollView.scrollTo(0,0);
                previousButton.setEnabled(false);
                break;
            case 2: buildingNameTextView.setText(R.string.nieuwedelf);
                buildingDescriptionTextView.setText(R.string.nieuwedelf_description);
                scrollView.scrollTo(0,0);
                previousButton.setEnabled(true);
                break;
            case 3: buildingNameTextView.setText(R.string.papegaai);
                buildingDescriptionTextView.setText(R.string.papegaai_description);
                scrollView.scrollTo(0,0);
                break;
            case 4: buildingNameTextView.setText(R.string.oost_indisch_huis);
                buildingDescriptionTextView.setText(R.string.oost_indisch_huis_description);
                scrollView.scrollTo(0,0);
                break;
            case 5: buildingNameTextView.setText(R.string.barbarakklooster);
                buildingDescriptionTextView.setText(R.string.barbarakklooster_description);
                scrollView.scrollTo(0,0);
                break;
            case 6: buildingNameTextView.setText(R.string.breestraat);
                buildingDescriptionTextView.setText(R.string.breestraat_description);
                scrollView.scrollTo(0,0);
                break;
            case 7: buildingNameTextView.setText(R.string.koornmarkt);
                buildingDescriptionTextView.setText(R.string.koornmarkt_description);
                scrollView.scrollTo(0,0);
                break;
            case 8: buildingNameTextView.setText(R.string.leeuwenbrug);
                buildingDescriptionTextView.setText(R.string.leeuwenbrug_description);
                scrollView.scrollTo(0,0);
                break;
            case 9: buildingNameTextView.setText(R.string.wijnhaven);
                buildingDescriptionTextView.setText(R.string.wijnhaven_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 10: buildingNameTextView.setText(R.string.boterbrug);
                buildingDescriptionTextView.setText(R.string.boterbrug_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.stadsbrand);
                break;
            case 11: buildingNameTextView.setText(R.string.oude_delft);
                buildingDescriptionTextView.setText(R.string.oude_delft_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 12: buildingNameTextView.setText(R.string.st_hippolytuskapel);
                buildingDescriptionTextView.setText(R.string.st_hippolytuskapel_description);
                scrollView.scrollTo(0,0);
                break;
        }
    }

    private boolean hasImage()
    {
        return false;
    }

    private void next() {
        MainActivity.nextBuilding();
        getBuildingInformation(MainActivity.getBuildingId());
    }

    private void previous() {
        MainActivity.previousBuilding();
        getBuildingInformation(MainActivity.getBuildingId());
    }

    private void setUiElements()
    {
        scrollView = (ScrollView) findViewById(R.id.scrollView);

        buildingNameTextView = (TextView) findViewById(R.id.buildingNameTextView);
        buildingDescriptionTextView = (TextView) findViewById(R.id.buildingDescriptionTextView);
        buildingDescriptionTextView.setTextSize(MainActivity.getTextSize());

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
        previousButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                previous();
            }
        });

        imageView = (ImageView) findViewById(R.id.imageView);
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