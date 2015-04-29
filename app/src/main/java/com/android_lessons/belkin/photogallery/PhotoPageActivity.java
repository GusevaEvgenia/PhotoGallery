package com.android_lessons.belkin.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by Belkin on 28.04.2015.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
