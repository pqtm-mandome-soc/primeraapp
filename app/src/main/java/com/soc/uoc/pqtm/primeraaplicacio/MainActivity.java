package com.soc.uoc.pqtm.primeraaplicacio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    ImageView imatgeFlor;
    Integer comptador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        imatgeFlor = findViewById(R.id.imageView_activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(comptador));
                comptador += 1;
            }
        });

        imatgeFlor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comptador -= 1;
                textView.setText(String.valueOf(comptador));
            }
        });
        textView.setText("Hola món");

    }
}
