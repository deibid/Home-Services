package homeservices.david.com.homeservices.fragments.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.SwipeListener;

/**
 * Created by David on 14/04/15.
 */
public class OverviewFragmentFourh extends MasterFragment {

    private Button btOverview;


    public OverviewFragmentFourh() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_overview_fourth,container,false);


        btOverview = (Button)rootView.findViewById(R.id.btOverview);
        btOverview.setOnTouchListener(new SwipeListener(activity));

        return rootView;
    }
}
