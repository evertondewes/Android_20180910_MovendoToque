package com.example.cnec.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout cl = findViewById(R.id.idTela);

        final TextView tv = findViewById(R.id.idX);


        cl.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.d("Evento",String.valueOf(motionEvent.getAction() ));
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        view.setBackgroundColor(Color.BLUE);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        tv.setText(String.valueOf(motionEvent.getRawX()));
                        break;
                    case MotionEvent.ACTION_UP:
                        view.setBackgroundColor(Color.RED);
                        break;
                }

                return true;
            }
        });
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        Log.d("Evento",String.valueOf(event.getAction() ));
//
//        return super.onTouchEvent(event);
//    }
}
