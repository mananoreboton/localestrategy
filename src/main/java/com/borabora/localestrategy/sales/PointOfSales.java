package com.borabora.localestrategy.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by epauser on 27/07/15.
 */
@Component
public class PointOfSales {

    @Autowired
    private TaxCalculator taxCalculator;

    @Autowired
    private CardReader cardReader;

    public double getSalePrice(double price) {
        return taxCalculator.getSalePrice(price);
    }

    public String getCardNumber() {
        return cardReader.getCardNumber();
    }

    public TaxCalculator getTaxCalculator() {
        return taxCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

}
