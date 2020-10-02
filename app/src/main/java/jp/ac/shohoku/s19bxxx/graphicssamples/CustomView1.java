package jp.ac.shohoku.s19bxxx.graphicssamples;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView1 extends View {
    protected Paint p1, p2;

    public CustomView1(Context context) {
        super(context);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLUE);

        int w = this.getWidth();
        int h = this.getHeight();

        Paint p1 = initPaint(Paint.Style.STROKE, Color.DKGRAY);
        canvas.drawRect(new Rect(5, 5, w-10, h-10),p1);

        for(int i=0; i<10; i++){
            Paint p2 = initPaint(Paint.Style.FILL, Color.rgb(25 * i, 0, 0));
            canvas.drawCircle(25*i+125, 25*i+125, 100, p2);
        }
    }

    private Paint initPaint(Paint.Style stroke, int dkgray) {
        Paint p = new Paint();
        p.setStyle(stroke);
        p.setColor(dkgray);
        return p;
    }


}
