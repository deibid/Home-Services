package homeservices.david.com.homeservices.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import homeservices.david.com.homeservices.R;

/**
 * Created by David on 10/04/15.
 */
public class ZeroFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_zero,container,false);

        return rootView;

    }
}
