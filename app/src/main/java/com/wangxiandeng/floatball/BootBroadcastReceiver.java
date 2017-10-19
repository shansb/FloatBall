package com.wangxiandeng.floatball;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by deepinair on 17-10-13.
 */

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service = new Intent(context,FloatBallService.class);
        Bundle data = new Bundle();
        data.putInt("type", FloatBallService.TYPE_ADD);
        service.putExtras(data);
        context.startService(service);
    }
}
