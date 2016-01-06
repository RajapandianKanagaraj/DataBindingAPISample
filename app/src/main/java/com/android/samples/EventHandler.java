package com.android.samples;

import android.view.View;
import android.widget.Toast;

/**
 * Created by a6000388 on 1/5/16.
 */
public class EventHandler {

    public void onClickAdult(View view){
        Toast.makeText(view.getContext(), "Yes, he is an Adult", Toast.LENGTH_LONG).show();
    }

    public void onClickNotAdult(View view){
        Toast.makeText(view.getContext(), "Yes, he is not an Adult", Toast.LENGTH_LONG).show();
    }
}
