package com.firstexample.emarkova.session5;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {
    private final Random mGenerator = new Random();

    public MyIntentService() {
        super("");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while (true) {
            Intent broadcastIntent = new Intent("emarkova.GET_NUMBER");
            broadcastIntent.putExtra("number", getRandomNumber().toString());
            sendBroadcast(broadcastIntent);
            try {
                TimeUnit.SECONDS.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public Integer getRandomNumber() {
        return mGenerator.nextInt(100);
    }
}
