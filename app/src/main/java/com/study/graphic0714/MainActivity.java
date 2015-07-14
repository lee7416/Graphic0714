package com.study.graphic0714;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    ArrayList<Point> list=new ArrayList<Point>();

    String TAG;
    MyView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG=this.getClass().getName();

        myView=(MyView)findViewById(R.id.myView);

    }

    public void printOval(ArrayList list){
        /*정해진 좌표를 이용하여 MyView 다시 그리기*/
        myView.list=list;
        myView.invalidate();


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int X=(int)event.getX();
        int Y=(int)event.getY();
        Point point=new Point((int)event.getX(),(int)event.getY());
        list.add(point);
        printOval(list);
        return false;
    }
}
