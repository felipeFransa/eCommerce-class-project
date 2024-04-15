package model;

import java.util.ArrayList;
import java.util.List;

public class userCard {
    private String userName;
    private double numberCard;
    private double limitValue;
    private double balance;
    private List<Shopping> shopping;

    public userCard(double limitValue) {
        this.limitValue = limitValue;
        this.balance = limitValue;
        this.shopping = new ArrayList<>();
    }

    public boolean starShopping(Shopping shopping) {
        if (this.balance > shopping.getProductValue()) {
            this.balance -= shopping.getProductValue();
            this.shopping.add(shopping);
            return true;
        } else {
            return false;
        }
    }

    public double getLimitValue() {
        return limitValue;
    }

    public double getBalance() {
        return balance;
    }

    public List<Shopping> getShopping() {
        return shopping;
    }
}
