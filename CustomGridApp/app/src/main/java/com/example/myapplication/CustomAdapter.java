package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import android.view.LayoutInflater;
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private final String[] items;
    private final int[] ImageIds;

    public CustomAdapter(Context context,String[] items, int[] imageIds) {
        this.context=context;
        this.items = items;
        ImageIds = imageIds;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
