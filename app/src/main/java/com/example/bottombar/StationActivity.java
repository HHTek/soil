package com.example.bottombar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class StationActivity extends Activity {

    private String[] stationdata = {"涩北压气首站","河口输气站","定西输气站","合作输气站","西宁输气站",
           "兰州输气末站","湖东输气站","德令哈输气站"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);

        ArrayAdapter<String> stationadapter = new ArrayAdapter<String>(
                StationActivity.this, android.R.layout.simple_list_item_1,stationdata);
        ListView stationlist = (ListView) findViewById(R.id.stationlist);
        stationlist.setAdapter(stationadapter);
        stationlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1: Intent intent = new Intent(StationActivity.this,MainActivity.class);
                        startActivity(intent);
                }

            }
        });
    }
}







