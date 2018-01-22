package com.thl.floateutil;

import android.content.Context;
import android.view.LayoutInflater;

import com.thl.floate.DragView;

/**
 *  16/10/25.
 */

public class SimpleView extends DragView {
    public SimpleView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.float_simple, this);
    }

}
