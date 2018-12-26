package com.example.android.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rbtn1, rbtn2,  rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8, rbtn9, rbtn10;
    TextView tv1, tv2, tv3, tv4, tv5, line1,  line2, line3, line4, line5;
    Button submit;

    String res = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn4 = findViewById(R.id.rbtn4);
        rbtn5 = findViewById(R.id.rbtn5);
        rbtn6 = findViewById(R.id.rbtn6);
        rbtn7 = findViewById(R.id.rbtn7);
        rbtn8 = findViewById(R.id.rbtn8);
        rbtn9 = findViewById(R.id.rbtn9);
        rbtn10 = findViewById(R.id.rbtn10);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (rbtn1.isChecked()) {
            res = res + "1. YES \n";
        }else if (rbtn2.isChecked()){
            res = res + "1. NO \n";
        }if (rbtn3.isChecked()){
            res = res + "2. YES \n";
        }else if (rbtn4.isChecked()){
            res = res + "2. NO \n";
        }if (rbtn5.isChecked()){
            res = res + "3. YES \n";
        }else if (rbtn6.isChecked()){
            res = res + "3. NO \n";
        }if (rbtn7.isChecked()){
            res = res + "4. YES \n";
        }else if (rbtn8.isChecked()){
            res = res + "4. NO \n";
        }if (rbtn9.isChecked()){
            res = res + "5. YES \n";
        }else if (rbtn10.isChecked()){
            res = res + "5. NO \n";
        }

        Toast.makeText(this, "The result is: \n" + res, Toast.LENGTH_LONG).show();

        res = "";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.settings) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.info) {
            Toast.makeText(MainActivity.this, "Info", Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.about_us) {
            Toast.makeText(MainActivity.this, "About us", Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.yolo) {
            Toast.makeText(MainActivity.this, "Yolo", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
