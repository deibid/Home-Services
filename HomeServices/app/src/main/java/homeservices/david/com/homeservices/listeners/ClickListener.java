package homeservices.david.com.homeservices.listeners;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.View;

import homeservices.david.com.homeservices.R;

/**
 * Created by David on 13/04/15.
 */
public class ClickListener implements View.OnClickListener {

    Context context;

    public ClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {

        Log.d("Click", "Clicked");

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

// 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("Prueba")
                .setTitle("Prueba");

// 3. Get the AlertDialog from create()
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
