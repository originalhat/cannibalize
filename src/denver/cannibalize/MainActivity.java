package denver.cannibalize;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.maps.MapActivity;

public class MainActivity extends MapActivity {

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
                displayPathToLocation("bars");
            }
        });

        /** find food **/
        final Button findFoodButton = (Button) findViewById(R.id.findFood);
        findFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation("food");
            }
        });

        /** find greens **/
        final Button findGreensButton = (Button) findViewById(R.id.findGreen);
        findGreensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPathToLocation("dispensaries");
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

    private void displayPathToLocation(String locationType) {

        Intent intent = new Intent(this,
                denver.cannibalize.MapViewActivity.class);

        startActivity(intent);
    }
}
