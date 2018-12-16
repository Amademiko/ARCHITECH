package dev_architech.flu_aktub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Diagnosa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa2);
    }

    public void diagnosa3Layout(View view) {
        String[] diag1 = getIntent().getStringArrayExtra("diag1");
        String[] diag2;
        CheckBox G7 = (CheckBox) findViewById(R.id.G7);
        CheckBox G11 = (CheckBox) findViewById(R.id.G11);
        CheckBox G14 = (CheckBox) findViewById(R.id.G14);
        CheckBox G12 = (CheckBox) findViewById(R.id.G12);
        CheckBox G22 = (CheckBox) findViewById(R.id.G22);
        CheckBox G28 = (CheckBox) findViewById(R.id.G28);
        CheckBox G38 = (CheckBox) findViewById(R.id.G38);
        CheckBox G42 = (CheckBox) findViewById(R.id.G42);
        CheckBox G43 = (CheckBox) findViewById(R.id.G43);
        CheckBox G45 = (CheckBox) findViewById(R.id.G45);
        int i = 0;
        if(G7.isChecked()){
            i++;
        }
        if(G11.isChecked()){
            i++;
        }
        if(G14.isChecked()){
            i++;
        }
        if(G12.isChecked()){
            i++;
        }
        if(G22.isChecked()){
            i++;
        }
        if(G28.isChecked()){
            i++;
        }
        if(G38.isChecked()){
            i++;
        }
        if(G42.isChecked()){
            i++;
        }
        if(G43.isChecked()){
            i++;
        }
        if(G45.isChecked()){
            i++;
        }
        diag2 = new String[i];
        i = 0;
        if(G7.isChecked()){
            diag2[i] = "7";
            i++;
        }
        if(G11.isChecked()){
            diag2[i] = "11";
            i++;
        }
        if(G14.isChecked()){
            diag2[i] = "14";
            i++;
        }
        if(G12.isChecked()){
            diag2[i] = "12";
            i++;
        }
        if(G22.isChecked()){
            diag2[i] = "22";
            i++;
        }
        if(G28.isChecked()){
            diag2[i] = "28";
            i++;
        }
        if(G38.isChecked()){
            diag2[i] = "38";
            i++;
        }
        if(G42.isChecked()){
            diag2[i] = "42";
            i++;
        }
        if(G43.isChecked()){
            diag2[i] = "43";
            i++;
        }
        if(G45.isChecked()){
            diag2[i] = "45";
            i++;
        }
        //G43.setText(Integer.toString(diag1.length));
        //G45.setText(Integer.toString(diag2.length));
        Intent intent = new Intent(this, Diagnosa3.class);
        intent.putExtra("diag1", diag1);
        intent.putExtra("diag2", diag2);
        startActivity(intent);
    }
}
