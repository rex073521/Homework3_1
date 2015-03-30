package com.example.rex.homework3_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by REX on 2015/3/28.
 */
public class DrawTest extends View{
    protected Paint paint=new Paint();
    protected Rect rect=new Rect();

    public DrawTest(Context context) {
        super(context);
    }

    public DrawTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawSetGet drawSG=new DrawSetGet();
        paint.setStrokeWidth(20);//畫筆寬度
        paint.setStyle(Paint.Style.FILL);//填滿形狀
        paint.setAntiAlias(true);//消除邊緣鋸齒

        rect.set(100,100,500,500);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect,paint);
//        rect.set(drawSG.getRectRight(), drawSG.getRectTop(), drawSG.getRectLeft(), drawSG.getRectBottom());
//        paint.setColor(Color.parseColor(drawSG.getColor()));//畫筆顏色
//        canvas.drawRect(rect,paint);//drawRect為畫方形的方法
//        canvas.drawCircle(drawSG.getX(),drawSG.getY(),drawSG.getRadius(),paint);//drawCircle為畫圓形的方法
    }

}

