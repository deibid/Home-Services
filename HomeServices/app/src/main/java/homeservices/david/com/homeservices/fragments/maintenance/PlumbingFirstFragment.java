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
 * Created by David on 13/04/15.
 */
public class PlumbingFirstFragment extends MasterFragment {

    private Button btPlumbing;

    public PlumbingFirstFragment() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_plumbing_first,container,false);

        //btPlumbing = (Button) rootView.findViewById(R.id.btPlumbing);
        //btPlumbing.setOnTouchListener(new SwipeListener(activity));

        return rootView;
    }
}
