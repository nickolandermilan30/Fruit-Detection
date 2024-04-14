package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    private TextView titleTextView;
    private TextView textTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        titleTextView = findViewById(R.id.title);
        textTextView = findViewById(R.id.text);

        // Set click listeners for borders
        View border1 = findViewById(R.id.border1);
        View border2 = findViewById(R.id.border2);
        View border3 = findViewById(R.id.border3);

        border1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border1 is clicked
                titleTextView.setText("Apple");
                textTextView.setText("This is information about apples.");
            }
        });

        border2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border2 is clicked
                titleTextView.setText("Banana");
                textTextView.setText("This is information about bananas.");
            }
        });

        border3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border3 is clicked
                titleTextView.setText("Orange");
                textTextView.setText("This is information about oranges.");
            }
        });
    }
}
