package com.example.rex.homework3_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity{
    private DrawTest drawTest;
    private RelativeLayout relativeLayout;
    private List<DrawSetGet> draw=new ArrayList<>();


    public void findViews(){
        drawTest=(DrawTest)findViewById(R.id.drawtest);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        draw.add(new DrawSetGet("#9D9D9D",100,100,500,500));//紅色正方形
        draw.add(new DrawSetGet("#0080FF",100,100,500,500));//藍色正方形
        draw.add(new DrawSetGet("#9D9D9D",100,100,500));//紅色圓形
        draw.add(new DrawSetGet("#0080FF",100,100,500));//藍色圓形
        //要如何把我add進去的這些值在給drawTest.onDraw()

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
            case R.id.shape:
                Toast.makeText(MainActivity.this, getString(R.string.shape), Toast.LENGTH_SHORT).show();
                break;
            case R.id.rect:
                drawTest.rect.set(100,100,500,500);//只能用這種方式嗎?
                drawTest.paint.setColor(Color.RED);
                Toast.makeText(MainActivity.this, getString(R.string.rect), Toast.LENGTH_SHORT).show();
                break;
            case R.id.circle:
                Toast.makeText(MainActivity.this, getString(R.string.circle), Toast.LENGTH_SHORT).show();
                break;
            case R.id.color:
                Toast.makeText(MainActivity.this, getString(R.string.color), Toast.LENGTH_SHORT).show();
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
