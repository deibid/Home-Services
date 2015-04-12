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
    private boolean pageChanged = false;
    private int position;

    public PageListener(ArrayList<MasterFragment> mFragments,ViewPagerAdapter adapter) {
        this.mFragments = mFragments;
        this.mAdapter = adapter;
    }

    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);

        pageChanged = true;
        this.position = position;



    }

    @Override
    public void onPageScrollStateChanged(int state) {
        super.onPageScrollStateChanged(state);

        switch (state){
            case ViewPager.SCROLL_STATE_DRAGGING:
                break;
            case ViewPager.SCROLL_STATE_IDLE:
                if(pageChanged) {
                    pageChanged = false;
                    Log.d("Page Listener", "Pagina-> " + String.valueOf(position));
                    MasterFragment f = mFragments.get(position);
                    if (f.isMenu())
                        killChildren(position);
                }

                break;
            case ViewPager.SCROLL_STATE_SETTLING:
                break;
        }


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
