package homeservices.david.com.homeservices.models;

import java.util.HashMap;

import homeservices.david.com.homeservices.R;

/**
 * Created by David on 13/04/15.
 */
public class Order {


    private HashMap<String,Integer> OrderInformation;

    private int[] mServices;


    private static Order ourInstance = new Order();

    public static Order getInstance() {
        return ourInstance;
    }

    private Order() {

        mServices = new int[] {

        };

    }
}
