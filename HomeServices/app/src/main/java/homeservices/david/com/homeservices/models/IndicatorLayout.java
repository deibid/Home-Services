package homeservices.david.com.homeservices.models;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.jar.Attributes;

import homeservices.david.com.homeservices.R;

/**
 * Created by David on 13/04/15.
 */
public class IndicatorLayout extends LinearLayout {

    private ArrayList<LinearLayout> mLayouts;
    Context context;

    private int[][] mColors;
    private int count;
    private int path;



    public static final int PATH_RED = 0;
    public static final int PATH_BLUE = 1;
    public static final int PATH_GREEN = 2;


    public IndicatorLayout(Context context,AttributeSet attr) {
        super(context,attr);
        this.context = context;
        mLayouts = new ArrayList<>();
        mColors = startColors();
        count = 0;

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.indicator, this, true);


    }

    public void setPath(int path){
        this.path = path;
        Log.e("Indicator-setPath", "Path: " + String.valueOf(this.path));
    }

    public void addLayout(){

    }


    public void removeLayout() {

    }


    public void firstCase(float positionOffset){

        //LinearLayout ll = new LinearLayout(context);
        //ll.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 0));
        //ll.setBackgroundColor(mColors[path][0]);
        //addView(ll);


        ((LinearLayout.LayoutParams)getChildAt(0).getLayoutParams()).weight = 1 - positionOffset;
        getChildAt(0).invalidate();
        ((LinearLayout.LayoutParams)getChildAt(1).getLayoutParams()).weight = positionOffset;
        getChildAt(1).invalidate();
        Log.d("firstCase", "childCount " + String.valueOf(getChildCount()));
        Log.d("firstCase", "child 0 weight " + String.valueOf(((LinearLayout.LayoutParams) getChildAt(0).getLayoutParams()).weight));
        Log.d("firstCase", "child 1 weight " + String.valueOf(((LinearLayout.LayoutParams) getChildAt(1).getLayoutParams()).weight));
        invalidate();

    }

    public void modifyLayout(float positionOffset){

        //Log.d("Indicator-modifyLayout", "Child count:" + String.valueOf(getChildCount()));
        //getChildAt(0).setAlpha(0.55f); 0 based


    }


    private int[][] startColors(){

        return new int[][]{

                {R.color.red_zero,R.color.red_one,R.color.red_two,
                        R.color.red_three,R.color.red_four,R.color.red_five},
                {R.color.blue_zero,R.color.blue_one,R.color.blue_two,
                        R.color.blue_three,R.color.blue_four,R.color.blue_five},
                {R.color.green_zero,R.color.green_one,R.color.green_two,
                        R.color.green_three,R.color.green_four,R.color.green_five}
        };
    }


















}
