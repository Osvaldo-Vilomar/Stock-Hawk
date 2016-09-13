package com.sam_chordas.android.stockhawk;

/**
 * Created by Ozzie on 9/11/16.
 */
public class Item {

    public String startDate;
    public String openPrice;
    public String closePrice;
    public String highPrice;
    public String lowPrice;

    public Item(String startDate, String openPrice, String closePrice, String highPrice, String lowPrice) {

        this.startDate = startDate;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
    }
}
