package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    public class MyView extends View {
        Paint paint  = null;
        public MyView(Context context) {
            super(context);
            paint = new Paint();
        }
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int x = getWidth();
            int y = getHeight();
            int radius;
            radius = 100;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor("#FF0000"));
            canvas.drawCircle(300, 300, 100, paint);
            canvas.drawCircle(800, 300, 100, paint);
            canvas.drawLine(550, 450, 700, 600 , paint);
            canvas.drawLine(700, 600, 550, 750 , paint);
            canvas.drawCircle(100, 900, 50, paint);
            canvas.drawCircle(1000, 900, 50, paint);
            canvas.drawCircle(300, 1100, 50, paint);
            canvas.drawCircle(800, 1100, 50, paint);
            canvas.drawCircle(550, 1200, 50, paint);
        }

       }

}