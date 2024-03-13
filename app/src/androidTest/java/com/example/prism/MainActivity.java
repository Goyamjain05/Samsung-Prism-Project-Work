package com.example.prism;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.adservices.ondevicepersonalization.OnDevicePersonalizationManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button versionButton = findViewById(R.id.versionButton);
        TextView versionTextView = findViewById(R.id.versionTextView);

        versionButton.setOnClickListener(v -> {
            // Assuming you have a method to get ODP version
            String odpVersion = getODPVersion();
            versionTextView.setText("ODP Version: " + odpVersion);
        });
    }

    // Dummy method to represent ODP version retrieval
    private String getODPVersion() {
        // Implement the actual logic to retrieve ODP version
        return "1.0"; // Placeholder version
    }
}
