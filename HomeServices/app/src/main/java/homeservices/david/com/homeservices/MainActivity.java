package homeservices.david.com.homeservices;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import homeservices.david.com.homeservices.adapters.ViewPagerAdapter;
import homeservices.david.com.homeservices.fragments.ZeroFragment;


public class MainActivity extends ActionBarActivity {


    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    private ArrayList<Fragment> mFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mViewPager = (ViewPager) findViewById(R.id.mainViewPager);




        mFragments = new ArrayList<>();
        mFragments.add(new ZeroFragment());

        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),mFragments,this);

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
}
