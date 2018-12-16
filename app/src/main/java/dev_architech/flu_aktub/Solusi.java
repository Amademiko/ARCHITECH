package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Solusi extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseHelper dbHelper;
    int idPenyakit = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);
        idPenyakit = getIntent().getIntExtra("idPenyakit",1);
        TextView namaPenyakit = (TextView) findViewById (R.id.namaPenyakit);
        TextView solusi = (TextView) findViewById (R.id.solusiView);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM penyakit_table WHERE penyakit_id = '"+ idPenyakit +"'",null);
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            namaPenyakit.setText(cursor.getString(1).toString());
            solusi.setText(cursor.getString(2).toString());
        }
    }
    public void pencegahanLayout(View view) {
        Intent intent = new Intent(this, Pencegahan.class);
        intent.putExtra("idPenyakit", idPenyakit);
        startActivity(intent);
    }
}
