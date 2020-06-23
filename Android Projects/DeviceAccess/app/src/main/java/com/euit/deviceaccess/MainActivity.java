package com.euit.deviceaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enableWifi(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(true);

        List<ScanResult> availableNetworks = wifiManager.getScanResults();
        if(availableNetworks.size() > 0){

            for(int i=0; i<availableNetworks.size(); i++){
                Log.d("WiFi-", availableNetworks.get(i).toString());
            }

        }
    }

    public void disableWifi(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(false);
    }
}
