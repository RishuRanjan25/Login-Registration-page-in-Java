package com.example.mada;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        ImageView imageView = findViewById(R.id.imageView3);

        // Set the clipToOutline property to true to make the ImageView round
        imageView.setClipToOutline(true);

        // Create a round shape and set it as the background for the ImageView
        GradientDrawable roundShape = new GradientDrawable();
        roundShape.setShape(GradientDrawable.OVAL);

        roundShape.setSize(imageView.getWidth(), imageView.getHeight());
        imageView.setBackground(roundShape);
    }

    public void login(View view) {
        String user = username.getText().toString();
        String pass = password.getText().toString();

        if (user.equals("admin") && pass.equals("admin")) {
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }

    public void registerNewUser(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this,
                Mainactivity3.class);
        startActivity(intent);
    }
}