package edu.tjrac.swant.facedetector_sample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView  imageView = new ImageView(this);
        setContentView(imageView);

        Intent imageIntent = getIntent();
        imageView.setImageURI(imageIntent.getData());
    }
}
