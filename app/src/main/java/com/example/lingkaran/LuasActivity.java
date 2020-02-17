package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasActivity extends AppCompatActivity {
    private EditText jari_jari;
    private Button btn_hit_luas;
    private TextView tv_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        jari_jari = findViewById(R.id.jari_jari);
        btn_hit_luas= findViewById(R.id.btn_hit_luas);
        tv_hasil = findViewById(R.id.tv_hasil);

        btn_hit_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sjari_jari = jari_jari.getText().toString();
                    double r = Double.parseDouble(sjari_jari);
                    double hasil = 3.14 * r * r;
                    String shasil = String.valueOf(hasil);
                    tv_hasil.setText(shasil);
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field belum terisi",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}