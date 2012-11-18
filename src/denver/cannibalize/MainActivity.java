package denver.cannibalize;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.maps.MapActivity;

public class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// MapView mapView;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        // mapView = (MapView) findViewById(R.id.map_view);
        // mapView.setBuiltInZoomControls(true);

		listenForButtonClicks();

	}

    /** listen for main menu button clicks **/
    private void listenForButtonClicks() {

        /** find drinks **/
		final Button findDrinksButton = (Button) findViewById(R.id.findDrinks);
		findDrinksButton.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        }
	    });

	    /** find food **/
		final Button findFoodButton = (Button) findViewById(R.id.findFood);
		findFoodButton.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        }
	    });

	    /** find greens **/
		final Button findGreensButton = (Button) findViewById(R.id.findGreen);
	    findGreensButton.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        }
	    });

	    /** find rides **/
		final Button findRidesButton = (Button) findViewById(R.id.findRides);
	    findRidesButton.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        }
	    });

	}

	@Override
    protected boolean isRouteDisplayed() {
        return false;
    }

}
