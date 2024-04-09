package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Itakda ang layout

        // Hanapin ang button gamit ang ID
        Button getStartedButton = findViewById(R.id.next);

        // Magdagdag ng OnClickListener sa button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lumikha ng Intent para sa NoteActivity
                Intent intent = new Intent(HomeActivity.this, NoteActivity.class);
                // Simulan ang NoteActivity
                startActivity(intent);
            }
        });
    }
}
