package yufei99.com.yj;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017-10-03.
 */

public class zj extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.zj, container, false);


        //return inflater.inflate(R.layout.zj, container, false);
        String[] names = new String[]{"冯宇飞", "李白", "唐伯虎", "李白"};
        String[] descs = new String[]{"可爱的人", "帅气的人", "聪明的人", "聪明的人"};
        int[] imageIds = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};

        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), listItems, R.layout.zjlist, new String[]{"personName", "header", "desc"},
                new int[]{R.id.name, R.id.header, R.id.desc});
        ListView list = rootview.findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                System.out.println(i + "被单击了");
            }
        });

        return rootview;


    }


}
