package com.swpuiot.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button sendnotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        sendnotice= (Button) findViewById(R.id.btn_send_notice);
        sendnotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_send_notice:
                NotificationManager manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification notification=new Notification(R.drawable.ic_launcher,
                        "this is tickt text",System.currentTimeMillis());
                notification.setLatestEventInfo(this,"this is context title","this is context text",null);
                manager.notify(1,notification);
                break;
            default:
                break;
        }

    }
}
