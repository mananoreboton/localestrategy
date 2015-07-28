package com.borabora.localestrategy.sales;

import com.borabora.localestrategy.locale.Venezuela;
import org.springframework.stereotype.Component;

/**
 * Created by epauser on 27/07/15.
 */
@Venezuela
public class CrazyTaxCalculator implements TaxCalculator {

    @Override
    public double getSalePrice(double price) {
        return price + (price * Math.random());
    }
}
