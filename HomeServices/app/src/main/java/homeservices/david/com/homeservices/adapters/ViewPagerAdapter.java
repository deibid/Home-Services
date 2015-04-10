package homeservices.david.com.homeservices.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by David on 10/04/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> mFragments;
    Context context;


    public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> mFragments, Context context) {
        super(fm);
        this.mFragments = mFragments;
        this.context = context;
    }

    public void setmFragments(ArrayList<Fragment> mFragments) {
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
}
