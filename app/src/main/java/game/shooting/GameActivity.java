package game.shooting;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.study.graphic0714.R;

/**
 * Created by SeungHyun on 2015-07-14.
 */
public class GameActivity extends Activity{
    GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameView=(GameView)findViewById(R.id.gameView);
        
    }

    //우주선을 날리자 Bitmap 의 X푹을 변경우
    public void moveShip(){
        int x=gameView.getPosX();
        x+=8;
        gameView.setPosX(x);
        gameView.invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        moveShip();
        return super.onTouchEvent(event);
    }
}
