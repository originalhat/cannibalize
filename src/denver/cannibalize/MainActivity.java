package denver.cannibalize;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.maps.MapActivity;

public class MainActivity extends MapActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText mEdit = (EditText) findViewById(R.id.SMSText);

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
                displayPathToLocation("BARS");
            }
        });

        /** find food **/
        final Button findFoodButton = (Button) findViewById(R.id.findFood);
        findFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation("FOOD");
            }
        });

        /** find greens **/
        final Button findGreensButton = (Button) findViewById(R.id.findGreen);
        findGreensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation("DISPENSARIES");
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

    private void displayPathToLocation(String destination) {

        // NOTE: this code is for use with a GPS enabled device
        // LocationManager locationManager = (LocationManager)
        // getSystemService(Context.LOCATION_SERVICE);
        // Criteria criteria = new Criteria();
        // String bestProvider = locationManager.getBestProvider(criteria,
        // false);
        // Location location =
        // locationManager.getLastKnownLocation(bestProvider);
        // double longitude = location.getLongitude();
        // double latitude = location.getLatitude();
        //
        // String origin = longitude + "," + latitude;

        // this is a workaround for emulated devices with no GPS
        String origin = "39.747289,-105.002539";

        String directionsURL = "http://maps.google.com/maps?saddr=" + origin + "&daddr=" + destination;

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(directionsURL));

        startActivity(intent);

    }
}
