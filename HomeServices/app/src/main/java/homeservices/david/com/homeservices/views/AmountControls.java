package homeservices.david.com.homeservices.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import homeservices.david.com.homeservices.R;

/**
 * Created by David on 13/04/15.
 */
public class AmountControls extends LinearLayout implements View.OnClickListener{

    private Button btMinus;
    private TextView tvQuantity;
    private Button btPlus;

    Context context;


    private static final int MAX_CONTROL_QUANTITY = 9;

    public AmountControls(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.context = context;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.amount_controls, this, true);

        LinearLayout ll = ((LinearLayout)getChildAt(0));
        btMinus = (Button)ll.getChildAt(0);
        tvQuantity = (TextView)ll.getChildAt(1);
        btPlus = (Button)ll.getChildAt(2);

        Log.d("Controls", String.valueOf(((LinearLayout) getChildAt(0)).getChildCount()));

        btMinus.setOnClickListener(this);
        btPlus.setOnClickListener(this);

        tvQuantity.setText("0");

    }

    @Override
    public void onClick(View v) {

        //Toast.makeText(context,"Click",Toast.LENGTH_SHORT).show();

        String s = (String)tvQuantity.getText();
        int quantity = Integer.parseInt(s);


        if(quantity >-1 && quantity <= MAX_CONTROL_QUANTITY) {
            if (v.equals(btMinus))
                if(quantity!=0) quantity--;
            if (v.equals(btPlus))
                if (quantity != MAX_CONTROL_QUANTITY) quantity++;
        }


        tvQuantity.setText(String.valueOf(quantity));

    }

    public String getQuantity() {

        return (String)tvQuantity.getText();
    }
}
