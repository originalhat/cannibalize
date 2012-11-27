package denver.cannibalize;

import java.util.ArrayList;
import java.util.Collections;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
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

                ArrayList<String> messages = new ArrayList<String>();

                String origin = getOrigin();

                messages.add("Yo broski, I need a ride! - " + origin);
                messages.add("I need to get some cheetos man! - " + origin);
                messages.add("Whoah, I'm so faded, lets party! - " + origin);
                messages.add("CAN I GET A RIDE?!? - " + origin);

                Collections.shuffle(messages);

                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", "7204966335");
                smsIntent.putExtra("sms_body", messages.get(0));
                startActivity(smsIntent);

            }
        });

    }

    private void displayPathToLocation(String destination) {

        String origin = getOrigin();

        String directionsURL = "http://maps.google.com/maps?saddr=" + origin + "&daddr=" + destination;

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(directionsURL));

        startActivity(intent);

    }

    private String getOrigin() {
        LocationManager mlocManager = null;
        LocationListener mlocListener;
        mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        mlocListener = new MyLocationListener();
        mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListener);

        return MyLocationListener.longitude + "," + MyLocationListener.latitude;
    }
}
