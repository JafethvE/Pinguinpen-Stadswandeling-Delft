package com.example.jafeth.pinguinpenhistorischewandelingdoordelft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.percent.PercentLayoutHelper;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.support.percent.PercentRelativeLayout;

/**
 * Created by Jafeth on 07/06/2016.
 */
public class BuildingActivity extends AppCompatActivity {

    private Button nextButton, previousButton;
    private TextView buildingNameTextView, buildingDescriptionTextView;
    private ScrollView scrollView;
    private ImageView imageView;
    private int building, mShortAnimationDuration;
    private PercentRelativeLayout layout;
    private Animator mCurrentAnimator;

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
                setImage(R.drawable.vermeer_view_of_delft);
                previousButton.setEnabled(false);
                break;
            case 2: buildingNameTextView.setText(R.string.nieuwedelf);
                buildingDescriptionTextView.setText(R.string.nieuwedelf_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.zegel_rikarde);
                previousButton.setEnabled(true);
                break;
            case 3: buildingNameTextView.setText(R.string.papegaai);
                buildingDescriptionTextView.setText(R.string.papegaai_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 4: buildingNameTextView.setText(R.string.oost_indisch_huis);
                buildingDescriptionTextView.setText(R.string.oost_indisch_huis_description);
                scrollView.scrollTo(0,0);
                break;
            case 5: buildingNameTextView.setText(R.string.barbaraklooster);
                buildingDescriptionTextView.setText(R.string.barbaraklooster_description);
                scrollView.scrollTo(0,0);
                break;
            case 6: buildingNameTextView.setText(R.string.breestraat);
                buildingDescriptionTextView.setText(R.string.breestraat_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 7: buildingNameTextView.setText(R.string.koornmarkt);
                buildingDescriptionTextView.setText(R.string.koornmarkt_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.reinier_de_graaf_17e_eeuw);
                break;
            case 8: buildingNameTextView.setText(R.string.leeuwenbrug);
                buildingDescriptionTextView.setText(R.string.leeuwenbrug_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 9: buildingNameTextView.setText(R.string.wijnhaven);
                buildingDescriptionTextView.setText(R.string.wijnhaven_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 10: buildingNameTextView.setText(R.string.boterbrug);
                buildingDescriptionTextView.setText(R.string.boterbrug_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.stadsbrand);
                break;
            case 11: buildingNameTextView.setText(R.string.oude_delft);
                buildingDescriptionTextView.setText(R.string.oude_delft_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.tonnegen);
                break;
            case 12: buildingNameTextView.setText(R.string.st_hippolytuskapel);
                buildingDescriptionTextView.setText(R.string.st_hippolytuskapel_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.beeldje_wetenschap);
                break;
            case 13: buildingNameTextView.setText(R.string.oude_jan);
                buildingDescriptionTextView.setText(R.string.oude_jan_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 14: buildingNameTextView.setText(R.string.twee_deuren);
                buildingDescriptionTextView.setText(R.string.twee_deuren_description);
                setImage(R.drawable.huis_pieter_van_foreest);
                scrollView.scrollTo(0,0);
                break;
            case 15: buildingNameTextView.setText(R.string.hyronimuspoort);
                buildingDescriptionTextView.setText(R.string.hyronimuspoort_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.hieronymuspoort);
                break;
            case 16: buildingNameTextView.setText(R.string.gemeenlandshuis);
                buildingDescriptionTextView.setText(R.string.gemeenlandshuis_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.gemeenlandshuis);
                break;
            case 17: buildingNameTextView.setText(R.string.deurloos);
                buildingDescriptionTextView.setText(R.string.deurloos_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 18: buildingNameTextView.setText(R.string.savoyen);
                buildingDescriptionTextView.setText(R.string.savoyen_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 19: buildingNameTextView.setText(R.string.oude_kerk);
                buildingDescriptionTextView.setText(R.string.oude_kerk_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.oude_kerk);
                break;
            case 20: buildingNameTextView.setText(R.string.prinsenhof);
                buildingDescriptionTextView.setText(R.string.prinsenhof_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.prinsenhof_en_oude_kerk);
                break;
            case 21: buildingNameTextView.setText(R.string.schoolstraat);
                buildingDescriptionTextView.setText(R.string.schoolstraat_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 22: buildingNameTextView.setText(R.string.watertoren);
                buildingDescriptionTextView.setText(R.string.watertoren_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 23: buildingNameTextView.setText(R.string.koorstraat);
                buildingDescriptionTextView.setText(R.string.koorstraat_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.koor_oude_kerk);
                break;
            case 24: buildingNameTextView.setText(R.string.diamanten_ring);
                buildingDescriptionTextView.setText(R.string.diamanten_ring_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 25: buildingNameTextView.setText(R.string.huyse_sint_christoffel);
                buildingDescriptionTextView.setText(R.string.huyse_sint_christoffel_description);
                scrollView.scrollTo(0,0);
                break;
            case 26: buildingNameTextView.setText(R.string.vlouw);
                buildingDescriptionTextView.setText(R.string.vlouw_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 27: buildingNameTextView.setText(R.string.koornbeurs);
                buildingDescriptionTextView.setText(R.string.koornbeurs_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.vleeshal_en_visbanken);
                break;
            case 28: buildingNameTextView.setText(R.string.het_steen);
                buildingDescriptionTextView.setText(R.string.het_steen_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.het_steen);
                break;
            case 29: buildingNameTextView.setText(R.string.grote_markt);
                buildingDescriptionTextView.setText(R.string.grote_markt_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 30: buildingNameTextView.setText(R.string.hugo);
                buildingDescriptionTextView.setText(R.string.hugo_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 31: buildingNameTextView.setText(R.string.nieuwe_kerk);
                buildingDescriptionTextView.setText(R.string.nieuwe_kerk_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.nieuwe_kerk);
                break;
            case 32: buildingNameTextView.setText(R.string.fles);
                buildingDescriptionTextView.setText(R.string.fles_description);
                scrollView.scrollTo(0,0);
                setImage(0);
                break;
            case 33: buildingNameTextView.setText(R.string.beslagen_bijbel);
                buildingDescriptionTextView.setText(R.string.beslagen_bijbel_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.beslagen_bijbel);
                break;
            case 34: buildingNameTextView.setText(R.string.oude_langedijk);
                buildingDescriptionTextView.setText(R.string.oude_langedijk_description);
                scrollView.scrollTo(0,0);
                setImage(0);
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
                setImage(0);
                break;
            case 40: buildingNameTextView.setText(R.string.rijnsburgerbrug);
                buildingDescriptionTextView.setText(R.string.rijnsburgerbrug_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.vrouwe_van_rijnsburgbrug);
                break;
            case 41: buildingNameTextView.setText(R.string.vermeercentrum);
                buildingDescriptionTextView.setText(R.string.vermeercentrum_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.jan_vermeer_van_delft);
                break;
            case 42: buildingNameTextView.setText(R.string.grote_markt);
                buildingDescriptionTextView.setText(R.string.markt_description_2);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.cameretten);
                break;
            case 43: buildingNameTextView.setText(R.string.literature);
                buildingDescriptionTextView.setText(R.string.literature_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.oostpoort);
                nextButton.setEnabled(true);
                break;
            case 44: buildingNameTextView.setText(R.string.credits);
                buildingDescriptionTextView.setText(R.string.credits_description);
                scrollView.scrollTo(0,0);
                setImage(R.drawable.pinguinpen);
                nextButton.setEnabled(false);
                break;
        }
    }

    private void setImage(int image)
    {
        imageView.setImageResource(image);
        if(image != 0)
        {
            setImageHeight(0.35f);
        }
        else
        {
            setImageHeight(0.0f);
        }
    }

    private void setImageHeight(float heightPercent)
    {
        PercentRelativeLayout.LayoutParams params = (PercentRelativeLayout.LayoutParams) imageView.getLayoutParams();
        PercentLayoutHelper.PercentLayoutInfo info = params.getPercentLayoutInfo();
        info.heightPercent = heightPercent;
        imageView.requestLayout();
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

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb();
            }
        });
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

    private void zoomImageFromThumb() {
        // If there's an animation in progress, cancel it
        // immediately and proceed with this one.
        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }

        buildingDescriptionTextView.setVisibility(View.INVISIBLE);

        // Load the high-resolution "zoomed-in" image.
        final ImageView expandedImageView = (ImageView) findViewById(
                R.id.expanded_image);
        expandedImageView.setImageDrawable(imageView.getDrawable());

        // Calculate the starting and ending bounds for the zoomed-in image.
        // This step involves lots of math. Yay, math.
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        // The start bounds are the global visible rectangle of the thumbnail,
        // and the final bounds are the global visible rectangle of the container
        // view. Also set the container view's offset as the origin for the
        // bounds, since that's the origin for the positioning animation
        // properties (X, Y).
        imageView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container)
                .getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        // Adjust the start bounds to be the same aspect ratio as the final
        // bounds using the "center crop" technique. This prevents undesirable
        // stretching during the animation. Also calculate the start scaling
        // factor (the end scaling factor is always 1.0).
        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            // Extend start bounds horizontally
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            // Extend start bounds vertically
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        // Hide the thumbnail and show the zoomed-in view. When the animation
        // begins, it will position the zoomed-in view in the place of the
        // thumbnail.
        imageView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);

        // Set the pivot point for SCALE_X and SCALE_Y transformations
        // to the top-left corner of the zoomed-in view (the default
        // is the center of the view).
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        // Construct and run the parallel animation of the four translation and
        // scale properties (X, Y, SCALE_X, and SCALE_Y).
        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView, View.X,
                        startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y,
                        startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X,
                        startScale, 1f)).with(ObjectAnimator.ofFloat(expandedImageView,
                View.SCALE_Y, startScale, 1f));
        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;

        // Upon clicking the zoomed-in image, it should zoom back down
        // to the original bounds and show the thumbnail instead of
        // the expanded image.
        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                buildingDescriptionTextView.setVisibility(View.VISIBLE);

                // Animate the four positioning/sizing properties in parallel,
                // back to their original values.
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator
                        .ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.Y,startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        imageView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        imageView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });
    }
}