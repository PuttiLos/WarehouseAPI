package com.puttimait.WarehouseApi.BIZ;

import com.puttimait.WarehouseApi.data.Item;
import com.puttimait.WarehouseApi.data.ItemDTO;
import com.puttimait.WarehouseApi.data.ItemRepository;
import org.modelmapper.ModelMapper;
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

    public long addItems(List<ItemDTO> req){
        int success = 0;
        for (int i = 0 ; i < req.size(); ++i){
            try {
                Item new_item = new ModelMapper().map(req.get(i),Item.class);
                this.itemRepository.save(new_item);
                success += 1;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        return success;
    }
}
