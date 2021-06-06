package com.example.practicepgm7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    Demoview demoview;
    Paint paint = new Paint();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class Demoview extends View{

        public Demoview(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);

            paint.setColor(Color.RED);
            canvas.drawLine(30,10,30,100,paint);

            paint.setColor(Color.GREEN);
            canvas.drawCircle(100,200,50,paint);

            paint.setColor(Color.BLUE);
            canvas.drawRect(200,50,300,120,paint);
        }
    }
}
