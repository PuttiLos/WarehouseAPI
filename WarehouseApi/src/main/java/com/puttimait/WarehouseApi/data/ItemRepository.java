package com.puttimait.WarehouseApi.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long>, PagingAndSortingRepository<Item, Long> {
    Page<Item> queryItemByNameContainsIgnoreCaseOrAlternateNameContainingIgnoreCase (String name, String alternatename, Pageable pageable);
    long countItemsByNameContainingIgnoreCaseOrAlternateNameContainingIgnoreCase(String name, String alternatename);

}
