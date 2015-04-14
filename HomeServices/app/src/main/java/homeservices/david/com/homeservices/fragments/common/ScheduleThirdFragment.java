package homeservices.david.com.homeservices.fragments.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.SwipeListener;

/**
 * Created by David on 14/04/15.
 */
public class ScheduleThirdFragment extends MasterFragment {


    private Button tvSchedule;
    public ScheduleThirdFragment() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_schedule_third,container,false);


        tvSchedule = (Button)rootView.findViewById(R.id.tvSchedule);

        tvSchedule.setOnTouchListener(new SwipeListener(activity));


        return rootView;
    }
}
