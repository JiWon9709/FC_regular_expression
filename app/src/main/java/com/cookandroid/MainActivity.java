package com.cookandroid;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        String s = "밀가루(밀;미국산),식물성유지(팜유;말레이시아산),쇼트닝I(가공유지(팜핵에스테르화유(말레이시아산)),팜유(말레이시아산),우지),설탕,기타과당,산도조절제I";
        String tag = "result: ";
        List<String> materialList = new ArrayList<String>();

        StringTokenizer st = new StringTokenizer(s.trim(), ",/\n {}[]");
        System.out.println(st.countTokens());
        String t = "";

        while (st.hasMoreTokens()) {
            t = st.nextToken();
            t = t.replaceAll("\\(.*\\)", "");
            Log.d(tag, t);
            tv.append(t + "\n");
            materialList.add(t);
        }
        //System.out.println(st.countTokens());

        for (int i = 0; i < materialList.size(); i++)
            Log.d(tag, "[" + i + "] " + materialList.get(i));
    }
}
