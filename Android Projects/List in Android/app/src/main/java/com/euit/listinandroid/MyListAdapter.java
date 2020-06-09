package com.euit.listinandroid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {

    private String[] programmingLanugaes;
    private String[] programmingLanuagesDetails;
    private Activity context;

    public MyListAdapter(String[] programmingLanugaes, String[] programmingLanuagesDetails, Activity context) {
        this.programmingLanugaes = programmingLanugaes;
        this.programmingLanuagesDetails = programmingLanuagesDetails;
        this.context = context;
    }

    @Override
    public int getCount() {
        return programmingLanugaes.length;
    }

    @Override
    public Object getItem(int position) {
        return programmingLanugaes.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_list, null, false);

        TextView tv_title = rowView.findViewById(R.id.tv_title);
        TextView tv_sub_title = rowView.findViewById(R.id.tv_sub_title);
        ImageView imgv_image = rowView.findViewById(R.id.imgv_image);

        tv_title.setText(programmingLanugaes[position]);
        tv_sub_title.setText(programmingLanuagesDetails[position]);

        return rowView;
    }
}
