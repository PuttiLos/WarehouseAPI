package com.puttimait.WarehouseApi.Controller;

import com.puttimait.WarehouseApi.BIZ.ItemBiz;
import com.puttimait.WarehouseApi.data.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    private final ItemBiz itemBiz;

    public ItemController(ItemBiz itemBiz) {
        this.itemBiz = itemBiz;
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Item> getAll() {
        return this.itemBiz.getAll();
    }
}
