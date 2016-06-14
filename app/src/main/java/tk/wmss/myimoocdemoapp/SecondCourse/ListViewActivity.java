package tk.wmss.myimoocdemoapp.SecondCourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tk.wmss.myimoocdemoapp.R;

/**
 * Created by wmss on 2016/6/11.
 *
 */
public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private ListView listView2;
    private ArrayAdapter<String> arrayAdapter;
    private SimpleAdapter simpleAdapter;
    private List<Map<String, Object>> myData;
    private int[] ints = new int[]{R.id.image_view_my, R.id.text_view_my};
    private String[] strings = new String[]{"img", "text"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);
        listView2 = (ListView) findViewById(R.id.listView2);
        // 1. 新建一个数据适配器
        //ArrayAdapter(上下文， 当前ListView加载的每一个列表相所对应的布局文件，数据源)

        /** 布局文件的写法
         *   <?xml version="1.0" encoding="utf-8"?>
         *       <TextView xmlns:android="http://schemas.android.com/apk/res/android"
         *           android:id="@android:id/text1"
         *           android:singleLine="true"
         *           android:textSize="24sp"
         *           android:padding="16dp"
         *           android:layout_width="match_parent"
         *           android:layout_height="wrap_content"
         *           android:ellipsize="marquee"/>
         */

        //2.适配器加载数据源
        String[] arrayData = {"吾木逝水", "吾木逝水1", "吾木逝水2", "吾木逝水3"};
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.my_item, arrayData);
        //视图（ListView）加载适配器
        listView.setAdapter(arrayAdapter);
        /*
        * SimpleAdapter包含了5个参数
        * 1.上下文
        * 2.数据源：特定的数据 List<? extends Map<String, ?>> date 一个Map所组成的List集合
        *           每个Map都会去对应ListView列表中的一行
        *           每个Map<键—值对>中的键必须是from中指定的键
        *
        * 3.resource：列表项布局文件的ID      "int类型"
        * 4.from：Map中的键名                "String[]类型"
        * 5.to:绑定数据视图的ID，与from对应    "int[]类型"
        *
        * */
        myData = new ArrayList<Map<String, Object>>();
        simpleAdapter = new SimpleAdapter(this, getData(), R.layout.my_item2, strings, ints);
        listView2.setAdapter(simpleAdapter);
    }

    private List<Map<String, Object>> getData() {
        // 新建一个集合类，用于存放多条数据
        for (int i = 1; i <= 4; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("img", R.mipmap.ic_launcher);
            map.put("text", "机器人" + i);
            myData.add(map);
        }
        return myData;
    }
}
