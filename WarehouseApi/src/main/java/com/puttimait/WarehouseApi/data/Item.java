package com.puttimait.WarehouseApi.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ALTERNATE_NAME")
    private String alternateName;
    @Column(name = "PROVIDER")
    private long provider;
    @Column(name = "COST_PRICE")
    private long costPrice;
    @Column(name = "SELLING_PRICE")
    private long sellingPrice;
    @Column(name = "SHELF")
    private long shelf;
    @Column(name = "STOCK")
    private long stock;
    @Column(name = "ALERT")
    private long alert;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    @Column(name = "UNIT")
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(long costPrice) {
        this.costPrice = costPrice;
    }

    public long getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(long sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alternateName='" + alternateName + '\'' +
                ", provider=" + provider +
                ", costPrice=" + costPrice +
                ", sellingPrice=" + sellingPrice +
                ", shelf=" + shelf +
                ", stock=" + stock +
                ", alert=" + alert +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", unit='" + unit + '\'' +
                '}';
    }
}
