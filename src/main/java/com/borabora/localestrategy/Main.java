package com.borabora.localestrategy;


import com.borabora.localestrategy.sales.PointOfSales;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mananoreboton on 27/07/15.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        PointOfSales pos = (PointOfSales) context.getBean("pointOfSales");
        double salePrice = pos.getSalePrice(100.10);
        System.out.println("Sale Price = " + salePrice);
        String cardNumber = pos.getCardNumber();
        System.out.println("cardNumber = " + cardNumber);

    }
}
