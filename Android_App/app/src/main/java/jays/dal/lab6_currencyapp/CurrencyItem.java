package jays.dal.lab6_currencyapp;

public class CurrencyItem {
    private String base;
    private String value;

    public CurrencyItem (String base, double value) {
        this.base = base;
        this.value = Double.toString(value);
    }

    public String getBase() {return this.base;}
    public String getValue() {return this.value;}
}