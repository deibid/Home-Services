package homeservices.david.com.homeservices.fragments.cleaning;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


    public CleaningFirstFragment() {

        isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cleaning_first,container,false);




        btCleaningRooms = (Button) v.findViewById(R.id.btCleaningRooms);
        btCleaningBathrooms = (Button) v.findViewById(R.id.btCleaningBathrooms);
        btCleaningClothes = (Button) v.findViewById(R.id.btCleaningClothes);
        btCleaningParty = (Button) v.findViewById(R.id.btCleaningParty);
        btCleaningKitchen = (Button) v.findViewById(R.id.btCleaningKitchen);



        btCleaningBathrooms.setOnClickListener(new ClickListener(getActivity()));



        return v;

    }

    public String toString(){
        return "Soy CleaningFirstFragment";

    }









}
