package com.example.magaz.draganddraw.views.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.example.magaz.draganddraw.R;
import com.example.magaz.draganddraw.views.fragments.DragAndDrawFragment;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
