package denver.cannibalize;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.maps.MapActivity;

public class MainActivity extends MapActivity {

    final int BARS = 0;
    final int FOOD = 1;
    final int DISPENSARIES = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                displayPathToLocation(BARS);
            }
        });

        /** find food **/
        final Button findFoodButton = (Button) findViewById(R.id.findFood);
        findFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation(FOOD);
            }
        });

        /** find greens **/
        final Button findGreensButton = (Button) findViewById(R.id.findGreen);
        findGreensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation(DISPENSARIES);
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

    private void displayPathToLocation(int locationType) {

        Intent intent = new Intent(
                android.content.Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));

        startActivity(intent);

    }
}
