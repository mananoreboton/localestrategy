package com.borabora.localestrategy.sales;

import com.borabora.localestrategy.locale.CostaRica;
import org.springframework.stereotype.Component;

/**
 * Created by epauser on 27/07/15.
 */
@CostaRica
public class PrettyExpensiveTaxCalculator implements TaxCalculator {

    private double taxRate;

    @Override
    public double getSalePrice(double price) {
        return price + (price * taxRate);
    }
}
