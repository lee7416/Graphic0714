package game.shooting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.study.graphic0714.R;

/**
 * Created by SeungHyun on 2015-07-14.
 */
public class GameView extends View {
    Bitmap trash;
    private int posX;



    private int posY;
    Paint paint;
    /*조이스틱,총알버튼의 크기*/
    RectF[] control=new RectF[5];
    int controlWidth=50;
    int controlHeight=50;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.trash);
        trash=Bitmap.createScaledBitmap(bitmap, 100, 100, false);
        paint=new Paint();
        paint.setColor(Color.BLUE);

        control[0]=new RectF(100,320,100+controlWidth,320+controlHeight);//up
        control[1]=new RectF(100,380,100+controlWidth,380+controlHeight);//down
        control[2]=new RectF(40,380,40+controlWidth,380+controlHeight);//left
        control[3]=new RectF(160,380,160+controlWidth,380+controlHeight);//right
        control[4]=new RectF(700,380,700+controlWidth,380+controlHeight);//
    }

    public void paintJoyStick(Canvas canvas){
        //up
        //for(int i=0;i<control.length;i++) {
            canvas.drawRect(control[0], paint);
        canvas.drawRect(control[1], paint);
        canvas.drawRect(control[2], paint);
        canvas.drawRect(control[3], paint);
        canvas.drawRect(control[4], paint);
        //}

        //down

        //left

        //right
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(trash, posX, posY, null);
        paintJoyStick(canvas);
    }
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
}
