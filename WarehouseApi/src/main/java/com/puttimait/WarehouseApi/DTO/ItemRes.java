package com.puttimait.WarehouseApi.DTO;

import java.util.List;

public class ItemRes {
    private long total = 0;
    private List<ItemDTO> items;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }
}
