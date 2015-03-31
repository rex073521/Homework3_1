package com.example.rex.homework3_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity{
    private DrawTest drawTest;
    private RelativeLayout relativeLayout;

    public void findViews(){
        drawTest=(DrawTest)findViewById(R.id.drawtest);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.rect:
                Toast.makeText(MainActivity.this, getString(R.string.rect), Toast.LENGTH_SHORT).show();
                break;
            case R.id.circle:
                Toast.makeText(MainActivity.this, getString(R.string.circle), Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                Toast.makeText(MainActivity.this, getString(R.string.red), Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                Toast.makeText(MainActivity.this, getString(R.string.blue), Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
