package homeservices.david.com.homeservices.fragments.cleaning;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;


/**
 * Created by David on 10/04/15.
 */
public class CleaningFirstFragment extends MasterFragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cleaning_first,container,false);





        return v;

    }

    public String toString(){
        return "Soy CleaningFirstFragment";

    }






}
