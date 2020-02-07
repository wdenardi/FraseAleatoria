package com.example.frasealeatoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtfrase;
    private Button bGeraFrase;

    private String [] frases = {"ANDROID CUPCAKE","ANDROID DONUT","ANDROID ECLAIR","ANDROID GINGERBREAD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtfrase = findViewById(R.id.viewId);
        bGeraFrase = findViewById(R.id.bgerar);


        bGeraFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();
                int numeroAle = rand.nextInt(4);
                txtfrase.setText(frases[numeroAle]);

            }
        });
    }
}
