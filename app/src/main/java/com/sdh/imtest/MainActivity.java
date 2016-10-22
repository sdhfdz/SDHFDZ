package com.sdh.imtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.UserInfo;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String Token="C3AChBhk9/A9VA0OxxXaLoopV5YFFnt/I1o7qJoasiqIs/dN8VhzXp63zqZGDTvso17cSoX5QuFEQuYDGw6gig==";
//        String Token="qW3nbCCBOLm9UYKiEZieV0AyjF3YK/g/g0Tuv9xBL7v64qEj9tXpMs+RHrKQK4kWZUMy+BDGgFLdwObcF5b7dA==";
        RongIM.connect(Token, new RongIMClient.ConnectCallback(){
            @Override
            public void onSuccess(String s) {

            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {

            }

            @Override
            public void onTokenIncorrect() {

            }
        });
    }

    public void click(View view){
//        Intent intent=new Intent(MainActivity.this,ConversationActivity.class);
//        startActivity(intent);
        if (RongIM.getInstance() != null) {
            RongIM.getInstance().startPrivateChat(MainActivity.this,"456","hello");
        }
    }

    public void conversationList(View view){
        //启动会话列表界面
        if (RongIM.getInstance() != null)
            RongIM.getInstance().startConversationList(this);
    }

}
