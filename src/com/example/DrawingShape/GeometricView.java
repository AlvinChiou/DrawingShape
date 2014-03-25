package com.example.DrawingShape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

public class GeometricView extends View{
    private ShapeDrawable shapes;
    public GeometricView(Context context) {
        super(context);
        makeShapes();
    }

    public GeometricView(Context context, AttributeSet attrs) {
        super(context, attrs);
        makeShapes();
    }
    public void makeShapes(){
        shapes = new ShapeDrawable(new RectShape());
        shapes.setBounds(10,10,760,760);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
