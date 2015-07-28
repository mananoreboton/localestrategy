package com.borabora.localestrategy.sales;

import com.borabora.localestrategy.locale.Guatemala;
import org.springframework.stereotype.Component;

/**
 * Created by epauser on 27/07/15.
 */
@Guatemala
public class CheapTaxCalculator implements TaxCalculator {

    private double taxRate;

    @Override
    public double getSalePrice(double price) {
        return price + (price * taxRate * 0.1);
    }
}
