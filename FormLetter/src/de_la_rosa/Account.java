package de_la_rosa;

public class Account {
    public void setName(String name) {
        this.name = name;
    }

    public void setLastPurchase(String lastPurchase) {
        this.lastPurchase = lastPurchase;
    }

    public void setDaysSincePurchase(int daysSincePurchase) {
        this.daysSincePurchase = daysSincePurchase;
    }

    private String name ;
    private String lastPurchase;
    private int daysSincePurchase;


    public Account(String name, String lastPurchase, int daysSincePurchase) {
        this.name = name;
        this.lastPurchase = lastPurchase;
        this.daysSincePurchase = daysSincePurchase;

    }


    public String getName() {
        return name;
    }

    public String getLastPurchase() {
        return lastPurchase;
    }

    public int getDaysSincePurchase() {
        return daysSincePurchase;
    }
}
