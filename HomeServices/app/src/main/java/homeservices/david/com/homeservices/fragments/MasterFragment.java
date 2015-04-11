package homeservices.david.com.homeservices.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by David on 10/04/15.
 */
public class MasterFragment extends Fragment {

    protected Callback activity;

    public static final int ZERO_CODE = 0;
    public static final int C_F_CODE = 10;

    protected int id;




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (Callback)activity;

    }



    public interface Callback{
        void onSwipeView(View v);
    }



}
