package com.cjw.mytestapp1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjw on 2016/6/21.
 */
public class OneFragment extends Fragment {

    private ListView my_list;
    private ScrollView my_scroll;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        my_list = (ListView) rootView.findViewById(R.id.my_list);
        my_scroll = (ScrollView) rootView.findViewById(R.id.my_scroll);
        //my_list.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_expandable_list_item_1, getData()));
        my_list.setAdapter(new ArrayAdapter<>(getActivity(), R.layout.item, getData()));

        ToolsUtil.setListViewHeightBasedOnChildren(my_list, 4);

        my_list.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    my_scroll.requestDisallowInterceptTouchEvent(false);
                } else {
                    my_scroll.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });

        return rootView;
    }



    private List<String> getData(){

        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        data.add("测试数据5");
        data.add("测试数据6");
        data.add("测试数据7");
        data.add("测试数据8");
        data.add("测试数据9");
        data.add("测试数据10");
        data.add("测试数据11");
        data.add("测试数据12");
        data.add("测试数据13");
        data.add("测试数据14");
        data.add("测试数据15");
        data.add("测试数据16");
        data.add("测试数据17");
        data.add("测试数据18");
        data.add("测试数据19");
        data.add("测试数据20");
        data.add("测试数据21");
        data.add("测试数据22");
        data.add("测试数据23");
        data.add("测试数据24");
        data.add("测试数据25");
        data.add("测试数据26");
        data.add("测试数据27");
        data.add("测试数据28");
        data.add("测试数据29");
        data.add("测试数据30");

        return data;
    }
}
