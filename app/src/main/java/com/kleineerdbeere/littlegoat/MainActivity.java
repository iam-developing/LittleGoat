package com.kleineerdbeere.littlegoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameButton = (Button) findViewById(R.id.btn_game);
        gameButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openGameActivity();
            }
        });


    }

    public void openGameActivity() {
        Intent intent = new Intent(this, ActivityCategory.class);
        startActivity(intent);
    }
}
