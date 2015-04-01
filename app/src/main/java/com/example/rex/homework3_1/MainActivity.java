package com.example.rex.homework3_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity{
    private DrawTest drawTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawTest=(DrawTest)findViewById(R.id.drawtest);
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
                drawTest.setShape("rect");//選擇rect就將drawTest的shape值set成"rect"
                Toast.makeText(MainActivity.this, getString(R.string.rect), Toast.LENGTH_SHORT).show();
                break;
            case R.id.circle:
                drawTest.setShape("circle");//選擇rect就將drawTest的shape值set成"circle"
                Toast.makeText(MainActivity.this, getString(R.string.circle), Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                drawTest.getPaint().setColor(Color.RED);//取得paint並設定顏色
                Toast.makeText(MainActivity.this, getString(R.string.red), Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                drawTest.getPaint().setColor(Color.BLUE);//取得paint並設定顏色
                Toast.makeText(MainActivity.this, getString(R.string.blue), Toast.LENGTH_SHORT).show();
                break;
        }
        drawTest.invalidate();//當switch全部設定後就將canvas(畫布)重畫
        return super.onOptionsItemSelected(item);
    }
}
