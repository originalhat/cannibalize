package denver.cannibalize;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class MapViewActivity extends MapActivity {

    final int BARS = 0;
    final int FOOD = 1;
    final int DISPENSARIES = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

        MapView mapView = (MapView) findViewById(R.id.map_view);
        mapView.setBuiltInZoomControls(true);

        Intent intent = getIntent();
        Bundle destinationBundle = intent.getExtras();
        if (destinationBundle != null) {

            int locationType = destinationBundle.getInt("locationType");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_map_view, menu);
        return true;
    }

    @Override
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }

}
