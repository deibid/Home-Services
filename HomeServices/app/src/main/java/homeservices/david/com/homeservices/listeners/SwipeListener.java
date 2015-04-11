package homeservices.david.com.homeservices.listeners;

import android.view.MotionEvent;
import android.view.View;

import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 10/04/15.
 */
public class SwipeListener implements View.OnTouchListener {

    private MasterFragment.Callback activity;

    public SwipeListener(MasterFragment.Callback activiy) {
        this.activity = activiy;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:
                activity.onSwipeView(v);
                break;

        }

        return false;
    }
}
