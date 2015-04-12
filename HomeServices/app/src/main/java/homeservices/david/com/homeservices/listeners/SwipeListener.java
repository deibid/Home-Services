package homeservices.david.com.homeservices.listeners;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 10/04/15.
 */
public class SwipeListener implements View.OnTouchListener {

    private MasterFragment.Callback activity;

    float initX;
    float newX;

    private boolean done = false;

    private static final float MIN_SWIPE_DISTANCE = 8.00f;



    public SwipeListener(MasterFragment.Callback activiy) {
        this.activity = activiy;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {


        Log.d("Swipe Listener","Vista: "+v);

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:

                done = false;
                initX = event.getX();
                Log.d("Drag x DOWN", String.valueOf(initX));

                break;

            case MotionEvent.ACTION_MOVE:

                newX = event.getX();
                if(moveDirection() && !done){// a la derecha
                    Log.d("Drag x MOVE", "IZQUIERDA");
                    done = true;
                    activity.onSwipeView(v);
                }
                else Log.d("Drag x MOVE", "NADA");

                Log.d("Drag x MOVE", String.valueOf(newX));

                break;

        }

        return false;
    }



    private boolean moveDirection(){

        /*Este metodo devuelve true cuando hay un swipe
         a la derecha mayor a MIN_SWIPE_DISTANCE unidades*/

        if(Math.abs(newX - initX)>MIN_SWIPE_DISTANCE){
            return (newX - initX < 0) ? true:false;
        }

        return false;

    }
}
