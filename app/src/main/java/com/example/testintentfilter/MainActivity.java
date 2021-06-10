package com.example.testintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("calc://go_to_calculator");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.putExtra("msg", "this app open from other app");
                startActivity(Intent.createChooser(intent, null));
            }
        });
    }
}