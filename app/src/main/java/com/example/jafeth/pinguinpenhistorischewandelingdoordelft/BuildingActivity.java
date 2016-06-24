package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
    private int building;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);
        setUiElements();
        building = 1;
        getBuildingInformation();
    }

    private void getBuildingInformation() {
        switch (building)
        {
            case 1: buildingNameTextView.setText(R.string.zuidwal);
                buildingDescriptionTextView.setText(R.string.zuidwal_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.vermeer_view_of_delft);
                previousButton.setEnabled(false);
                break;
            case 2: buildingNameTextView.setText(R.string.nieuwedelf);
                buildingDescriptionTextView.setText(R.string.nieuwedelf_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.zegel_rikarde);
                previousButton.setEnabled(true);
                break;
            case 3: buildingNameTextView.setText(R.string.papegaai);
                buildingDescriptionTextView.setText(R.string.papegaai_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
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
                imageView.setImageResource(0);
                break;
            case 7: buildingNameTextView.setText(R.string.koornmarkt);
                buildingDescriptionTextView.setText(R.string.koornmarkt_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.reinier_de_graaf_17e_eeuw);
                break;
            case 8: buildingNameTextView.setText(R.string.leeuwenbrug);
                buildingDescriptionTextView.setText(R.string.leeuwenbrug_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
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
                imageView.setImageResource(R.drawable.tonnegen);
                break;
            case 12: buildingNameTextView.setText(R.string.st_hippolytuskapel);
                buildingDescriptionTextView.setText(R.string.st_hippolytuskapel_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.beeldje_wetenschap);
                break;
            case 13: buildingNameTextView.setText(R.string.oude_jan);
                buildingDescriptionTextView.setText(R.string.oude_jan_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 14: buildingNameTextView.setText(R.string.twee_deuren);
                buildingDescriptionTextView.setText(R.string.twee_deuren_description);
                imageView.setImageResource(R.drawable.huis_pieter_van_foreest);
                scrollView.scrollTo(0,0);
                break;
            case 15: buildingNameTextView.setText(R.string.hyronimuspoort);
                buildingDescriptionTextView.setText(R.string.hyronimuspoort_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.hieronymuspoort);
                break;
            case 16: buildingNameTextView.setText(R.string.gemeenlandshuis);
                buildingDescriptionTextView.setText(R.string.gemeenlandshuis_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.gemeenlandshuis);
                break;
            case 17: buildingNameTextView.setText(R.string.deurloos);
                buildingDescriptionTextView.setText(R.string.deurloos_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 18: buildingNameTextView.setText(R.string.savoyen);
                buildingDescriptionTextView.setText(R.string.savoyen_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 19: buildingNameTextView.setText(R.string.oude_kerk);
                buildingDescriptionTextView.setText(R.string.oude_kerk_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.oude_kerk);
                break;
            case 20: buildingNameTextView.setText(R.string.prinsenhof);
                buildingDescriptionTextView.setText(R.string.prinsenhof_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.prinsenhof_en_oude_kerk);
                break;
            case 21: buildingNameTextView.setText(R.string.schoolstraat);
                buildingDescriptionTextView.setText(R.string.schoolstraat_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 22: buildingNameTextView.setText(R.string.watertoren);
                buildingDescriptionTextView.setText(R.string.watertoren_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 23: buildingNameTextView.setText(R.string.koorstraat);
                buildingDescriptionTextView.setText(R.string.koorstraat_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.koor_oude_kerk);
                break;
            case 24: buildingNameTextView.setText(R.string.diamanten_ring);
                buildingDescriptionTextView.setText(R.string.diamanten_ring_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 25: buildingNameTextView.setText(R.string.huyse_sint_christoffel);
                buildingDescriptionTextView.setText(R.string.huyse_sint_christoffel_description);
                scrollView.scrollTo(0,0);
                break;
            case 26: buildingNameTextView.setText(R.string.vlouw);
                buildingDescriptionTextView.setText(R.string.vlouw_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 27: buildingNameTextView.setText(R.string.koornbeurs);
                buildingDescriptionTextView.setText(R.string.koornbeurs_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.vleeshal_en_visbanken);
                break;
            case 28: buildingNameTextView.setText(R.string.het_steen);
                buildingDescriptionTextView.setText(R.string.het_steen_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.het_steen);
                break;
            case 29: buildingNameTextView.setText(R.string.grote_markt);
                buildingDescriptionTextView.setText(R.string.grote_markt_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 30: buildingNameTextView.setText(R.string.hugo);
                buildingDescriptionTextView.setText(R.string.hugo_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 31: buildingNameTextView.setText(R.string.nieuwe_kerk);
                buildingDescriptionTextView.setText(R.string.nieuwe_kerk_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.nieuwe_kerk);
                break;
            case 32: buildingNameTextView.setText(R.string.fles);
                buildingDescriptionTextView.setText(R.string.fles_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 33: buildingNameTextView.setText(R.string.beslagen_bijbel);
                buildingDescriptionTextView.setText(R.string.beslagen_bijbel_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.beslagen_bijbel);
                break;
            case 34: buildingNameTextView.setText(R.string.oude_langedijk);
                buildingDescriptionTextView.setText(R.string.oude_langedijk_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 35: buildingNameTextView.setText(R.string.turfmarkt);
                buildingDescriptionTextView.setText(R.string.turfmarkt_description);
                scrollView.scrollTo(0,0);
                break;
            case 36: buildingNameTextView.setText(R.string.burgwal);
                buildingDescriptionTextView.setText(R.string.burgwal_description);
                scrollView.scrollTo(0,0);
                break;
            case 37: buildingNameTextView.setText(R.string.bierfabriek);
                buildingDescriptionTextView.setText(R.string.bierfabriek_description);
                scrollView.scrollTo(0,0);
                break;
            case 38: buildingNameTextView.setText(R.string.beestenmarkt);
                buildingDescriptionTextView.setText(R.string.beestenmarkt_description);
                scrollView.scrollTo(0,0);
                break;
            case 39: buildingNameTextView.setText(R.string.reigersberg);
                buildingDescriptionTextView.setText(R.string.reigersberg_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(0);
                break;
            case 40: buildingNameTextView.setText(R.string.rijnsburgerbrug);
                buildingDescriptionTextView.setText(R.string.rijnsburgerbrug_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.vrouwe_van_rijnsburgbrug);
                break;
            case 41: buildingNameTextView.setText(R.string.vermeercentrum);
                buildingDescriptionTextView.setText(R.string.vermeercentrum_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.jan_vermeer_van_delft);
                break;
            case 42: buildingNameTextView.setText(R.string.grote_markt);
                buildingDescriptionTextView.setText(R.string.markt_description_2);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.cameretten);
                break;
            case 43: buildingNameTextView.setText(R.string.literature);
                buildingDescriptionTextView.setText(R.string.literature_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.oostpoort);
                nextButton.setEnabled(true);
                break;
            case 44: buildingNameTextView.setText(R.string.credits);
                buildingDescriptionTextView.setText(R.string.credits_description);
                scrollView.scrollTo(0,0);
                imageView.setImageResource(R.drawable.pinguinpen);
                nextButton.setEnabled(false);
                break;
        }
    }

    private void next() {
        building++;
        getBuildingInformation();
    }

    private void previous() {
        building--;
        getBuildingInformation();
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