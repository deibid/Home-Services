package homeservices.david.com.homeservices.fragments.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import homeservices.david.com.homeservices.R;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.listeners.SwipeListener;

/**
 * Created by David on 14/04/15.
 */
public class CommentSecondFragment extends MasterFragment {

    private EditText etComment;

    public CommentSecondFragment() {

        this.isMenu = false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_comments_second,container,false);

        etComment = (EditText) rootView.findViewById(R.id.etComment);


        etComment.setOnTouchListener(new SwipeListener(activity));


        return rootView;
    }
}
