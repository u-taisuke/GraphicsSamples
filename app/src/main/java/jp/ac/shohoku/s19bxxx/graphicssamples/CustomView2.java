package jp.ac.shohoku.s19bxxx.graphicssamples;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView2 extends View {

    public CustomView2(Context context) {
        super(context);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        int w = this.getWidth();
        int h = this.getHeight();

        Paint p = new Paint();
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.DKGRAY);
        canvas.drawRect(new Rect(5, 5, w-10, h-10),p);

        for(int i=0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Paint.Style.FILL);
            p2.setColor(Color.rgb(0, 25*i, 0));
            canvas.drawCircle(25*i+125, 25*i+125, 100, p2);
        }

    }
}
