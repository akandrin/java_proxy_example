package com;

public class Main {

    public static void main(String[] args) {
	    ColaAdvertisingProxy advertising = new ColaAdvertisingProxy();
        advertising.showAd();
        advertising.showAd();
        advertising.showAd();
        System.out.println("Ad was shown " + advertising.GetShowCount() + " times");
    }
}
