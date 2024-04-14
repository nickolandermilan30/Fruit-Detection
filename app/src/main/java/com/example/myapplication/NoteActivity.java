package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    private TextView titleTextView;
    private TextView textTextView;
    private ImageButton captureButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        titleTextView = findViewById(R.id.title);
        textTextView = findViewById(R.id.text);
        captureButton = findViewById(R.id.capture); // Initialize ImageButton

        captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the activity to navigate to upon button click
                Intent intent = new Intent(NoteActivity.this, CaptureActivity.class);
                startActivity(intent); // Start the new activity
            }
        });


        // Set initial text and title to border2's content
        titleTextView.setText("Banana");
        textTextView.setText("A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. " +
                "In some countries, cooking bananas are called plantains, distinguishing them from dessert bananas.");

        // Set click listeners for borders
        View border1 = findViewById(R.id.border1);
        View border2 = findViewById(R.id.border2);
        View border3 = findViewById(R.id.border3);

        border1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border1 is clicked
                titleTextView.setText("Apple");
                textTextView.setText("An apple is a round, edible fruit produced by an apple tree. " +
                        "Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. " +
                        "The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found.");
            }
        });

        border2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border2 is clicked
                titleTextView.setText("Banana");
                textTextView.setText("A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. " +
                        "In some countries, cooking bananas are called plantains, distinguishing them from dessert bananas.");
            }
        });

        border3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update title and text when border3 is clicked
                titleTextView.setText("Orange");
                textTextView.setText("An orange, also called sweet orange to distinguish it from the bitter orange Citrus × aurantium, is the fruit of a tree in the family Rutaceae. " +
                        "Botanically, this is the hybrid Citrus × sinensis, between the pomelo and the mandarin orange. " +
                        "The chloroplast genome, and therefore the maternal line, is that of pomelo.");
            }
        });
    }
}
