package homeservices.david.com.homeservices.fragments.other;

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
public class OtherMenuFragment extends MasterFragment {


    Button btTechnological;
    Button btGeneral;


    public OtherMenuFragment() {

        this.isMenu = true;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_other_menu,container,false);


        btTechnological = (Button) rootView.findViewById(R.id.btTechnological);
        btGeneral = (Button) rootView.findViewById(R.id.btGeneral);


        btTechnological.setOnTouchListener(new SwipeListener(activity));
        btGeneral.setOnTouchListener(new SwipeListener(activity));


        return rootView;
    }
}
