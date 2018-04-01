package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private SimpleAdapter adapter;
    private List<Map<String,Object>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //t通过资源ID获得控件
        spinner = (Spinner ) findViewById(R.id.spinner);
        //获得数据源
        getData();
        adapter = new SimpleAdapter(
                this,
                list,
                R.layout.item,
                new String[]{"Icon", "name"},
                new int[] {R.id.Img, R.id.Text}
        );
        //适配器与控件绑定
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(this);
    }

    private void getData() {
        list = new ArrayList<Map<String,Object>>();
        Map map = new HashMap<String, Object>();
        map.put("name", "")
    }
}
