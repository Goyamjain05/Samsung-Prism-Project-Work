package com.example.prism;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.adservices.exceptions.AdServicesException;
import android.adservices.ondevicepersonalization.OnDevicePersonalizationManager;
import android.adservices.ondevicepersonalization.AppInfo;
import android.adservices.ondevicepersonalization.IsolatedService;



public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button versionButton = findViewById(R.id.versionButton);
        TextView versionTextView = findViewById(R.id.versionTextView);

        versionButton.setOnClickListener(v -> {

            // Assuming you have a method to get ODP version
            boolean odpVersion = checkIfAppIsInstalled();
            if(odpVersion)
            versionTextView.setText("True");
            else
                versionTextView.setText("False");

        });
    }
    // Dummy method to represent ODP version retrieval
    private String getODPVersion() {
        // Implement the actual logic to retrieve ODP version
        return "1.0"; // Placeholder version
    }

    private AppInfo getAppInfo() {
        // Your code to retrieve an AppInfo instance for a specific app
        return null; // Placeholder return. Replace with actual AppInfo retrieval logic.
    }

    public boolean checkIfAppIsInstalled() {
        AppInfo appInfo = getAppInfo(); // Retrieve an AppInfo instance.
        if (appInfo != null) {
            return appInfo.isInstalled(); // Check if the app is installed.
        } else {
            return false; // AppInfo could not be retrieved.
        }
    }
}




