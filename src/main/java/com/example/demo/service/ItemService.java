package com.example.demo.service;

import com.example.demo.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item addItem(Item item);
    Item updateItemById(Long id, Item item);
    Optional<Item> getItemById(long id);
    void deleteItemById(long id);
//    void adjustPrices(String categoryName, double percentage);
//    List<Item> getItemsByCategoryName(String categoryName);

}
