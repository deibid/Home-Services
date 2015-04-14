package homeservices.david.com.homeservices.fragments.cleaning;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.NumberPicker;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.ClickListener;
import homeservices.david.com.homeservices.listeners.SwipeListener;


/**
 * Created by David on 10/04/15.
 */
public class CleaningFirstFragment extends MasterFragment {


    private Button btCleaningRooms;
    private Button btCleaningBathrooms;
    private Button btCleaningClothes;
    private Button btCleaningParty;
    private Button btCleaningKitchen;

    private LinearLayout mainLayout;


    public CleaningFirstFragment() {

        isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cleaning_first,container,false);




        btCleaningRooms = (Button) rootView.findViewById(R.id.btCleaningRooms);
        btCleaningBathrooms = (Button) rootView.findViewById(R.id.btCleaningBathrooms);
        btCleaningClothes = (Button) rootView.findViewById(R.id.btCleaningClothes);
        btCleaningParty = (Button) rootView.findViewById(R.id.btCleaningParty);
        btCleaningKitchen = (Button) rootView.findViewById(R.id.btCleaningKitchen);

        mainLayout = (LinearLayout) rootView.findViewById(R.id.cleaningMainLayout);
        mainLayout.setOnTouchListener(new SwipeListener(activity));


        btCleaningBathrooms.setOnClickListener(new ClickListener(getActivity()));



        btCleaningRooms.setOnTouchListener(new SwipeListener(activity));
        btCleaningBathrooms.setOnTouchListener(new SwipeListener(activity));
        btCleaningClothes.setOnTouchListener(new SwipeListener(activity));
        btCleaningParty.setOnTouchListener(new SwipeListener(activity));
        btCleaningKitchen.setOnTouchListener(new SwipeListener(activity));



        return rootView;

    }

    public String toString(){
        return "Soy CleaningFirstFragment";

    }









}
