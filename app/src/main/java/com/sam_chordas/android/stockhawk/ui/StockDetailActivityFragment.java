package com.sam_chordas.android.stockhawk.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sam_chordas.android.stockhawk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ozzie on 9/11/16.
 */
public class StockDetailActivityFragment extends Fragment {

    private String stockName;
    @BindView(R.id.stock_name)TextView stockDate;

    public StockDetailActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_stock_detail, container, false);
        ButterKnife.bind(this, rootView);

        stockName = getActivity().getIntent().getStringExtra("stock_name");

        stockDate.setText(stockName);

        return rootView;
    }
}
