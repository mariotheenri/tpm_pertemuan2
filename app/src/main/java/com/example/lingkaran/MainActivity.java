package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_kel, btn_luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_kel = findViewById(R.id.btn_kel);
        btn_luas = findViewById(R.id.btn_luas);

        btn_kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kel = new Intent(getApplicationContext(), KelilingActivity.class);
                startActivity(intent_kel);

            }
        });

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_luas = new Intent(getApplicationContext(), LuasActivity.class);
                startActivity(intent_luas);
            }
        });

    }
}
