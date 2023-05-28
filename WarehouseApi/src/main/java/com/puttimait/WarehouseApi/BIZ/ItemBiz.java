package com.puttimait.WarehouseApi.BIZ;

import com.puttimait.WarehouseApi.data.Item;
import com.puttimait.WarehouseApi.data.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemBiz {
    private final ItemRepository itemRepository;

    public ItemBiz(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> getAll(){
        ArrayList<Item> res = new ArrayList<>();
        this.itemRepository.findAll().forEach(item -> res.add(item));
        return res;
    }
}
