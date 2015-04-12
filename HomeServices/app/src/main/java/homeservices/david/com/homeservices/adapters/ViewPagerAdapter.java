package homeservices.david.com.homeservices.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;

import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 10/04/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    ArrayList<MasterFragment> mFragments;
    Context context;


    public ViewPagerAdapter(FragmentManager fm, ArrayList<MasterFragment> mFragments, Context context) {
        super(fm);
        this.mFragments = mFragments;
        this.context = context;
    }

    public void setmFragments(ArrayList<MasterFragment> mFragments) {
        this.mFragments = mFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return (mFragments != null) ? mFragments.size():0;
    }


    @Override
    public int getItemPosition(Object object) {

        Log.d("getItemPosition","Aqui estoy");
        return PagerAdapter.POSITION_NONE;
    }




}
