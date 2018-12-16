package dev_architech.flu_aktub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Diagnosa3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa3);
    }

    public void diagnosa4Layour(View view) {
        String[] diag1 = getIntent().getStringArrayExtra("diag1");
        String[] diag2 = getIntent().getStringArrayExtra("diag2");
        String[] diag3;
        CheckBox G3 = (CheckBox) findViewById(R.id.G3);
        CheckBox G8 = (CheckBox) findViewById(R.id.G8);
        CheckBox G9 = (CheckBox) findViewById(R.id.G9);
        CheckBox G10 = (CheckBox) findViewById(R.id.G10);
        CheckBox G13 = (CheckBox) findViewById(R.id.G13);
        CheckBox G17 = (CheckBox) findViewById(R.id.G17);
        CheckBox G18 = (CheckBox) findViewById(R.id.G18);
        CheckBox G20 = (CheckBox) findViewById(R.id.G20);
        CheckBox G21 = (CheckBox) findViewById(R.id.G21);
        CheckBox G24 = (CheckBox) findViewById(R.id.G24);
        CheckBox G25 = (CheckBox) findViewById(R.id.G25);
        CheckBox G2 = (CheckBox) findViewById(R.id.G2);
        CheckBox G27 = (CheckBox) findViewById(R.id.G27);
        CheckBox G29 = (CheckBox) findViewById(R.id.G29);
        CheckBox G34 = (CheckBox) findViewById(R.id.G34);
        CheckBox G39 = (CheckBox) findViewById(R.id.G39);
        CheckBox G40 = (CheckBox) findViewById(R.id.G40);
        int i = 0;
        if(G3.isChecked()){
            i++;
        }
        if(G8.isChecked()){
            i++;
        }
        if(G9.isChecked()){
            i++;
        }
        if(G10.isChecked()){
            i++;
        }
        if(G13.isChecked()){
            i++;
        }
        if(G17.isChecked()){
            i++;
        }
        if(G18.isChecked()){
            i++;
        }
        if(G20.isChecked()){
            i++;
        }
        if(G21.isChecked()){
            i++;
        }
        if(G24.isChecked()){
            i++;
        }
        if(G25.isChecked()){
            i++;
        }
        if(G2.isChecked()){
            i++;
        }
        if(G27.isChecked()){
            i++;
        }
        if(G29.isChecked()){
            i++;
        }
        if(G34.isChecked()){
            i++;
        }
        if(G39.isChecked()){
            i++;
        }
        if(G40.isChecked()){
            i++;
        }
        diag3 = new String[i];
        i = 0;
        if(G3.isChecked()){
            diag3[i] = "3";
            i++;
        }
        if(G8.isChecked()){
            diag3[i] = "8";
            i++;
        }
        if(G9.isChecked()){
            diag3[i] = "9";
            i++;
        }
        if(G10.isChecked()){
            diag3[i] = "10";
            i++;
        }
        if(G13.isChecked()){
            diag3[i] = "13";
            i++;
        }
        if(G17.isChecked()){
            diag3[i] = "17";
            i++;
        }
        if(G18.isChecked()){
            diag3[i] = "18";
            i++;
        }
        if(G20.isChecked()){
            diag3[i] = "20";
            i++;
        }
        if(G21.isChecked()){
            diag3[i] = "21";
            i++;
        }
        if(G24.isChecked()){
            diag3[i] = "24";
            i++;
        }
        if(G25.isChecked()){
            diag3[i] = "25";
            i++;
        }
        if(G2.isChecked()){
            diag3[i] = "2";
            i++;
        }
        if(G27.isChecked()){
            diag3[i] = "27";
            i++;
        }
        if(G29.isChecked()){
            diag3[i] = "29";
            i++;
        }
        if(G34.isChecked()){
            diag3[i] = "34";
            i++;
        }
        if(G39.isChecked()){
            diag3[i] = "39";
            i++;
        }
        if(G40.isChecked()){
            diag3[i] = "40";
            i++;
        }
        //G21.setText(Integer.toString(diag1.length));
        //G24.setText(Integer.toString(diag3.length));
        Intent intent = new Intent(this, Diagnosa4.class);
        intent.putExtra("diag1", diag1);
        intent.putExtra("diag2", diag2);
        intent.putExtra("diag3", diag3);
        startActivity(intent);
    }
}
