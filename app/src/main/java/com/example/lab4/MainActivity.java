package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onActivity(int requestCode, int resultCode, Intent data) {
        String temp = "";
        switch(data.getIntExtra("ic_logo_00", R.id.teamNone)) {
            case R.id.teamNone:
                temp = "ic_logo_00";
                break;
            case R.id.team1:
                temp = "ic_logo_00";
                break;
            case R.id.team2:
                temp = "ic_logo_00";
                break;
            case R.id.team3:
                temp = "ic_logo_00";
                break;
            case R.id.team4:
                temp = "ic_logo_00";
                break;
        }
        ImageView avatar = (ImageView)findViewById(R.id.avatarImage);
        avatar.setImageResource(getResources().getIdentifier(temp, "drawable", getPackageName()));
    }

    public void openMaps(View view) {
        EditText inputZip = findViewById(R.id.editZip);
        String zip = "" + inputZip.getText();

        if (zip.length() != 0) {
            maps(zip);
        }
    }

    public void maps(String address) {
        Intent test = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/" + address));
        startActivity(test);
    }

    public void OnSetAvatarButton(View view) {
        Intent intent = new Intent(getApplicationContext(), AvatarActivity.class);
        startActivityForResult (intent,0);
    }

}