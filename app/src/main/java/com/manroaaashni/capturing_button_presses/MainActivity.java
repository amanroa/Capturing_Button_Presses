package com.manroaaashni.capturing_button_presses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("b1 clicked!");
                Log.i("Button 1", "Clicked");
//                textView.setText("hi");
                int count = parseInt(textView.getText().toString()) +1;
                textView.setText(Integer.toString(count));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("b2 clicked!");
                Log.i("Button 2", "Clicked");
                double rand_1 = rand.nextDouble();
                if (rand_1 < 0.3){
                    button2.setBackgroundColor(getResources().getColor(R.color.purple));
                }
                else if (rand_1 >= 0.3  && rand_1 <0.6){
                    button2.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                else{
                    button2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                }

            }
        });
    }
}
