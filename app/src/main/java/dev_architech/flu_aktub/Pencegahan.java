package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Pencegahan extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseHelper dbHelper;
    int idPenyakit = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencegahan);
        idPenyakit = getIntent().getIntExtra("idPenyakit",1);
        TextView namaPenyakit = (TextView) findViewById (R.id.namaPenyakit);
        TextView pencegahan = (TextView) findViewById(R.id.pencegahanView);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM penyakit_table WHERE penyakit_id = '"+ idPenyakit +"'",null);
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            namaPenyakit.setText(cursor.getString(1).toString());
            pencegahan.setText(cursor.getString(3).toString());
        }
    }

    public void menuuLayout(View view) {
        Intent intent = new Intent(this, Menuu.class);
        startActivity(intent);
    }
}
