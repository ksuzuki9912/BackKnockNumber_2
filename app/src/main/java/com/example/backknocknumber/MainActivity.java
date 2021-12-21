package com.example.backknocknumber;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.github.mikephil.charting.data.Entry;
//import com.github.mikephil.charting.data.LineData;
//import com.github.mikephil.charting.charts.LineChart;//LineChartを利用できるようにする
//import com.github.mikephil.charting.data.LineDataSet;
//import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
//ファイル操作用

//メイン画面のクラス
public class MainActivity extends AppCompatActivity {

    private Button buttonA,buttonB;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonA = findViewById(R.id.buttonA);


        // lambda式
        buttonA.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MainActivity2.class);
            startActivity(intent);
        });

        buttonB = findViewById(R.id.buttonB);


        // lambda式
        buttonB.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MainActivity3.class);
            startActivity(intent);
        });
    }
}




/*
エミュレーターのサイズ
1080*1918pxl
xc=540
yc=959
xc2=270
xc3=810
yc2=479.5
yc3=1438.5
yc4=239.75
 */
