package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
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

    public void diagnosa2Layout(View view) {
        String[] diag1;
        CheckBox G4 = (CheckBox) findViewById(R.id.G4);
        CheckBox G5 = (CheckBox) findViewById(R.id.G5);
        CheckBox G6 = (CheckBox) findViewById(R.id.G6);
        CheckBox G16 = (CheckBox) findViewById(R.id.G16);
        CheckBox G19 = (CheckBox) findViewById(R.id.G19);
        CheckBox G23 = (CheckBox) findViewById(R.id.G23);
        CheckBox G31 = (CheckBox) findViewById(R.id.G31);
        CheckBox G32 = (CheckBox) findViewById(R.id.G32);
        CheckBox G33 = (CheckBox) findViewById(R.id.G33);
        CheckBox G41 = (CheckBox) findViewById(R.id.G41);
        int i = 0;
        if(G4.isChecked()){
            i++;
        }
        if(G5.isChecked()){
            i++;
        }
        if(G6.isChecked()){
            i++;
        }
        if(G16.isChecked()){
            i++;
        }
        if(G19.isChecked()){
            i++;
        }
        if(G23.isChecked()){
            i++;
        }
        if(G31.isChecked()){
            i++;
        }
        if(G32.isChecked()){
            i++;
        }
        if(G33.isChecked()){
            i++;
        }
        if(G41.isChecked()){
            i++;
        }
        diag1 = new String[i];
        i = 0;
        if(G4.isChecked()){
            diag1[i] = "4";
            i++;
        }
        if(G5.isChecked()){
            diag1[i] = "5";
            i++;
        }
        if(G6.isChecked()){
            diag1[i] = "6";
            i++;
        }
        if(G16.isChecked()){
            diag1[i] = "16";
            i++;
        }
        if(G19.isChecked()){
            diag1[i] = "19";
            i++;
        }
        if(G23.isChecked()){
            diag1[i] = "23";
            i++;
        }
        if(G31.isChecked()){
            diag1[i] = "31";
            i++;
        }
        if(G32.isChecked()){
            diag1[i] = "32";
            i++;
        }
        if(G33.isChecked()){
            diag1[i] = "33";
            i++;
        }
        if(G41.isChecked()){
            diag1[i] = "41";
            i++;
        }
        //bengkak.setText(Integer.toString(diag1.length));
        /*DatabaseHelper dbHelper = new DatabaseHelper(this);
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
        Intent intent = new Intent(this, Diagnosa2.class);
        intent.putExtra("diag1", diag1);
        startActivity(intent);
    }
}
