package com.borabora.localestrategy.sales;

import com.borabora.localestrategy.locale.Venezuela;

/**
 * Created by epauser on 28/07/15.
 */
@Venezuela
public class VirtualCardReader implements CardReader {
    @Override
    public String getCardNumber() {
        return "123321";
    }
}
