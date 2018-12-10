package dev_architech.flu_aktub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Diagnosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        setTitle("Diagnosis");
    }

    public void pencegahanLayout(View view) {
        String m = null;
        CheckBox demam = (CheckBox) findViewById(R.id.demam);
        CheckBox pegal = (CheckBox) findViewById(R.id.pegal);
        if(demam.isChecked()){
            m = "satu";
        }
        if(pegal.isChecked()){
            m = m + "dua";
        }
        demam.setText(m);
        //Intent intent = new Intent(this, Pencegahan.class);
        //startActivity(intent);
    }
}
