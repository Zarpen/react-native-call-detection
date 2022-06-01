package com.pritesh.calldetection;

import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.CallStateListener;

import androidx.annotation.RequiresApi;


@RequiresApi(api = Build.VERSION_CODES.S)
abstract class CallDetectionCallStateListener extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    @Override
    abstract public void onCallStateChanged(int state);
}