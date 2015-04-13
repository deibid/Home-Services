package homeservices.david.com.homeservices.listeners;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import java.util.ArrayList;

import homeservices.david.com.homeservices.adapters.ViewPagerAdapter;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.models.IndicatorLayout;

/**
 * Created by David on 11/04/15.
 */
public class PageListener extends ViewPager.SimpleOnPageChangeListener {

    ArrayList<MasterFragment> mFragments;
    ViewPagerAdapter mAdapter;
    IndicatorLayout mIndicator;
    Context context;


    private boolean pageChanged = false;
    private int position;

    private boolean freshSwipe = true;

    public PageListener(ArrayList<MasterFragment> mFragments,ViewPagerAdapter adapter,IndicatorLayout indicator,Context context) {
        this.mFragments = mFragments;
        this.mAdapter = adapter;
        this.mIndicator = indicator;
        this.context = context;
    }

    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);

        pageChanged = true;
        this.position = position;



    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);


        Log.d("Scrolling","position: " + String.valueOf(position));
        Log.d("Scrolling","positionOffset: " + String.valueOf(positionOffset));
        Log.d("Scrolling", "positionOffsetPixels: " + String.valueOf(positionOffsetPixels));


        freshSwipe = false;
        if(positionOffset == 0) freshSwipe = true;


       // mIndicator.modifyLayout(positionOffset);


        Log.d("Scrolling","childCount: " + String.valueOf(mIndicator.getChildCount()));

        /*Desde fragment zero*/
       // if(position == 0 && mIndicator.getChildCount()==1){
            mIndicator.firstCase(positionOffset);
        //}





    }

    @Override
    public void onPageScrollStateChanged(int state) {
        super.onPageScrollStateChanged(state);

        switch (state){
            case ViewPager.SCROLL_STATE_DRAGGING:
                break;
            case ViewPager.SCROLL_STATE_IDLE:
            /*Make sure killChildren gets called after the animation ends*/
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
