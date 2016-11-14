package com.example.julioc98.imcapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    EditText peso = (EditText) findViewById(R.id.etPeso);
//    EditText altura = (EditText) findViewById(R.id.etPeso);
//    Button button = (Button) findViewById(R.id.button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText peso = (EditText) findViewById(R.id.etPeso);
                float fPeso = Float.parseFloat(String.valueOf(peso.getText()));
                EditText altura = (EditText) findViewById(R.id.etAltura);
                float fAltura = Float.parseFloat(String.valueOf(altura.getText()));

                RadioGroup rgSexo = (RadioGroup) findViewById(R.id.rgSexo);
//                String sexo = String.valueOf(rgSexo.getCheckedRadioButtonId() - 2131492982);
//                TextView tvResult = (TextView) findViewById(R.id.tvResult);
//                tvResult.setText(sexo);
                int sexo = (rgSexo.getCheckedRadioButtonId() - 2131492982);
                Pessoa p = new Pessoa( sexo, fPeso, fAltura);
                String result = p.classificarIMC();
                TextView tvResult = (TextView) findViewById(R.id.tvResult);
                tvResult.setText(result);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
