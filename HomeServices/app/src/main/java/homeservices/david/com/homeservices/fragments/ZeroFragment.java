package homeservices.david.com.homeservices.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.listeners.SwipeListener;


/**
 * Created by David on 10/04/15.
 */
public class ZeroFragment extends MasterFragment{

    private Button mButtonCleaning;
    private Button mButtonMaintenance;
    private Button mButtonOther;


    public ZeroFragment() {

       isMenu = true;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_zero,container,false);


        mButtonCleaning = (Button) rootView.findViewById(R.id.btZeroCleaning);
        mButtonMaintenance = (Button) rootView.findViewById(R.id.btZeroMaintenance);
        mButtonOther = (Button) rootView.findViewById(R.id.btZeroOther);

        mButtonCleaning.setOnTouchListener(new SwipeListener(activity));
        mButtonMaintenance.setOnTouchListener(new SwipeListener(activity));
        mButtonOther.setOnTouchListener(new SwipeListener(activity));




        return rootView;

    }



    public String toString(){
        return "Soy ZeroFragment";
    }




}
