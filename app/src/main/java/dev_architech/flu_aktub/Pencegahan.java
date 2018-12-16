package dev_architech.flu_aktub;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Pencegahan extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseHelper dbHelper;
    int idPenyakit = 1;
    Editable cari;
    String[] penyakitList = {"H1N1", "Flu Babi tipe 1","H1N2","Flu Babi tipe 2","H2N2","Flu Babi tipe 3", "H3N2","Flu Burung tipe 1",
        "H5N1","Flu Burung tipe 2","H6N1","Flu Taiwan","H7N2","Flu Burung tipe 3","H7N3","Flu Burung tipe 4","H7N7","Flu Eropa",
        "H7N9", "Flu Burung tipe 5", "H9N2", "Flu Hongkong", "H10N7", "Flu Mesir", "Flu Biasa", "Flu tipe C"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencegahan);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, penyakitList);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);

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
    public void cariPenyakit(View view) {
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        cari = actv.getText();
        TextView namaPenyakit = (TextView) findViewById (R.id.namaPenyakit);
        TextView pencegahan = (TextView) findViewById(R.id.pencegahanView);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM penyakit_table WHERE penyakit_nama LIKE '%"+ cari +"%'",null);
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            namaPenyakit.setText(cursor.getString(1).toString());
            pencegahan.setText(cursor.getString(3).toString());
        }
    }
}
