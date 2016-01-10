package com.example.xyzreader.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.List;

/**
 * A custom adapter for navigation drawer list view.
 *
 * References:
 * [1] http://www.vogella.com/tutorials/AndroidListView/article.html
 */
public class DrawerArrayAdapter extends ArrayAdapter<DrawerItem> {

    private final Context context;
    private final int resource;

    public DrawerArrayAdapter(Context context, int resource, List<DrawerItem> items) {
        super(context, -1, items);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        DrawerViewHolder holder;
        DrawerItem item = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            rowView = inflater.inflate(resource, parent, false);
            holder = new DrawerViewHolder();
            holder.iconView = (ImageView) rowView.findViewById(R.id.label_image);
            holder.labelView = (TextView) rowView.findViewById(R.id.label_text);
            rowView.setTag(holder);
        } else {
            rowView = convertView;
            holder = (DrawerViewHolder) rowView.getTag();
        }

        holder.iconView.setImageResource(item.getIcon());
        holder.labelView.setText(item.getLabel());

        return rowView;
    }

}
