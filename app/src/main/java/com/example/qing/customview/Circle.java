package com.example.qing.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Circle view ,create the circle view
 * @author qing
 */
public class Circle extends View {

    private int mColor;
    private float mRadius;

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
        //获取自定义view的参数
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,R.styleable.Circle,0,0);
        try {
            mColor = a.getColor(R.styleable.Circle_line_color,0x000000);
            mRadius = a.getDimension(R.styleable.Circle_side,16);
        }finally {
            a.recycle();
        }
    }

    //自定义的属性和事件
    public void addSide() {
        mRadius+=5.0;
        invalidate();
        requestLayout();
    }

    public void subSide(){
        if (mRadius>=5.0){
            mRadius-=5.0;
            invalidate();
            requestLayout();
        }else {
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(mColor);
        canvas.drawCircle(0,0,mRadius,paint);
    }
}