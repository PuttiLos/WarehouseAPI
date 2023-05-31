package com.puttimait.WarehouseApi.Controller;

import com.puttimait.WarehouseApi.BIZ.ItemBiz;
import com.puttimait.WarehouseApi.DTO.ItemReq;
import com.puttimait.WarehouseApi.DTO.ItemRes;
import com.puttimait.WarehouseApi.data.Item;
import com.puttimait.WarehouseApi.DTO.ItemDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ItemRes getItemWithCriteria(@RequestBody ItemReq req){
        return this.itemBiz.getItemsWithCriteria(req);
    }



    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public long addOne(@RequestBody List<ItemDTO> req){
        return this.itemBiz.addItems(req);
    }
}
