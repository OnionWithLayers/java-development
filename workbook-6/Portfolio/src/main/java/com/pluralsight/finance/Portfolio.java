package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable assest) {
        this.assets.add(assest);
    }

    public double getValue() {
        double totalValue = 0;

        for (Valuable v : assets) {
            totalValue += v.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }

        Valuable mostValuableAsset = assets.get(0);
        double highestValue = mostValuableAsset.getValue();

        for (Valuable asset : assets) {
            double assetValue = asset.getValue();
            if (assetValue > highestValue) {
                highestValue = assetValue;
                mostValuableAsset = asset;
            }
        }
        return mostValuableAsset;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }

        Valuable leastValuableAsset = assets.get(0);
        double lowestValue = leastValuableAsset.getValue();

        for (Valuable asset : assets){
            double assetValue = asset.getValue();
            if (assetValue < lowestValue){
                lowestValue = assetValue;
                leastValuableAsset = asset;
            }
        }
        return leastValuableAsset;
    }
}