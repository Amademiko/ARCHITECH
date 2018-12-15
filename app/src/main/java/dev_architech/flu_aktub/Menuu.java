package dev_architech.flu_aktub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menuu extends AppCompatActivity {
    //DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuu);
        setTitle("Menu Utama");
    }

    public void DiagnosaLayout(View view) {
        Intent intent = new Intent(this, Diagnosa.class);
        //myDb = new DatabaseHelper(this);
        startActivity(intent);
    }
}
