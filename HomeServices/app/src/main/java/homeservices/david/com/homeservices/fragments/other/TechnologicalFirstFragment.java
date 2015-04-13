package homeservices.david.com.homeservices.fragments.other;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 13/04/15.
 */
public class TechnologicalFirstFragment extends MasterFragment {

    public TechnologicalFirstFragment() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.technological_first_fragment,container,false);
    }
}
