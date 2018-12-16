package dev_architech.flu_aktub;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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
            diag4[i] = "1";
            i++;
        }
        if(G15.isChecked()){
            diag4[i] = "15";
            i++;
        }
        if(G26.isChecked()){
            diag4[i] = "26";
            i++;
        }
        if(G35.isChecked()){
            diag4[i] = "35";
            i++;
        }
        if(G30.isChecked()){
            diag4[i] = "30";
            i++;
        }
        if(G36.isChecked()){
            diag4[i] = "36";
            i++;
        }
        if(G37.isChecked()){
            diag4[i] = "37";
            i++;
        }
        if(G44.isChecked()){
            diag4[i] = "44";
            i++;
        }

        String diagnosis = "";
        for(i=0;i<diag1.length;i++){
            diagnosis = diagnosis + diag1[i] + ",";
        }
        for(i=0;i<diag2.length;i++){
            diagnosis = diagnosis + diag2[i] + ",";
        }
        for(i=0;i<diag3.length;i++){
            diagnosis = diagnosis + diag3[i] + ",";
        }
        for(i=0;i<diag4.length;i++){
            diagnosis = diagnosis + diag4[i] + ",";
        }
        int comma = diagnosis.length();
        int idPenyakit = 0;
        //G1.setText(Integer.toString(comma));
        //diagnosis.substring(0,comma-1);
        //G15.setText(diagnosis.substring(0,comma-1));
        if(diag1.length!=0&&diag2.length!=0&&diag3.length!=0&&diag4.length!=0) {
            DatabaseHelper dbHelper = new DatabaseHelper(this);
            SQLiteDatabase db = dbHelper.getReadableDatabase();
            cursor = db.rawQuery("select *,count(*),cast((count(*)*1.0)/b.jml_gejala as DECIMAL(6,2)) as ini from aturan_table a\n" +
                    "join penyakit_table b on a.id_penyakit = b.penyakit_id\n" +
                    "where a.id_gejala in (" + diagnosis.substring(0, comma - 1) + ")\n" +
                    "group by a.id_penyakit\n" +
                    "order by ini DESC\n" +
                    "limit 1;", null);
            if (cursor.getCount() > 0) {
                cursor.moveToPosition(0);
                idPenyakit = cursor.getInt(2);
            }
            //G45.setText(Integer.toString(diag4.length));
            Intent intent = new Intent(this, Solusi.class);
            intent.putExtra("idPenyakit", idPenyakit);
            //intent.putExtra("diag2", diag2);
            //intent.putExtra("diag3", diag3);
            //intent.putExtra("diag4", diag4);
            startActivity(intent);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(Diagnosa4.this);
            builder.setTitle("Alert")
                    .setMessage("Anda tidak mencentang apapun. apakah anda ingin kembali ke halaman utama")
                    .setPositiveButton("iya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Diagnosa4.this, Menuu.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("isi kembali", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Diagnosa4.this, Diagnosa.class);
                            startActivity(intent);
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
}
}
