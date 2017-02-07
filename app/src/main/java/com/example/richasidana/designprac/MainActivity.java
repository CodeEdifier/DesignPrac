package com.example.richasidana.designprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv =(TextView)findViewById(R.id.t1);

        Button b = (Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switch s = (Switch)v;
                if(s.isChecked())
                getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
                else
                    getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
//        tv.setTextColor(Color.rgb(255,11,123));
//        tv.setTextColor(getResources().getColor(android.R.color.holo_purple));
        String s = ((Spinner)findViewById(R.id.s1)).getSelectedItem().toString();
        ((ImageView)findViewById(R.id.img)).setImageResource(R.drawable.music);
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
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
