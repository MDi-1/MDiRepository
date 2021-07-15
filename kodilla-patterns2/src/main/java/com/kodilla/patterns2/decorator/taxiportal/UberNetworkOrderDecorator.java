package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override       // hardcoded stub cost = 20
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}