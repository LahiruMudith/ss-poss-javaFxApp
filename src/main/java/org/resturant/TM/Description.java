package org.resturant.TM;

import java.util.ArrayList;

public class Description {
    public ArrayList<String> description;
    public ArrayList<Integer> qty;
    public ArrayList<Double> price;

    public Description() {
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public ArrayList<Integer> getQty() {
        return qty;
    }

    public void setQty(ArrayList<Integer> qty) {
        this.qty = qty;
    }

    public ArrayList<Double> getPrice() {
        return price;
    }

    public void setPrice(ArrayList<Double> price) {
        this.price = price;
    }
}
