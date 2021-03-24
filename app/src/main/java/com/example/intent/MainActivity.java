package com.example.intent;

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
    }

    public void call(View view) {
        Uri uri= Uri.parse("tel:");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void openWebsite(View view) {
        Uri uri= Uri.parse("https://www.youtube.com/");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}