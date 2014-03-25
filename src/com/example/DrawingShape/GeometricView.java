package com.example.DrawingShape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

public class GeometricView extends View{
    private ShapeDrawable shapesRect;
    private ShapeDrawable shapesCirc;
    public GeometricView(Context context) {
        super(context);
        makeShapes();
        makeCircle();
    }

    public GeometricView(Context context, AttributeSet attrs) {
        super(context, attrs);
        makeShapes();
    }

    public void makeShapes(){
        shapesRect = new ShapeDrawable(new RectShape());
        shapesRect.setBounds(10,10,760,760);

    }
    public void makeCircle(){
        shapesCirc = new ShapeDrawable(new OvalShape());
        shapesCirc.setBounds(10,10,760,760);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        shapesRect.getPaint().setARGB(255,255,0,0); //Red
        shapesRect.draw(canvas);
    }

}
