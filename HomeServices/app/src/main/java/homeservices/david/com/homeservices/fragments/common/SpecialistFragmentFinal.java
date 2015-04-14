package homeservices.david.com.homeservices.fragments.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.ClickListener;

/**
 * Created by David on 14/04/15.
 */
public class SpecialistFragmentFinal extends MasterFragment {

    private Button btSpecialistFinal;

    public SpecialistFragmentFinal() {
        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_specialist_final,container,false);

        btSpecialistFinal = (Button)rootView.findViewById(R.id.btSpecialistFinal);

        btSpecialistFinal.setOnClickListener(new ClickListener(getActivity()));


        return rootView;
    }
}
