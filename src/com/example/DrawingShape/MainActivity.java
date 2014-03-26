package com.example.DrawingShape;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {
    public GeometricView geomView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViews();
    }

    public void findViews() {
        geomView = (GeometricView) findViewById(R.id.geomView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.shape:
                geomView.setShape(R.id.shape);
                break;
            case R.id.circle:
                geomView.setShape(0);
                geomView.invalidate();
                break;
            case R.id.rectangle:
                geomView.setShape(1);
                geomView.invalidate();
                break;

            case R.id.color:
                geomView.setColor(R.id.color);
                break;
            case R.id.blue:
                geomView.setColor(R.id.blue);
                break;
            case R.id.red:
                geomView.setColor(R.id.red);
                break;
            case R.id.exit:
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
