package com.example.color1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int[] mColorChoices =
            { Color.BLUE, Color.CYAN,
                    Color.DKGRAY, Color.GRAY, Color.GREEN,
                    Color.LTGRAY, Color.MAGENTA, Color.RED,
                    Color.WHITE, Color.YELLOW };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void randomizeColor(View button) {
        Random generator = new Random();
        int index = generator.nextInt(mColorChoices.length);
        button.setBackgroundColor(mColorChoices[index]);
    }
}
