package com.example.abidinflexiblenavdraw;

import android.support.annotation.Nullable;
import android.view.View;



public interface FantasyListener {

    boolean onHover(@Nullable View view, int index);


    boolean onSelect(View view, int index);


    void onCancel();
}
