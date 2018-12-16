package dev_architech.flu_aktub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menuu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuu);
        setTitle("Menu Utama");
    }

    public void DiagnosaLayout(View view) {
        Intent intent = new Intent(this, Diagnosa.class);
        startActivity(intent);
    }
    public void pencegahanLayout(View view) {
        Intent intent = new Intent(this, Pencegahan.class);
        startActivity(intent);
    }
    public void solusiLayout(View view) {
        Intent intent = new Intent(this, Solusi.class);
        startActivity(intent);
    }
    public void tentangLayout(View view) {
        Intent intent = new Intent(this, Tentang.class);
        startActivity(intent);
    }
}
