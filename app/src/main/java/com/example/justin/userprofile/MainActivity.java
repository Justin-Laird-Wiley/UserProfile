package com.example.justin.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.name);
        TextView  birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        name.setText("Justin");
        birthday.setText("05/22/1964");
        country.setText("United States");

        ImageView someImage = findViewById(R.id.profile_picture);

        someImage.setImageResource(R.drawable.typewriter);

    }
}
