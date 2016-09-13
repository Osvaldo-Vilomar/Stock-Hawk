package com.sam_chordas.android.stockhawk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ozzie on 9/11/16.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Item items = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_detail, parent, false);
        }

        TextView startDate = (TextView)convertView.findViewById(R.id.start_date);
        TextView openPrice = (TextView)convertView.findViewById(R.id.open_price);
        TextView closePrice = (TextView)convertView.findViewById(R.id.close_price);
        TextView highPrice = (TextView)convertView.findViewById(R.id.high_price);
        TextView lowPrice = (TextView)convertView.findViewById(R.id.low_price);

        startDate.setText(items.startDate);
        openPrice.setText(items.openPrice);
        closePrice.setText(items.closePrice);
        highPrice.setText(items.highPrice);
        lowPrice.setText(items.lowPrice);

        return convertView;
    }
}
