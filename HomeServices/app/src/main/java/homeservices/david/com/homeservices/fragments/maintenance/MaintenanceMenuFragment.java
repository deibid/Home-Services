package homeservices.david.com.homeservices.fragments.maintenance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.SwipeListener;

/**
 * Created by David on 12/04/15.
 */
public class MaintenanceMenuFragment extends MasterFragment {

    Button btPlumbing;
    Button btGardening;
    Button btElectric;



    public MaintenanceMenuFragment() {
        this.isMenu = true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_maintenance_menu,container,false);
        btPlumbing = (Button) rootView.findViewById(R.id.btPlumbing);
        btGardening = (Button) rootView.findViewById(R.id.btGardening);
        btElectric = (Button) rootView.findViewById(R.id.btElectric);

        btPlumbing.setOnTouchListener(new SwipeListener(activity));
        btGardening.setOnTouchListener(new SwipeListener(activity));
        btElectric.setOnTouchListener(new SwipeListener(activity));


        return rootView;
    }
}
