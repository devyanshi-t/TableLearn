package com.example.et.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(ListView)findViewById(R.id.ll);
        final SeekBar seek=(SeekBar)findViewById(R.id.seek);



        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)

            {
                int min = 1;
                int p;
                if (i < min) {
                    p = min;
                    seek.setProgress(p);
                }
                //ArrayList<String> al = new ArrayList<String>();
               else
                p = i;

                calc(p);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void calc(int i)
    {    ArrayList<String>al=new ArrayList<String>();
        for(int t=1;t<=10;t++)
        {

            al.add(Integer.toString(i*t));
        }
        ArrayAdapter<String>aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        ll.setAdapter(aa);
    }
}
