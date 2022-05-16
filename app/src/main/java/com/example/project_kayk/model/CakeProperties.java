package com.example.project_kayk.model;

public class CakeProperties {

    String Size = "", Layers = "", Sponge = "", Filling = "", Icing = "", Garnish = "", Tiers = "", image = "";

    public CakeProperties(){}
    public CakeProperties(String size, String layers, String sponge, String filling, String icing, String garnish, String tiers, String image) {
        Size = size;
        Layers = layers;
        Sponge = sponge;
        Filling = filling;
        Icing = icing;
        Garnish = garnish;
        Tiers = tiers;
        this.image = image;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getLayers() {
        return Layers;
    }

    public void setLayers(String layers) {
        Layers = layers;
    }

    public String getSponge() {
        return Sponge;
    }

    public void setSponge(String sponge) {
        Sponge = sponge;
    }

    public String getFilling() {
        return Filling;
    }

    public void setFilling(String filling) {
        Filling = filling;
    }

    public String getIcing() {
        return Icing;
    }

    public void setIcing(String icing) {
        Icing = icing;
    }

    public String getGarnish() {
        return Garnish;
    }

    public void setGarnish(String garnish) {
        Garnish = garnish;
    }

    public String getTiers() {
        return Tiers;
    }

    public void setTiers(String tiers) {
        Tiers = tiers;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
