package ru.laink.testwork2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SecondOwnAdapter extends BaseAdapter {
    private String[] items;
    private LayoutInflater layoutInflater;

    SecondOwnAdapter(Context context, String[] items) {
        this.items = items;
        layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);

            if (position % 2 == 0)
                view.setBackgroundColor(Color.YELLOW);
            else
                view.setBackgroundColor(Color.BLUE);
        }

        TextView textView = view.findViewById(android.R.id.text1);
        textView.setText(items[position]);

        return view;
    }
}
