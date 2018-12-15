package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Diagnosa extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        setTitle("Diagnosis");
    }

    public void solusiLayout(View view) {
        /*String m = "";
        CheckBox sakitKepala = (CheckBox) findViewById(R.id.sakitKepala);
        CheckBox pilek = (CheckBox) findViewById(R.id.pilek);
        if(sakitKepala.isChecked()){
            m = "satu";
        }
        if(pilek.isChecked()){
            m = m + "dua";
        }
        sakitKepala.setText(m);
        CheckBox id = (CheckBox) findViewById(R.id.mataMerah);
        CheckBox nama = (CheckBox) findViewById(R.id.mataBerair);
        CheckBox solusi = (CheckBox) findViewById(R.id.bercakMerah);
        CheckBox pencegahan = (CheckBox) findViewById(R.id.airHidungBerlebih);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM penyakit_table WHERE penyakit_id = '1'",null);
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            id.setText(cursor.getString(0).toString());
            nama.setText(cursor.getString(1).toString());
            solusi.setText(cursor.getString(2).toString());
            pencegahan.setText(cursor.getString(3).toString());
        }*/
        Intent intent = new Intent(this, Solusi.class);
        startActivity(intent);
    }
}
