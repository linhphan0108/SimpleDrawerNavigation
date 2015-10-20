package com.linhphan.simpledrawernavigation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhphan.simpledrawernavigation.R;
import com.linhphan.simpledrawernavigation.model.DrawerNavigationItem;

import java.util.ArrayList;

/**
 * Created by linhphan on 10/20/15.
 */
public class DrawerNavigationAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<DrawerNavigationItem> drawerNavigationItemList;

    public DrawerNavigationAdapter(Context context, ArrayList<DrawerNavigationItem> drawerNavigationItemList) {
        this.context = context;
        this.drawerNavigationItemList = drawerNavigationItemList;
    }

    @Override
    public int getCount() {
        if (drawerNavigationItemList == null)
            return 0;
        else return drawerNavigationItemList.size();
    }

    @Override
    public Object getItem(int position) {
        if (drawerNavigationItemList == null || drawerNavigationItemList.size() <= position)
            return null;
        else
            return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_navigation_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgIcon = (ImageView) convertView.findViewById(R.id.img_icon);
            viewHolder.txtTitle = (TextView) convertView.findViewById(R.id.txt_title);
            viewHolder.txtCounter = (TextView) convertView.findViewById(R.id.txt_counter);
            convertView.setTag(viewHolder);
        }

        viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.imgIcon.setImageResource(drawerNavigationItemList.get(position).getIcon());
        viewHolder.txtTitle.setText(drawerNavigationItemList.get(position).getTitle());
        if (drawerNavigationItemList.get(position).isCounterVisible()) {
            viewHolder.txtCounter.setText(drawerNavigationItemList.get(position).getCounter());
            viewHolder.txtCounter.setVisibility(View.VISIBLE);
        } else {
            viewHolder.txtCounter.setVisibility(View.INVISIBLE);
        }


        return convertView;
    }


    class ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtCounter;
    }
}
