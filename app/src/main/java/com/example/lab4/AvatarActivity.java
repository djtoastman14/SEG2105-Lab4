package com.example.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void avatar(View view){
        Intent returnIntent = new Intent();
        ImageView avatar = (ImageView)view;
        returnIntent.putExtra("imageID",avatar.getId());
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}
