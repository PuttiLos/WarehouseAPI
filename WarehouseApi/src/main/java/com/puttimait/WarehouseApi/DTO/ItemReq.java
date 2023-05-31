package com.puttimait.WarehouseApi.DTO;

public class ItemReq {
    private int pageSize = 10;
    private int pageIndex = 0;
    private ItemCriteriaReq criteria;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ItemCriteriaReq getCriteria() {
        return criteria;
    }

    public void setCriteria(ItemCriteriaReq criteria) {
        this.criteria = criteria;
    }
}
