package com.example.rex.homework3_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by REX on 2015/3/28.
 */
public class DrawTest extends View{
    private Paint paint;
    private String shape;
    private Rect rect = new Rect();
    public DrawTest(Context context) {
        super(context);
    }

    public DrawTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getPaint().setStrokeWidth(2f);//畫筆寬度
        getPaint().setStyle(Paint.Style.FILL);//填滿形狀
        getPaint().setAntiAlias(true);//消除邊緣鋸齒

        if(shape.equals("rect")) {
            rect.set(100, 100, 500, 500);
            canvas.drawRect(rect,getPaint());
        }else {
            canvas.drawCircle(100, 100, 300, getPaint());
        }

    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}

