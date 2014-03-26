package com.example.DrawingShape;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
    public GeometricView gv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //String msg = "";
        switch (item.getItemId()){
            case R.id.shape:
                gv.setShape(0);
                break;
            case R.id.circle:
                gv.setShape(R.id.circle);
                break;
            case R.id.rectangle:
                gv.setShape(R.id.rectangle);
                break;

            case R.id.color:
                gv.setColor(R.id.color);
                break;
            case R.id.blue:
                gv.setColor(R.id.blue);
                break;
            case R.id.red:
                gv.setColor(R.id.red);
                break;
            case R.id.exit:
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }
        //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return true;
    }

}
