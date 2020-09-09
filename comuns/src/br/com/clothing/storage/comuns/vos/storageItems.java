package br.com.clothing.storage.comuns.vos;

import br.com.clothing.storage.comuns.basis.Entity;
import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;

import java.util.Date;

public class storageItems extends Entity {

    private Date enterDate;
    private String store;
    private String type;
    private String brand;
    private String features;
    private SizeEnum size;
    private ColorEnum color;
    private Integer priceTag;
    private Integer paidPrice;
    private Integer price2;
    private Integer sugestedPrice;

    public Date getEnterDate() {
        return enterDate;
    }
    public String getStore() {
        return store;
    }
    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public String getFeatures() {
        return features;
    }
    public SizeEnum getSize() {
        return size;
    }
    public ColorEnum getColor() {
        return color;
    }
    public Integer getPriceTag() {
        return priceTag;
    }
    public Integer getPaidPrice() {
        return paidPrice;
    }
    public Integer getPrice2() {
        return price2;
    }
    public Integer getSugestedPrice() {
        return sugestedPrice;
    }
}
