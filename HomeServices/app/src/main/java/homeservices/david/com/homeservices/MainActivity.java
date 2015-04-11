package homeservices.david.com.homeservices;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.HashSet;

import homeservices.david.com.homeservices.adapters.ViewPagerAdapter;
import homeservices.david.com.homeservices.fragments.MasterFragment;
import homeservices.david.com.homeservices.fragments.ZeroFragment;
import homeservices.david.com.homeservices.fragments.cleaning.CleaningFirstFragment;


public class MainActivity extends ActionBarActivity implements MasterFragment.Callback{


    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    private ArrayList<Fragment> mFragments;

    private int count = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mFragments = new ArrayList<>();
        mFragments.add(new ZeroFragment());
        count++;
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),mFragments,this);

        mViewPager = (ViewPager) findViewById(R.id.mainViewPager);
        mViewPager.setAdapter(mViewPagerAdapter);








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


        Log.d("onViewSwipe", String.valueOf(v.getId()));
        Fragment f = getNextFragment(v.getId());


        if(f == null){
            Log.e("FRAGMENT", "NULL");
        }
        else{
            Log.e("FRAGMENT", f.toString());
        }

        /*Verify that that page doesnt already exist*/
        if(!compareDuplicates(f)) {
            Log.d("FRAGMENT", "DOESNT EXISTS");
            mFragments.add(f);
            count++;
            Log.d("Count",String.valueOf(count));
            mViewPagerAdapter.notifyDataSetChanged();
            //mViewPager.setCurrentItem(mFragments.size()-1);
        }
        else{
            mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
        }



    }


    private Fragment getNextFragment(int id){

        switch (id){

            case R.id.btZeroCleaning:
                return new CleaningFirstFragment();

        }

        return null;

    }





    private boolean compareDuplicates(Fragment f){


        for(Fragment fragment: mFragments){
            int idF = f.getId(); //for debugging
            int idFrag = fragment.getId(); //for debugging

            if(f.getClass().equals(fragment.getClass())){
                return true;
            }

        }

        return false;

    }







}
