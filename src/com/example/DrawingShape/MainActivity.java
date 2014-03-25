package com.example.DrawingShape;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

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
        String msg = "";
        switch (item.getItemId()){
            case R.id.shape:
                //msg = getString(R.string.shape);
                GetItem gi = new GetItem(R.id.shape);
                break;
            case R.id.circle:
                msg = getString(R.string.circle);
                break;
            case R.id.rectangle:
                msg = getString(R.string.rectangle);
                break;

            case R.id.color:
                msg = getString(R.string.color);
                break;
            case R.id.blue:
                msg = getString(R.string.blue);
                break;
            case R.id.red:
                msg = getString(R.string.red);
                break;
            case R.id.exit:
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return true;
    }

}
