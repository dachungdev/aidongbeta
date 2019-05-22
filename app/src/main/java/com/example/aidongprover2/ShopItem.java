package com.example.aidongprover2;

import java.io.Serializable;

public class ShopItem implements Serializable{

    public String ShopItemName;
    public String ShopItemCost;
    public String ShopItemImage;
    public String ShopItemRemarks;
    public String ShopItemUrl;

    public void setShopItemName(String a){
        this.ShopItemName = a;
    }

    public String getShopItemName(){
        return ShopItemName;
    }

    public void setShopItemCost(String a){
        this.ShopItemCost = a;
    }

    public String getShopItemCost(){
        return ShopItemCost;
    }

    public void setShopItemImage(String a){
        this.ShopItemImage = a;
    }

    public String getShopItemImage(){
        return ShopItemImage;
    }

    public void setShopItemRemarks(String a){
        this.ShopItemRemarks = a;
    }

    public String getShopItemRemarks(){
        return ShopItemRemarks;
    }

    public void setShopItemUrl(String a){
        this.ShopItemUrl = a;
    }

    public String getShopItemUrl(){
        return ShopItemUrl;
    }

}
