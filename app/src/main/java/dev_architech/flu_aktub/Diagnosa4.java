package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Diagnosa4 extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa4);
    }

    public void solusiLayout(View view) {
        String[] diag1 = getIntent().getStringArrayExtra("diag1");
        String[] diag2 = getIntent().getStringArrayExtra("diag2");
        String[] diag3 = getIntent().getStringArrayExtra("diag3");
        String[] diag4;
        CheckBox G1 = (CheckBox) findViewById(R.id.G1);
        CheckBox G15 = (CheckBox) findViewById(R.id.G15);
        CheckBox G26 = (CheckBox) findViewById(R.id.G26);
        CheckBox G30 = (CheckBox) findViewById(R.id.G30);
        CheckBox G35 = (CheckBox) findViewById(R.id.G35);
        CheckBox G36 = (CheckBox) findViewById(R.id.G36);
        CheckBox G37 = (CheckBox) findViewById(R.id.G37);
        CheckBox G44 = (CheckBox) findViewById(R.id.G44);
        int i = 0;
        if(G1.isChecked()){
            i++;
        }
        if(G15.isChecked()){
            i++;
        }
        if(G26.isChecked()){
            i++;
        }
        if(G30.isChecked()){
            i++;
        }
        if(G35.isChecked()){
            i++;
        }
        if(G36.isChecked()){
            i++;
        }
        if(G37.isChecked()){
            i++;
        }
        if(G44.isChecked()){
            i++;
        }
        diag4 = new String[i];
        i = 0;
        if(G1.isChecked()){
            diag4[i] = "G1";
            i++;
        }
        if(G15.isChecked()){
            diag4[i] = "G15";
            i++;
        }
        if(G26.isChecked()){
            diag4[i] = "G26";
            i++;
        }
        if(G35.isChecked()){
            diag4[i] = "G35";
            i++;
        }
        if(G30.isChecked()){
            diag4[i] = "G30";
            i++;
        }
        if(G36.isChecked()){
            diag4[i] = "G36";
            i++;
        }
        if(G37.isChecked()){
            diag4[i] = "G37";
            i++;
        }
        if(G44.isChecked()){
            diag4[i] = "G44";
            i++;
        }
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM penyakit_table WHERE penyakit_id = '1'",null);
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            //id.setText(cursor.getString(0).toString());
            //nama.setText(cursor.getString(1).toString());
            //solusi.setText(cursor.getString(2).toString());
            //pencegahan.setText(cursor.getString(3).toString());
        }
        //G43.setText(Integer.toString(diag1.length));
        //G45.setText(Integer.toString(diag4.length));
        Intent intent = new Intent(this, Solusi.class);
        //intent.putExtra("diag1", diag1);
        //intent.putExtra("diag2", diag2);
        //intent.putExtra("diag3", diag3);
        //intent.putExtra("diag4", diag4);
        startActivity(intent);
    }
}
