package com.puttimait.WarehouseApi.data;

import java.util.Date;

public class ItemDTO {
    private String name = "";
    private String alternateName = "";
    private long provider = 0;
    private long cost_price = 0;
    private long selling_price = 0;
    private long shelf = 0;
    private long stock = 0;
    private long alert = 0;
    private Date createDate = new Date();
    private Date updateDate = new Date();
    private String unit = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public long getProvider() {
        return provider;
    }

    public void setProvider(long provider) {
        this.provider = provider;
    }

    public long getCost_price() {
        return cost_price;
    }

    public void setCost_price(long cost_price) {
        this.cost_price = cost_price;
    }

    public long getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(long selling_price) {
        this.selling_price = selling_price;
    }

    public long getShelf() {
        return shelf;
    }

    public void setShelf(long shelf) {
        this.shelf = shelf;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public long getAlert() {
        return alert;
    }

    public void setAlert(long alert) {
        this.alert = alert;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
