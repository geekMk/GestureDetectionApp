package com.example.architpc.gestureapp;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private static TextView textView;//define veriable
    private GestureDetectorCompat GestureDetect;//create instance of GestureDetect instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cast textview
        textView=(TextView)findViewById(R.id.textview);
          //make instance of gesture detect and pass contextof the same class
        GestureDetect= new GestureDetectorCompat(this,this);
        GestureDetect.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       GestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
     textView.setText("onSingleTapConfirmed"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        textView.setText("onDoubleTapConfirmed"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        textView.setText("onDoubleTapEvent"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        textView.setText("onDown"+motionEvent.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

        textView.setText("onshowpress"+motionEvent.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        textView.setText("onSingletapup"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
     textView.setText("onScroll"+motionEvent.toString()+motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
     textView.setText("onLongpress"+motionEvent.toString());
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("onFling"+motionEvent1);
        return false;
    }
}
