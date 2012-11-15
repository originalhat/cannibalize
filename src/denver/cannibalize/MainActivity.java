package denver.cannibalize;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		MapView mapView;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.map_view);
        mapView.setBuiltInZoomControls(true);

	}

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

}
