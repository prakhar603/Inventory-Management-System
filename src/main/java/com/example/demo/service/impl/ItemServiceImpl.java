package com.example.demo.service.impl;

import com.example.demo.entity.Item;
import com.example.demo.repo.ItemRepository;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItemById(Long id, Item itemDetails) {
        Item item = itemRepository.findById(id).orElse(null);

        if(item == null) {
            throw new RuntimeException("Item not found");
        }

        item.setName(itemDetails.getName());
        item.setPrice(itemDetails.getPrice());
        item.setQuantity(itemDetails.getQuantity());
        item.setCategory(itemDetails.getCategory());
        item.setDescription(itemDetails.getDescription());
        item = itemRepository.save(item);

        return item;
    }

    @Override
    public Optional<Item> getItemById(long id) {
        return itemRepository.findById(id);
    }

    @Override
    public void deleteItemById(long id) {
        itemRepository.deleteById(id);
    }

//    @Override
//    public List<Item> getItemsByCategoryName(String category) {
//        return categoryRepo.findByCategory(category);
//    }

//    @Override
//    public void adjustPrices(String categoryName, double percentage) {
//        List<Item> items = itemRepository.findByCategoryName(categoryName);
//        for(Item item : items) {
//            item.setPrice(item.getPrice() * (1+  percentage/100));
//        }
//        itemRepository.saveAll(items);
//    }

//    @Override
//    public List<Item> getItemsByCategoryName(String categoryName) {
//        return itemRepository.findByCategoryName(categoryName);
//    }
}
