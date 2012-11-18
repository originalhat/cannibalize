package denver.cannibalize;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.maps.MapActivity;

public class MainActivity extends MapActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MapView mapView;
        // mapView = (MapView) findViewById(R.id.map_view);
        // mapView.setBuiltInZoomControls(true);

        listenForButtonClicks();

    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

    /** listen for main menu button clicks **/
    private void listenForButtonClicks() {

        /** find drinks **/
        final Button findDrinksButton = (Button) findViewById(R.id.findDrinks);
        findDrinksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // search for close bars
            }
        });

        /** find food **/
        final Button findFoodButton = (Button) findViewById(R.id.findFood);
        findFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // search for close restaurants
            }
        });

        /** find greens **/
        final Button findGreensButton = (Button) findViewById(R.id.findGreen);
        findGreensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // search for close marijuana dispensaries
            }
        });

        /** find rides **/
        final Button findRidesButton = (Button) findViewById(R.id.findRides);
        findRidesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // use an Intent to open contacts
            }
        });

    }

    // TODO: retrieve current GPS location

    // TODO: query google maps for a 'target', e.g. taco bell, bars, etc.
    // return and place location in coordinate form

    // TODO: call google maps with GPS and 'target location'
    // use current loc. coords. and 'target location' coords to display path
}
