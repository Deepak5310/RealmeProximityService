/*
 * Copyright (c) 2020 Harshit Jain <god@hyper-labs.tech>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Purpose: BootCompleteReciever bootstrap class, allows RealmeProximityService
 * class to hook in and start the required listeners.
 *
 */

package co.hyper.proximityservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final String TAG = "RealmeProximityHelper";

    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.d(TAG, "Starting");
        context.startService(new Intent(context, RealmeProximityHelperService.class));
    }
}
