package homeservices.david.com.homeservices;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashSet;

import homeservices.david.com.homeservices.adapters.ViewPagerAdapter;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.fragments.ZeroFragment;
import homeservices.david.com.homeservices.fragments.cleaning.CleaningFirstFragment;
import homeservices.david.com.homeservices.fragments.common.CommentSecondFragment;
import homeservices.david.com.homeservices.fragments.common.ScheduleThirdFragment;
import homeservices.david.com.homeservices.fragments.maintenance.ElectricFirstFragment;
import homeservices.david.com.homeservices.fragments.maintenance.GardeningFirstFragment;
import homeservices.david.com.homeservices.fragments.maintenance.MaintenanceMenuFragment;
import homeservices.david.com.homeservices.fragments.maintenance.PlumbingFirstFragment;
import homeservices.david.com.homeservices.fragments.other.GeneralFirstFragment;
import homeservices.david.com.homeservices.fragments.other.OtherMenuFragment;
import homeservices.david.com.homeservices.fragments.other.TechnologicalFirstFragment;
import homeservices.david.com.homeservices.listeners.PageListener;
import homeservices.david.com.homeservices.models.IndicatorLayout;


public class MainActivity extends ActionBarActivity implements MasterFragment.Callback{

    private IndicatorLayout mIndicator;

    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    private ArrayList<MasterFragment> mFragments;

    private int count = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mIndicator = (IndicatorLayout)findViewById(R.id.indicator);


        mFragments = new ArrayList<>();
        mFragments.add(new ZeroFragment());
        count++;
        mViewPager = (ViewPager) findViewById(R.id.mainViewPager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),mFragments,this);


        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setOnPageChangeListener(new PageListener(mFragments,mViewPagerAdapter,mIndicator,this));









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSwipeView(View v) {
        nextView(v);
    }

    private void nextView(View v){



        MasterFragment f = getNextFragment(v.getId());




        /*Verify that that page doesnt already exist*/
        if(!compareDuplicates(f)) {
            //Log.d("FRAGMENT", "DOESNT EXISTS");
            mFragments.add(f);
            count++;
            //Log.d("Count",String.valueOf(count));
            mViewPagerAdapter.notifyDataSetChanged();
            //mViewPager.setCurrentItem(mFragments.size()-1);
        }
        else{
            //mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
        }



    }


    private MasterFragment getNextFragment(int id){

        switch (id){

            case R.id.btZeroCleaning:
                mIndicator.setPath(IndicatorLayout.PATH_RED);
                return new CleaningFirstFragment();
            case R.id.btZeroMaintenance:
                mIndicator.setPath(IndicatorLayout.PATH_BLUE);
                return new MaintenanceMenuFragment();
            case R.id.btZeroOther:
                mIndicator.setPath(IndicatorLayout.PATH_GREEN);
                return new OtherMenuFragment();

            case R.id.btPlumbing:
                return new PlumbingFirstFragment();
            case R.id.btGardening:
                return new GardeningFirstFragment();
            case R.id.btElectric:
                return new ElectricFirstFragment();

            case R.id.btTechnological:
                return new TechnologicalFirstFragment();
            case R.id.btGeneral:
                return new GeneralFirstFragment();

            case R.id.btCleaningRooms:
            case R.id.btCleaningBathrooms:
            case R.id.btCleaningClothes:
            case R.id.btCleaningParty:
            case R.id.btCleaningKitchen:
            case R.id.cleaningMainLayout:
                return new CommentSecondFragment();

            case R.id.etComment:
                return new ScheduleThirdFragment();




        }

        return null;

    }

    private boolean compareDuplicates(Fragment f){


        for(Fragment fragment: mFragments){
            if(f.getClass().equals(fragment.getClass())){
                return true;
            }

        }

        return false;

    }







}
