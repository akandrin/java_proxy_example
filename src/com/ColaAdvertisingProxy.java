package com;

public class ColaAdvertisingProxy implements Advertising {
    private final Advertising advertising = new ColaAdvertising();
    private int showCount = 0;

    @Override
    public void showAd() {
        advertising.showAd();
        showCount += 1;
    }

    public int GetShowCount() {
        return showCount;
    }
}
