package br.com.clothing.storage.comuns.vos;

import br.com.clothing.storage.comuns.basis.Entity;
import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;

import java.util.Date;

public class StorageItem extends Entity {

    private Date enterDate;
    private String purchaseLocation;
    private String type;
    private String brand;
    private String description;
    private SizeEnum size;
    private ColorEnum color;
    private Double priceTag;
    private Double paidPrice;
    private Double profitPrice;
    private Double suggestedPrice;

    public StorageItem(Integer id, Date enterDate, String purchaseLocation, String type, String brand,
                       String description, SizeEnum size, ColorEnum color, Double priceTag, Double paidPrice,
                       Double profitPrice, Double suggestedPrice){
        this.setId(id);
        this.enterDate = enterDate;
        this.purchaseLocation = purchaseLocation;
        this.type = type;
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.color = color;
        this.priceTag = priceTag;
        this.paidPrice = paidPrice;
        this.profitPrice = profitPrice;
        this.suggestedPrice = suggestedPrice;
    }

    public StorageItem() {

    }

    public Date getEnterDate() {
        return enterDate;
    }
    public void setEnterDate(Date date) {
        this.enterDate = date;
    }

    public String getPurchaseLocation() {
        return purchaseLocation;
    }
    public void setPurchaseLocation(String location) {
        this.purchaseLocation = location;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }
    public void getBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public SizeEnum getSize() {
        return size;
    }
    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public ColorEnum getColor() {
        return color;
    }
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Double getPriceTag() {
        return priceTag;
    }
    public void setPriceTag(Double priceTag) {
        this.priceTag = priceTag;
    }

    public Double getPaidPrice() {
        return paidPrice;
    }
    public void setPaidPrice(Double paidPrice) {
        this.paidPrice = paidPrice;
    }

    public Double getProfitPrice() {
        return profitPrice;
    }
    public void setProfitPrice(Double profitPrice) {
        this.profitPrice = profitPrice;
    }

    public Double getSuggestedPrice() {
        return suggestedPrice;
    }
    public void setSuggestedPrice(Double suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }
}
