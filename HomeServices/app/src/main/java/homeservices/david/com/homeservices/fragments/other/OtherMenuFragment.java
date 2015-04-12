package homeservices.david.com.homeservices.fragments.other;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 12/04/15.
 */
public class OtherMenuFragment extends MasterFragment {

    public OtherMenuFragment() {

        this.isMenu = true;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_other_menu,container,false);
    }
}
