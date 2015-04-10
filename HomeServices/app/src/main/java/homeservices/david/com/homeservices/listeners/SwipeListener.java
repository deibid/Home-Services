package homeservices.david.com.homeservices.listeners;

import android.view.View;

import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 10/04/15.
 */
public class SwipeListener implements View.OnClickListener {

    private MasterFragment.Callback activity;

    public SwipeListener(MasterFragment.Callback activiy) {
        this.activity = activiy;
    }

    @Override
    public void onClick(View v) {
        activity.onSwipeView(v);
    }
}
