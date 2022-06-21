package com.besirkaraoglu.audiencebasednotificationapp

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import com.huawei.hms.push.HmsMessageService


class AbnaService: HmsMessageService() {
    val TAG = "AbnaService"

    override fun onNewToken(token: String, bundle: Bundle?) {
        // Obtain a push token.
        Log.i(TAG, "have received refresh token $token")

        // Check whether the token is null.
        if (!TextUtils.isEmpty(token)) {
            refreshedTokenToServer(token)
        }
    }

    private fun refreshedTokenToServer(token: String) {
        Log.i(TAG, "sending token to server. token:$token")
        FakeApi.setToken(token)
    }
}