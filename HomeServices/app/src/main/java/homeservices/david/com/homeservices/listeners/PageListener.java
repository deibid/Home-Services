package homeservices.david.com.homeservices.listeners;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;

import java.util.ArrayList;

import homeservices.david.com.homeservices.adapters.ViewPagerAdapter;
import homeservices.david.com.homeservices.fragments.MasterFragment;

/**
 * Created by David on 11/04/15.
 */
public class PageListener extends ViewPager.SimpleOnPageChangeListener {

    ArrayList<MasterFragment> mFragments;
    ViewPagerAdapter mAdapter;


    public PageListener(ArrayList<MasterFragment> mFragments,ViewPagerAdapter adapter) {
        this.mFragments = mFragments;
        this.mAdapter = adapter;
    }

    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);

        Log.d("Page Listener", "Pagina-> " + String.valueOf(position));

        if()
        MasterFragment f = mFragments.get(position);

        if(f.isMenu())
            killChildren(position);


    }


    public boolean killChildren(int from){

        Log.d("Kill","from: "+String.valueOf(from));

        for(int i = from+1; i<=mFragments.size()-1;i++) {
            mFragments.remove(i);
            mAdapter.setmFragments(mFragments);
            mAdapter.notifyDataSetChanged();
            Log.d("Kill",String.valueOf(mFragments.size()));
        }

        return true;

    }
}
