package homeservices.david.com.homeservices.fragments.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 14/04/15.
 */
public class ScheduleThirdFragment extends MasterFragment {

    public ScheduleThirdFragment() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_schedule_third,container,false);



        return rootView;
    }
}
