package com.example.log_in;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.log_in.CloudMsgDemo.TAG;

public class MyFairbaseMessagingService extends FirebaseMessagingService {
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);
        //sendRegistrationToServer(token);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("fcm","message recieved : "+remoteMessage.getData().toString());
    }
}
