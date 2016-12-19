package com.leavesified.android.wordpressfeeds.feedservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceStartIntent = new Intent(context, FeedService.class);
        context.startService(serviceStartIntent);
    }
}
