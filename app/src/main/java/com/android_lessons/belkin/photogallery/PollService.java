package com.android_lessons.belkin.photogallery;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Belkin on 28.04.2015.
 */
public class PollService extends IntentService {
    private static final String TAG = "PollService";

    public PollService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Received an intent: " + intent);
    }
}
